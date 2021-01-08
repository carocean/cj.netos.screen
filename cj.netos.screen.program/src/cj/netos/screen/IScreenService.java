package cj.netos.screen;

import cj.netos.screen.model.CurrentScreen;
import cj.netos.screen.model.PopupRule;
import cj.netos.screen.model.ScreenSubject;

import java.util.List;

public interface IScreenService {
    final static String _KEY_SCREEN_ID="820832983u8jehf8238jje2389";
    long getMaxSortOfSubject();

    void createSubject(ScreenSubject screenSubject);

    void removeSubject(String id);

    List<ScreenSubject> pageSubject(int limit, long offset);

    CurrentScreen getCurrentScreen();

    PopupRule getPopupRule(String useRule);

    ScreenSubject getScreenSubject(String showSubject);

    boolean existsSubject(String subject);

    boolean existsPopupRule(String popupRule);

    void putOnScreen(String principal, String subject, String popupRule);

    List<PopupRule> listPopupRule();

    void clearScreen();

    void moveUpSubject(String id);

    void moveDownSubject(String id);

    void updateSubject(String id, String title, String subTitle,String leading, String href);

}
