package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0125a;
import androidx.appcompat.widget.C0294l0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0466a;
import androidx.core.app.C0480e;
import androidx.core.app.C0502n;
import androidx.fragment.app.FragmentActivity;
import p082e.p083a.p090o.C3432b;

public class AppCompatActivity extends FragmentActivity implements C0135d, C0502n.C0503a, C0125a.C0128c {

    /* renamed from: x */
    private C0136e f347x;

    /* renamed from: y */
    private Resources f348y;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* renamed from: X1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m530X1(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.m530X1(android.view.KeyEvent):boolean");
    }

    /* renamed from: F0 */
    public C3432b mo466F0(C3432b.C3433a aVar) {
        return null;
    }

    /* renamed from: L */
    public void mo467L(C3432b bVar) {
    }

    /* renamed from: N */
    public C0125a.C0127b mo468N() {
        return mo470Q1().mo542k();
    }

    /* renamed from: P1 */
    public void mo469P1() {
        mo470Q1().mo550p();
    }

    /* renamed from: Q1 */
    public C0136e mo470Q1() {
        if (this.f347x == null) {
            this.f347x = C0136e.m727g(this, this);
        }
        return this.f347x;
    }

    /* renamed from: R1 */
    public ActionBar mo471R1() {
        return mo470Q1().mo546n();
    }

    /* renamed from: S */
    public void mo472S(C3432b bVar) {
    }

    /* renamed from: S1 */
    public void mo473S1(C0502n nVar) {
        nVar.mo3254p(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public void mo474T1(int i) {
    }

    /* renamed from: U1 */
    public void mo475U1(C0502n nVar) {
    }

    @Deprecated
    /* renamed from: V1 */
    public void mo476V1() {
    }

    /* renamed from: W1 */
    public boolean mo477W1() {
        Intent q0 = mo504q0();
        if (q0 == null) {
            return false;
        }
        if (mo484c2(q0)) {
            C0502n t = C0502n.m3133t(this);
            mo473S1(t);
            mo475U1(t);
            t.mo3256u();
            try {
                C0466a.m2983j(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo480a2(q0);
            return true;
        }
    }

    /* renamed from: Y1 */
    public void mo478Y1(Toolbar toolbar) {
        mo470Q1().mo516G(toolbar);
    }

    /* renamed from: Z1 */
    public C3432b mo479Z1(C3432b.C3433a aVar) {
        return mo470Q1().mo520J(aVar);
    }

    /* renamed from: a2 */
    public void mo480a2(Intent intent) {
        C0480e.m3012e(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo470Q1().mo535d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo470Q1().mo537f(context));
    }

    /* renamed from: b2 */
    public boolean mo483b2(int i) {
        return mo470Q1().mo510B(i);
    }

    /* renamed from: c2 */
    public boolean mo484c2(Intent intent) {
        return C0480e.m3013f(this, intent);
    }

    public void closeOptionsMenu() {
        ActionBar R1 = mo471R1();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (R1 == null || !R1.mo407f()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar R1 = mo471R1();
        if (keyCode != 82 || R1 == null || !R1.mo417p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(int i) {
        return mo470Q1().mo539i(i);
    }

    public MenuInflater getMenuInflater() {
        return mo470Q1().mo545m();
    }

    public Resources getResources() {
        if (this.f348y == null && C0294l0.m1754c()) {
            this.f348y = new C0294l0(this, super.getResources());
        }
        Resources resources = this.f348y;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo470Q1().mo550p();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f348y != null) {
            this.f348y.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo470Q1().mo551r(configuration);
    }

    public void onContentChanged() {
        mo476V1();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C0136e Q1 = mo470Q1();
        Q1.mo547o();
        Q1.mo553s(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo470Q1().mo555t();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m530X1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar R1 = mo471R1();
        if (menuItem.getItemId() != 16908332 || R1 == null || (R1.mo410i() & 4) == 0) {
            return false;
        }
        return mo477W1();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo470Q1().mo557u(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo470Q1().mo559v();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo470Q1().mo560w(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo470Q1().mo562x();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo470Q1().mo564y();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo470Q1().mo518I(charSequence);
    }

    public void openOptionsMenu() {
        ActionBar R1 = mo471R1();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (R1 == null || !R1.mo418q()) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: q0 */
    public Intent mo504q0() {
        return C0480e.m3008a(this);
    }

    public void setContentView(int i) {
        mo470Q1().mo512D(i);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        mo470Q1().mo517H(i);
    }

    public void setContentView(View view) {
        mo470Q1().mo514E(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo470Q1().mo515F(view, layoutParams);
    }
}
