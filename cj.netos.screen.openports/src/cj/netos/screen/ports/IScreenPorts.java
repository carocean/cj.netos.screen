package cj.netos.screen.ports;

import cj.netos.screen.model.PopupRule;
import cj.netos.screen.model.ScreenSubject;
import cj.netos.screen.result.ScreenResult;
import cj.studio.ecm.net.CircuitException;
import cj.studio.openport.IOpenportService;
import cj.studio.openport.ISecuritySession;
import cj.studio.openport.PKeyInRequest;
import cj.studio.openport.annotations.CjOpenport;
import cj.studio.openport.annotations.CjOpenportParameter;
import cj.studio.openport.annotations.CjOpenports;

import java.util.List;

@CjOpenports(usage = "运营弹屏服务")
public interface IScreenPorts extends IOpenportService {
    @CjOpenport(usage = "创建弹屏主体", command = "post")
    void createSubject(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "标题", name = "title") String title,
                       @CjOpenportParameter(usage = "副标题", name = "subTitle") String subTitle,
                       @CjOpenportParameter(usage = "图标", name = "leading") String leading,
                       @CjOpenportParameter(usage = "超链接，一般是h5", name = "href", in = PKeyInRequest.content) String href
    ) throws CircuitException;

    @CjOpenport(usage = "更新主体", command = "post")
    void updateSubject(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "主体标识", name = "id") String id,
                       @CjOpenportParameter(usage = "标题", name = "title") String title,
                       @CjOpenportParameter(usage = "副标题", name = "subTitle") String subTitle,
                       @CjOpenportParameter(usage = "图标", name = "leading") String leading,
                       @CjOpenportParameter(usage = "超链接，一般是h5", name = "href", in = PKeyInRequest.content) String href
    ) throws CircuitException;

    @CjOpenport(usage = "更新弹窗规则参数", command = "post")
    void updatePopupRuleArgs(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "标识", name = "code") String code,
                       @CjOpenportParameter(usage = "参数", name = "args",in = PKeyInRequest.content) String args
    ) throws CircuitException;

    @CjOpenport(usage = "移除主体")
    void removeSubject(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "主体标识", name = "id") String id
    ) throws CircuitException;

    @CjOpenport(usage = "主体上移")
    void moveUpSubject(ISecuritySession securitySession,
                       @CjOpenportParameter(usage = "主体标识", name = "id") String id
    ) throws CircuitException;

    @CjOpenport(usage = "主体下移")
    void moveDownSubject(ISecuritySession securitySession,
                         @CjOpenportParameter(usage = "主体标识", name = "id") String id
    ) throws CircuitException;

    @CjOpenport(usage = "分页主体")
    List<ScreenSubject> pageSubject(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "分页", name = "limit") int limit,
            @CjOpenportParameter(usage = "页码", name = "offset") long offset
    ) throws CircuitException;

    @CjOpenport(usage = "当前弹屏")
    ScreenResult getCurrent(
            ISecuritySession securitySession
    ) throws CircuitException;

    @CjOpenport(usage = "清除弹屏")
    void clearScreen(
            ISecuritySession securitySession
    ) throws CircuitException;

    @CjOpenport(usage = "上架主体")
    void putOnScreen(
            ISecuritySession securitySession,
            @CjOpenportParameter(usage = "主体标识", name = "subject") String subject,
            @CjOpenportParameter(usage = "弹屏规则", name = "popupRule") String popupRule
    ) throws CircuitException;

    @CjOpenport(usage = "列出弹屏规则")
    List<PopupRule> listPopupRule(
            ISecuritySession securitySession
    ) throws CircuitException;
}
