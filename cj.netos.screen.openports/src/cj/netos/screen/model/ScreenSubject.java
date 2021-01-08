package cj.netos.screen.model;

/**
 * Table: screen_subject
 */
public class ScreenSubject {
    /**
     * Column: id
     */
    private String id;

    /**
     * Column: title
     * Remark: 用于在弹屏中显示项
     */
    private String title;

    /**
     * Column: sub_title
     * Remark: 次标题
     */
    private String subTitle;

    /**
     * Column: href
     * Remark: 打开h5超链接
     */
    private String href;

    /**
     * Column: creator
     * Remark: 创建人
     */
    private String creator;

    /**
     * Column: sort
     * Remark: 排序，0-5保留为主屏低下展示，6-n是更多
     */
    private Long sort;

    /**
     * Column: ctime
     * Remark: 创建时间
     */
    private Long ctime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
}