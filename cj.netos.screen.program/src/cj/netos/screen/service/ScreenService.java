package cj.netos.screen.service;

import cj.netos.screen.IScreenService;
import cj.netos.screen.mapper.CurrentScreenMapper;
import cj.netos.screen.mapper.PopupRuleMapper;
import cj.netos.screen.mapper.ScreenSubjectMapper;
import cj.netos.screen.model.*;
import cj.studio.ecm.annotation.CjBridge;
import cj.studio.ecm.annotation.CjService;
import cj.studio.ecm.annotation.CjServiceRef;
import cj.studio.orm.mybatis.annotation.CjTransaction;

import java.util.List;

@CjBridge(aspects = "@transaction")
@CjService(name = "screenService")
public class ScreenService implements IScreenService {
    @CjServiceRef(refByName = "mybatis.cj.netos.screen.mapper.CurrentScreenMapper")
    CurrentScreenMapper currentScreenMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.screen.mapper.PopupRuleMapper")
    PopupRuleMapper popupRuleMapper;
    @CjServiceRef(refByName = "mybatis.cj.netos.screen.mapper.ScreenSubjectMapper")
    ScreenSubjectMapper screenSubjectMapper;

    @CjTransaction
    @Override
    public long getMaxSortOfSubject() {
        return screenSubjectMapper.getMaxSort();
    }

    @CjTransaction
    @Override
    public void createSubject(ScreenSubject screenSubject) {
        screenSubjectMapper.insert(screenSubject);
    }

    @CjTransaction
    @Override
    public void removeSubject(String id) {
        screenSubjectMapper.deleteByPrimaryKey(id);
    }

    @CjTransaction
    @Override
    public void moveUpSubject(String id) {
        ScreenSubject screenSubject = screenSubjectMapper.selectByPrimaryKey(id);
        if (screenSubject == null) {
            return;
        }
        screenSubject.setSort(screenSubject.getSort() - 1);
        screenSubjectMapper.updateByPrimaryKeySelective(screenSubject);
    }

    @CjTransaction
    @Override
    public void moveDownSubject(String id) {
        ScreenSubject screenSubject = screenSubjectMapper.selectByPrimaryKey(id);
        if (screenSubject == null) {
            return;
        }
        screenSubject.setSort(screenSubject.getSort() + 1);
        screenSubjectMapper.updateByPrimaryKeySelective(screenSubject);
    }

    @CjTransaction
    @Override
    public void updateSubject(String id, String title, String subTitle, String leading, String href) {
        ScreenSubject screenSubject = screenSubjectMapper.selectByPrimaryKey(id);
        if (screenSubject == null) {
            return;
        }
        screenSubject.setTitle(title);
        screenSubject.setSubTitle(subTitle);
        screenSubject.setHref(href);
        screenSubject.setLeading(leading);
        screenSubjectMapper.updateByPrimaryKey(screenSubject);
    }

    @CjTransaction
    @Override
    public void updatePopupRuleArgs(String code, String args) {
        PopupRule rule = popupRuleMapper.selectByPrimaryKey(code);
        if (rule == null) {
            return;
        }
        rule.setArgs(args);
        popupRuleMapper.updateByPrimaryKey(rule);
    }

    @CjTransaction
    @Override
    public List<ScreenSubject> pageSubject(int limit, long offset) {
        return screenSubjectMapper.page(limit, offset);
    }

    @CjTransaction
    @Override
    public CurrentScreen getCurrentScreen() {
        CurrentScreenExample example = new CurrentScreenExample();
        example.createCriteria();
        List<CurrentScreen> list = currentScreenMapper.selectByExample(example);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @CjTransaction
    @Override
    public void clearScreen() {
        currentScreenMapper.deleteByPrimaryKey(_KEY_SCREEN_ID);
    }

    @CjTransaction
    @Override
    public PopupRule getPopupRule(String useRule) {
        return popupRuleMapper.selectByPrimaryKey(useRule);
    }

    @CjTransaction
    @Override
    public ScreenSubject getScreenSubject(String showSubject) {
        return screenSubjectMapper.selectByPrimaryKey(showSubject);
    }

    @CjTransaction
    @Override
    public boolean existsSubject(String subject) {
        ScreenSubjectExample example = new ScreenSubjectExample();
        example.createCriteria().andIdEqualTo(subject);
        return screenSubjectMapper.countByExample(example) > 0;
    }

    @CjTransaction
    @Override
    public boolean existsPopupRule(String popupRule) {
        PopupRuleExample example = new PopupRuleExample();
        example.createCriteria().andCodeEqualTo(popupRule);
        return popupRuleMapper.countByExample(example) > 0;
    }

    @CjTransaction
    @Override
    public void putOnScreen(String principal, String subject, String popupRule) {
        CurrentScreen screen = currentScreenMapper.selectByPrimaryKey(_KEY_SCREEN_ID);
        if (screen == null) {
            screen = new CurrentScreen();
            screen.setId(_KEY_SCREEN_ID);
            screen.setShowSubject(subject);
            screen.setUseRule(popupRule);
            currentScreenMapper.insert(screen);
            return;
        }
        screen.setShowSubject(subject);
        screen.setUseRule(popupRule);
        currentScreenMapper.updateByPrimaryKeySelective(screen);
    }

    @CjTransaction
    @Override
    public List<PopupRule> listPopupRule() {
        PopupRuleExample example = new PopupRuleExample();
        example.createCriteria();
        return popupRuleMapper.selectByExample(example);
    }
}
