package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0687j0;
import androidx.lifecycle.C0695m;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0710p0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0715s;
import androidx.lifecycle.C0718v;
import androidx.lifecycle.C0720x;
import androidx.lifecycle.ReportFragment;
import androidx.savedstate.C1030a;
import androidx.savedstate.C1031b;
import androidx.savedstate.SavedStateRegistry;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements C0718v, C0712q0, C0695m, C1031b, C0085c {

    /* renamed from: h */
    private final C0720x f208h = new C0720x(this);

    /* renamed from: i */
    private final C1030a f209i = C1030a.m5982a(this);

    /* renamed from: j */
    private C0710p0 f210j;

    /* renamed from: k */
    private C0703o0.C0705b f211k;

    /* renamed from: l */
    private final OnBackPressedDispatcher f212l = new OnBackPressedDispatcher(new C0080a());

    /* renamed from: m */
    private int f213m;

    /* renamed from: androidx.activity.ComponentActivity$a */
    class C0080a implements Runnable {
        C0080a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    static final class C0081b {

        /* renamed from: a */
        Object f217a;

        /* renamed from: b */
        C0710p0 f218b;

        C0081b() {
        }
    }

    public ComponentActivity() {
        if (mo390v() != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 19) {
                mo390v().mo4256a(new C0715s() {
                    /* renamed from: c */
                    public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                        if (bVar == C0697n.C0699b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            mo390v().mo4256a(new C0715s() {
                /* renamed from: c */
                public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                    if (bVar == C0697n.C0699b.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.mo392z0().mo4264a();
                    }
                }
            });
            if (19 <= i && i <= 23) {
                mo390v().mo4256a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Deprecated
    /* renamed from: D1 */
    public Object mo383D1() {
        return null;
    }

    /* renamed from: K0 */
    public final SavedStateRegistry mo384K0() {
        return this.f209i.mo5700b();
    }

    /* renamed from: Y */
    public C0703o0.C0705b mo385Y() {
        if (getApplication() != null) {
            if (this.f211k == null) {
                this.f211k = new C0687j0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.f211k;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void onBackPressed() {
        this.f212l.mo397c();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f209i.mo5701c(bundle);
        ReportFragment.m4167g(this);
        int i = this.f213m;
        if (i != 0) {
            setContentView(i);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        C0081b bVar;
        Object D1 = mo383D1();
        C0710p0 p0Var = this.f210j;
        if (p0Var == null && (bVar = (C0081b) getLastNonConfigurationInstance()) != null) {
            p0Var = bVar.f218b;
        }
        if (p0Var == null && D1 == null) {
            return null;
        }
        C0081b bVar2 = new C0081b();
        bVar2.f217a = D1;
        bVar2.f218b = p0Var;
        return bVar2;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C0697n v = mo390v();
        if (v instanceof C0720x) {
            ((C0720x) v).mo4270o(C0697n.C0700c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f209i.mo5702d(bundle);
    }

    /* renamed from: v */
    public C0697n mo390v() {
        return this.f208h;
    }

    /* renamed from: z */
    public final OnBackPressedDispatcher mo391z() {
        return this.f212l;
    }

    /* renamed from: z0 */
    public C0710p0 mo392z0() {
        if (getApplication() != null) {
            if (this.f210j == null) {
                C0081b bVar = (C0081b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.f210j = bVar.f218b;
                }
                if (this.f210j == null) {
                    this.f210j = new C0710p0();
                }
            }
            return this.f210j;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
}
