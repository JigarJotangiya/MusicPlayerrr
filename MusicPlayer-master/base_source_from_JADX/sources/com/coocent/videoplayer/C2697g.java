package com.coocent.videoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.OrientationEventListener;
import p369i.p387z.p389d.C8594l;

@SuppressLint({"SourceLockedOrientationActivity"})
/* renamed from: com.coocent.videoplayer.g */
/* compiled from: OrientationHelper.kt */
public final class C2697g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Activity f9243a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f9244b = true;

    /* renamed from: c */
    private boolean f9245c = true;

    /* renamed from: d */
    private final C2698a f9246d;

    /* renamed from: com.coocent.videoplayer.g$a */
    /* compiled from: OrientationHelper.kt */
    public static final class C2698a extends OrientationEventListener {

        /* renamed from: a */
        final /* synthetic */ C2697g f9247a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2698a(C2697g gVar, Activity activity) {
            super(activity);
            this.f9247a = gVar;
        }

        public void onOrientationChanged(int i) {
            boolean z = false;
            if (!(70 <= i && i <= 110)) {
                if (!(161 <= i && i <= 200)) {
                    if (!(251 <= i && i <= 290)) {
                        if ((340 <= i && i <= 360) || (i >= 0 && i <= 19)) {
                            z = true;
                        }
                        if (z && !this.f9247a.f9244b) {
                            this.f9247a.f9243a.setRequestedOrientation(1);
                            this.f9247a.f9244b = true;
                        }
                    } else if (this.f9247a.f9244b) {
                        this.f9247a.f9243a.setRequestedOrientation(0);
                        this.f9247a.f9244b = false;
                    }
                } else if (!this.f9247a.f9244b) {
                    this.f9247a.f9243a.setRequestedOrientation(10);
                    this.f9247a.f9244b = true;
                }
            } else if (this.f9247a.f9244b) {
                this.f9247a.f9243a.setRequestedOrientation(8);
                this.f9247a.f9244b = false;
            }
        }
    }

    public C2697g(Activity activity) {
        C8594l.m46771e(activity, "mActivity");
        this.f9243a = activity;
        this.f9246d = new C2698a(this, activity);
    }

    /* renamed from: d */
    public final void mo10240d() {
        this.f9245c = false;
        this.f9246d.disable();
    }

    /* renamed from: e */
    public final void mo10241e() {
        this.f9245c = true;
        this.f9246d.enable();
    }

    /* renamed from: f */
    public final boolean mo10242f() {
        return this.f9245c;
    }

    /* renamed from: g */
    public final boolean mo10243g() {
        return this.f9244b;
    }

    /* renamed from: h */
    public final void mo10244h(boolean z) {
        this.f9244b = z;
    }
}
