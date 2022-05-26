package coocent.music.player.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;
import net.coocent.android.xmlparser.activity.AbstractLaunchActivity;
import p342g.p343a.p344a.p358i.C8337n;

public class LaunchActivity extends AbstractLaunchActivity {
    /* access modifiers changed from: protected */
    /* renamed from: h2 */
    public int mo26638h2() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k2 */
    public Class mo26639k2() {
        return C8337n.m46065k0(this).mo30155U0() ? SkinChangeActivity.class : LibraryActivity.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n2 */
    public void mo26640n2() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
    }
}
