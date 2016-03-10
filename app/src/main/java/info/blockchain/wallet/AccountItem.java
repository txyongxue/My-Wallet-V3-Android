package info.blockchain.wallet;

import android.graphics.drawable.Drawable;

public class AccountItem {

    String title;
    Drawable icon;
    String amount;
    boolean isArchived;
    boolean isWatchOnly;
    boolean isDefault;

    public AccountItem(String title, String amount, Drawable icon, boolean isArchived, boolean isWatchOnly, boolean isDefault) {
        this.title = title;
        this.amount = amount;
        this.icon = icon;
        this.isArchived = isArchived;
        this.isWatchOnly = isWatchOnly;
        this.isDefault = isDefault;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getIcon() {
        return icon;
    }

    public String getAmount() {
        return amount;
    }

    public boolean isArchived() {
        return isArchived;
    }

    public void setIsArchived(boolean isArchived) {
        this.isArchived = isArchived;
    }

    public boolean isWatchOnly() {
        return isWatchOnly;
    }

    public void setIsWatchOnly(boolean isWatchOnly) {
        this.isWatchOnly = isWatchOnly;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}