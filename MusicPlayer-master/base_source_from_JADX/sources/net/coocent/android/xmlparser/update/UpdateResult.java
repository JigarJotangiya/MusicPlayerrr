package net.coocent.android.xmlparser.update;

import androidx.annotation.Keep;
import com.google.gson.p252a.C6485c;

@Keep
public class UpdateResult {
    @C6485c("must_update")
    private boolean mForceUpdate;
    @C6485c("message")
    private String mMessage;
    @C6485c("below_version_code")
    private int mMinVersionCode;
    @C6485c("new_app_package")
    private String mNewPackageName;

    public String getMessage() {
        return this.mMessage;
    }

    public int getMinVersionCode() {
        return this.mMinVersionCode;
    }

    public String getNewPackageName() {
        return this.mNewPackageName;
    }

    public boolean isForceUpdate() {
        return this.mForceUpdate;
    }

    public void setForceUpdate(boolean z) {
        this.mForceUpdate = z;
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setMinVersionCode(int i) {
        this.mMinVersionCode = i;
    }

    public void setNewPackageName(String str) {
        this.mNewPackageName = str;
    }
}
