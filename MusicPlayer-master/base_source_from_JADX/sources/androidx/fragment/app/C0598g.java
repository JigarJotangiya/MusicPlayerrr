package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C0466a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p082e.p109h.p118o.C3703i;

/* renamed from: androidx.fragment.app.g */
/* compiled from: FragmentHostCallback */
public abstract class C0598g<E> extends C0595d {

    /* renamed from: g */
    private final Activity f3061g;

    /* renamed from: h */
    private final Context f3062h;

    /* renamed from: i */
    private final Handler f3063i;

    /* renamed from: j */
    final C0602j f3064j;

    C0598g(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    /* renamed from: b */
    public View mo3725b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo3726c() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Activity mo3882d() {
        return this.f3061g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Context mo3883e() {
        return this.f3062h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Handler mo3884f() {
        return this.f3063i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3753g(Fragment fragment) {
    }

    /* renamed from: h */
    public void mo3754h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo3755i();

    /* renamed from: j */
    public LayoutInflater mo3756j() {
        return LayoutInflater.from(this.f3062h);
    }

    /* renamed from: k */
    public boolean mo3757k(Fragment fragment) {
        return true;
    }

    /* renamed from: l */
    public void mo3758l(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f3062h.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: m */
    public void mo3759m(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C0466a.m2989p(this.f3061g, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    /* renamed from: n */
    public void mo3760n() {
    }

    C0598g(Activity activity, Context context, Handler handler, int i) {
        this.f3064j = new C0613k();
        this.f3061g = activity;
        C3703i.m15828e(context, "context == null");
        this.f3062h = context;
        C3703i.m15828e(handler, "handler == null");
        this.f3063i = handler;
    }
}
