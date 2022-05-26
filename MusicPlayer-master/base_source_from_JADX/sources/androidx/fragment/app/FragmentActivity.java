package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.C0085c;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.C0466a;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0710p0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0720x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p082e.p098e.C3479h;
import p082e.p140p.p141a.C4100a;

public class FragmentActivity extends ComponentActivity implements C0466a.C0469c, C0466a.C0471e {

    /* renamed from: n */
    final C0596e f2978n = C0596e.m3767b(new C0578a());

    /* renamed from: o */
    final C0720x f2979o = new C0720x(this);

    /* renamed from: p */
    boolean f2980p;

    /* renamed from: q */
    boolean f2981q;

    /* renamed from: r */
    boolean f2982r = true;

    /* renamed from: s */
    boolean f2983s;

    /* renamed from: t */
    boolean f2984t;

    /* renamed from: u */
    boolean f2985u;

    /* renamed from: v */
    int f2986v;

    /* renamed from: w */
    C3479h<String> f2987w;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    class C0578a extends C0598g<FragmentActivity> implements C0712q0, C0085c {
        public C0578a() {
            super(FragmentActivity.this);
        }

        /* renamed from: b */
        public View mo3725b(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        /* renamed from: c */
        public boolean mo3726c() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        /* renamed from: g */
        public void mo3753g(Fragment fragment) {
            FragmentActivity.this.mo3731K1(fragment);
        }

        /* renamed from: h */
        public void mo3754h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        /* renamed from: j */
        public LayoutInflater mo3756j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        /* renamed from: k */
        public boolean mo3757k(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        /* renamed from: l */
        public void mo3758l(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.mo3734N1(fragment, intent, i, bundle);
        }

        /* renamed from: m */
        public void mo3759m(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            FragmentActivity.this.mo3735O1(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        /* renamed from: n */
        public void mo3760n() {
            FragmentActivity.this.mo469P1();
        }

        /* renamed from: o */
        public FragmentActivity mo3755i() {
            return FragmentActivity.this;
        }

        /* renamed from: v */
        public C0697n mo390v() {
            return FragmentActivity.this.f2979o;
        }

        /* renamed from: z */
        public OnBackPressedDispatcher mo391z() {
            return FragmentActivity.this.mo391z();
        }

        /* renamed from: z0 */
        public C0710p0 mo392z0() {
            return FragmentActivity.this.mo392z0();
        }
    }

    /* renamed from: E1 */
    private int m3676E1(Fragment fragment) {
        if (this.f2987w.mo12416m() < 65534) {
            while (this.f2987w.mo12411h(this.f2986v) >= 0) {
                this.f2986v = (this.f2986v + 1) % 65534;
            }
            int i = this.f2986v;
            this.f2987w.mo12414k(i, fragment.f2940k);
            this.f2986v = (this.f2986v + 1) % 65534;
            return i;
        }
        throw new IllegalStateException("Too many pending Fragment activity results.");
    }

    /* renamed from: F1 */
    static void m3677F1(int i) {
        if ((i & -65536) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    /* renamed from: I1 */
    private void m3678I1() {
        do {
        } while (m3679J1(mo3730H1(), C0697n.C0700c.CREATED));
    }

    /* renamed from: J1 */
    private static boolean m3679J1(C0602j jVar, C0697n.C0700c cVar) {
        boolean z = false;
        for (Fragment next : jVar.mo3956h0()) {
            if (next != null) {
                if (next.mo3672i0() != null) {
                    z |= m3679J1(next.mo3642W(), cVar);
                }
                if (next.mo390v().mo4257b().isAtLeast(C0697n.C0700c.STARTED)) {
                    next.f2930W.mo4270o(cVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G1 */
    public final View mo3729G1(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2978n.mo3878w(view, str, context, attributeSet);
    }

    /* renamed from: H1 */
    public C0602j mo3730H1() {
        return this.f2978n.mo3876u();
    }

    /* renamed from: K1 */
    public void mo3731K1(Fragment fragment) {
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: L1 */
    public boolean mo3732L1(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public void mo3733M1() {
        this.f2979o.mo4268h(C0697n.C0699b.ON_RESUME);
        this.f2978n.mo3871p();
    }

    /* renamed from: N1 */
    public void mo3734N1(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        this.f2985u = true;
        if (i == -1) {
            try {
                C0466a.m2988o(this, intent, -1, bundle);
            } finally {
                this.f2985u = false;
            }
        } else {
            m3677F1(i);
            C0466a.m2988o(this, intent, ((m3676E1(fragment) + 1) << 16) + (i & 65535), bundle);
            this.f2985u = false;
        }
    }

    /* renamed from: O1 */
    public void mo3735O1(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        int i5 = i;
        this.f2984t = true;
        if (i5 == -1) {
            try {
                C0466a.m2989p(this, intentSender, i, intent, i2, i3, i4, bundle);
            } finally {
                this.f2984t = false;
            }
        } else {
            m3677F1(i);
            C0466a.m2989p(this, intentSender, ((m3676E1(fragment) + 1) << 16) + (i5 & 65535), intent, i2, i3, i4, bundle);
            this.f2984t = false;
        }
    }

    @Deprecated
    /* renamed from: P1 */
    public void mo469P1() {
        invalidateOptionsMenu();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2980p);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2981q);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2982r);
        if (getApplication() != null) {
            C4100a.m18148b(this).mo14192a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2978n.mo3876u().mo3923M(str, fileDescriptor, printWriter, strArr);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2978n.mo3877v();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String f = this.f2987w.mo12409f(i4);
            this.f2987w.mo12415l(i4);
            if (f == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f2978n.mo3875t(f);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f);
                return;
            }
            t.mo3662e1(i & 65535, i2, intent);
            return;
        }
        C0466a.C0470d k = C0466a.m2984k();
        if (k == null || !k.mo3156a(this, i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2978n.mo3877v();
        this.f2978n.mo3859d(configuration);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f2978n.mo3857a((Fragment) null);
        if (bundle != null) {
            this.f2978n.mo3879x(bundle.getParcelable("android:support:fragments"));
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f2986v = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f2987w = new C3479h<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f2987w.mo12414k(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f2987w == null) {
            this.f2987w = new C3479h<>();
            this.f2986v = 0;
        }
        super.onCreate(bundle);
        this.f2979o.mo4268h(C0697n.C0699b.ON_CREATE);
        this.f2978n.mo3861f();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.f2978n.mo3862g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View G1 = mo3729G1(view, str, context, attributeSet);
        return G1 == null ? super.onCreateView(view, str, context, attributeSet) : G1;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f2978n.mo3863h();
        this.f2979o.mo4268h(C0697n.C0699b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f2978n.mo3864i();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f2978n.mo3866k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f2978n.mo3860e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.f2978n.mo3865j(z);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2978n.mo3877v();
    }

    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2978n.mo3867l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f2981q = false;
        this.f2978n.mo3868m();
        this.f2979o.mo4268h(C0697n.C0699b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.f2978n.mo3869n(z);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo3733M1();
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return mo3732L1(view, menu) | this.f2978n.mo3870o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2978n.mo3877v();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String f = this.f2987w.mo12409f(i3);
            this.f2987w.mo12415l(i3);
            if (f == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment t = this.f2978n.mo3875t(f);
            if (t == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + f);
                return;
            }
            t.mo3620P1(i & 65535, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f2981q = true;
        this.f2978n.mo3877v();
        this.f2978n.mo3874s();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        m3678I1();
        this.f2979o.mo4268h(C0697n.C0699b.ON_STOP);
        Parcelable y = this.f2978n.mo3880y();
        if (y != null) {
            bundle.putParcelable("android:support:fragments", y);
        }
        if (this.f2987w.mo12416m() > 0) {
            bundle.putInt("android:support:next_request_index", this.f2986v);
            int[] iArr = new int[this.f2987w.mo12416m()];
            String[] strArr = new String[this.f2987w.mo12416m()];
            for (int i = 0; i < this.f2987w.mo12416m(); i++) {
                iArr[i] = this.f2987w.mo12413j(i);
                strArr[i] = this.f2987w.mo12417n(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f2982r = false;
        if (!this.f2980p) {
            this.f2980p = true;
            this.f2978n.mo3858c();
        }
        this.f2978n.mo3877v();
        this.f2978n.mo3874s();
        this.f2979o.mo4268h(C0697n.C0699b.ON_START);
        this.f2978n.mo3872q();
    }

    public void onStateNotSaved() {
        this.f2978n.mo3877v();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f2982r = true;
        m3678I1();
        this.f2978n.mo3873r();
        this.f2979o.mo4268h(C0697n.C0699b.ON_STOP);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        if (!this.f2985u && i != -1) {
            m3677F1(i);
        }
        super.startActivityForResult(intent, i);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        if (!this.f2984t && i != -1) {
            m3677F1(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    /* renamed from: y */
    public final void mo3158y(int i) {
        if (!this.f2983s && i != -1) {
            m3677F1(i);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View G1 = mo3729G1((View) null, str, context, attributeSet);
        return G1 == null ? super.onCreateView(str, context, attributeSet) : G1;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (!this.f2985u && i != -1) {
            m3677F1(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.f2984t && i != -1) {
            m3677F1(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
