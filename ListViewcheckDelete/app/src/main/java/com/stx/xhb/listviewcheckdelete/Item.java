package com.stx.xhb.listviewcheckdelete;

/**
 * 子布局控件属性实体类
 * Created by xhb on 2015/12/19.
 */
public class Item {
    private String name;
    private String phone;
    private Boolean checked;

    public Item(String name, String phone,Boolean checked) {
        this.name = name;
        this.phone = phone;
        this.checked = checked;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
}
