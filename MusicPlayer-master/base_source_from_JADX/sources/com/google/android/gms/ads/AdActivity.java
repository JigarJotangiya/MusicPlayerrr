package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.xe0;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdActivity extends Activity {

    /* renamed from: g */
    private xe0 f9668g;

    /* renamed from: a */
    private final void m12834a() {
        xe0 xe0 = this.f9668g;
        if (xe0 != null) {
            try {
                xe0.mo10892t();
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10876b3(i, i2, intent);
            }
        } catch (Exception e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public final void onBackPressed() {
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null && !xe0.mo10868F()) {
                return;
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            xe0 xe02 = this.f9668g;
            if (xe02 != null) {
                xe02.mo10878e();
            }
        } catch (RemoteException e2) {
            ul0.m31864i("#007 Could not call remote method.", e2);
        }
    }

    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10873Y(C4865b.m20503f2(configuration));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        xe0 k = C4980cv.m22122a().mo15970k(this);
        this.f9668g = k;
        if (k != null) {
            try {
                k.mo10872U4(bundle);
            } catch (RemoteException e) {
                ul0.m31864i("#007 Could not call remote method.", e);
                finish();
            }
        } else {
            ul0.m31864i("#007 Could not call remote method.", (Throwable) null);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10882j();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10885k();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onRestart() {
        super.onRestart();
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10887l();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.zzp();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10870K(bundle);
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.zzr();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.zzs();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    /* access modifiers changed from: protected */
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            xe0 xe0 = this.f9668g;
            if (xe0 != null) {
                xe0.mo10891n();
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    public final void setContentView(int i) {
        super.setContentView(i);
        m12834a();
    }

    public final void setContentView(@RecentlyNonNull View view) {
        super.setContentView(view);
        m12834a();
    }

    public final void setContentView(@RecentlyNonNull View view, @RecentlyNonNull ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m12834a();
    }
}
