package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0718v;
import androidx.lifecycle.C0720x;
import androidx.lifecycle.ReportFragment;
import p082e.p098e.C3478g;
import p082e.p109h.p119p.C3755f;

public class ComponentActivity extends Activity implements C0718v, C3755f.C3756a {

    /* renamed from: g */
    private C0720x f2517g = new C0720x(this);

    public ComponentActivity() {
        new C3478g();
    }

    /* renamed from: Z0 */
    public boolean mo662Z0(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C3755f.m16084d(decorView, keyEvent)) {
            return C3755f.m16085e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C3755f.m16084d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.m4167g(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f2517g.mo4269j(C0697n.C0700c.CREATED);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: v */
    public C0697n mo390v() {
        return this.f2517g;
    }
}
