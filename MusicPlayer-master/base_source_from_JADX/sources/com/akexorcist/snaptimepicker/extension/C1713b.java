package com.akexorcist.snaptimepicker.extension;

import android.util.Log;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0672f0;
import androidx.lifecycle.C0718v;
import java.util.concurrent.atomic.AtomicBoolean;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.akexorcist.snaptimepicker.extension.b */
/* compiled from: TimePickedLiveData.kt */
public final class C1713b<T> extends C0670e0<T> {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final AtomicBoolean f6418l = new AtomicBoolean(false);

    /* renamed from: com.akexorcist.snaptimepicker.extension.b$a */
    /* compiled from: TimePickedLiveData.kt */
    static final class C1714a<T> implements C0672f0<T> {

        /* renamed from: a */
        final /* synthetic */ C1713b f6419a;

        /* renamed from: b */
        final /* synthetic */ C0672f0 f6420b;

        C1714a(C1713b bVar, C0672f0 f0Var) {
            this.f6419a = bVar;
            this.f6420b = f0Var;
        }

        public final void onChanged(T t) {
            if (this.f6419a.f6418l.compareAndSet(true, false)) {
                this.f6420b.onChanged(t);
            }
        }
    }

    /* renamed from: h */
    public void mo4149h(C0718v vVar, C0672f0<? super T> f0Var) {
        C8594l.m46771e(vVar, "owner");
        C8594l.m46771e(f0Var, "observer");
        if (mo4148g()) {
            Log.w("TimePickedLiveData", "Multiple observers registered but only one will be notified of changes.");
        }
        super.mo4149h(vVar, new C1714a(this, f0Var));
    }

    /* renamed from: o */
    public void mo4156o(T t) {
        this.f6418l.set(true);
        super.mo4156o(t);
    }
}
