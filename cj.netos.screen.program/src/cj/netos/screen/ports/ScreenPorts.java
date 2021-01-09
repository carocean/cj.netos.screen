package cj.netos.screen.ports;

import cj.netos.screen.IScreenService;
import cj.netos.screen.model.CurrentScreen;
import cj.netos.screen.model.PopupRule;
import cj.netos.screen.model.ScreenSubject;
import cj.netos.screen.result.ScreenResult;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.util.Encript;

import java.util.List;
import java.util.UUID;

@CjService(name = "/screen.ports")
public class ScreenPorts implements IScreenPorts {
    @CjServiceRef
    IScreenService screenService;


    private void _checkRights(ISecuritySession securitySession) throws CircuitException {
        if (!securitySession.roleIn("platform:administrators")) {
            throw new CircuitException("800", "无权访问");
        }
    }

    @Override
    public void createSubject(ISecuritySession securitySession, String title, String subTitle, String leading,String href) throws CircuitException {
        _checkRights(securitySession);
        ScreenSubject screenSubject = new ScreenSubject();
        screenSubject.setCreator(securitySession.principal());
        screenSubject.setCtime(System.currentTimeMillis());
        screenSubject.setHref(href);
        screenSubject.setId(Encript.md5(UUID.randomUUID().toString()));
        screenSubject.setSubTitle(subTitle);
        screenSubject.setTitle(title);
        screenSubject.setLeading(leading);
        long max = screenService.getMaxSortOfSubject();
        screenSubject.setSort(max + 1);
        screenService.createSubject(screenSubject);
    }

    @Override
    public void updateSubject(ISecuritySession securitySession, String id, String title, String subTitle,String leading, String href) throws CircuitException {
        _checkRights(securitySession);
        screenService.updateSubject(id,title,subTitle,leading,href);
    }

    @Override
    public void updatePopupRuleArgs(ISecuritySession securitySession, String code, String args) throws CircuitException {
        _checkRights(securitySession);
        screenService.updatePopupRuleArgs(code,args);
    }

    @Override
    public void removeSubject(ISecuritySession securitySession, String id) throws CircuitException {
        _checkRights(securitySession);
        screenService.removeSubject(id);
    }

    @Override
    public void moveUpSubject(ISecuritySession securitySession, String id) throws CircuitException {
        _checkRights(securitySession);
        screenService.moveUpSubject(id);
    }

    @Override
    public void moveDownSubject(ISecuritySession securitySession, String id) throws CircuitException {
        _checkRights(securitySession);
        screenService.moveDownSubject(id);
    }

    @Override
    public List<ScreenSubject> pageSubject(ISecuritySession securitySession, int limit, long offset) throws CircuitException {
        return screenService.pageSubject(limit, offset);
    }

    @Override
    public ScreenResult getCurrent(ISecuritySession securitySession) throws CircuitException {
        CurrentScreen currentScreen = screenService.getCurrentScreen();
        if (currentScreen == null) {
            return null;
        }
        PopupRule rule = screenService.getPopupRule(currentScreen.getUseRule());
        ScreenSubject screenSubject = screenService.getScreenSubject(currentScreen.getShowSubject());
        ScreenResult result = new ScreenResult();
        result.setRule(rule);
        result.setSubject(screenSubject);
        return result;
    }

    @Override
    public void putOnScreen(ISecuritySession securitySession, String subject, String popupRule) throws CircuitException {
        _checkRights(securitySession);
        if (!screenService.existsSubject(subject)) {
            throw new CircuitException("404",String.format("主体标识不存在:%s",subject));
        }
        if (!screenService.existsPopupRule(popupRule)) {
            throw new CircuitException("404",String.format("弹屏规则不存在:%s",subject));
        }
        screenService.putOnScreen(securitySession.principal(),subject,popupRule);
    }

    @Override
    public List<PopupRule> listPopupRule(ISecuritySession securitySession) throws CircuitException {
        return screenService.listPopupRule();
    }

    @Override
    public void clearScreen(ISecuritySession securitySession) throws CircuitException {
        _checkRights(securitySession);
         screenService.clearScreen();
    }
}
