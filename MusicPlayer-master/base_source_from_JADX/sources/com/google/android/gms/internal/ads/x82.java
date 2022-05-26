package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x82<T> {

    /* renamed from: a */
    private final ht1 f25714a;

    /* renamed from: b */
    private final r22 f25715b;

    /* renamed from: c */
    private final v62<T> f25716c;

    /* renamed from: d */
    private final CopyOnWriteArraySet<w72<T>> f25717d;

    /* renamed from: e */
    private final ArrayDeque<Runnable> f25718e;

    /* renamed from: f */
    private final ArrayDeque<Runnable> f25719f;

    /* renamed from: g */
    private boolean f25720g;

    public x82(Looper looper, ht1 ht1, v62<T> v62) {
        this(new CopyOnWriteArraySet(), looper, ht1, v62);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m33602g(x82 x82, Message message) {
        Iterator<w72<T>> it = x82.f25717d.iterator();
        while (it.hasNext()) {
            it.next().mo21739b(x82.f25716c);
            if (x82.f25715b.mo20561z(0)) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final x82<T> mo21987a(Looper looper, v62<T> v62) {
        return new x82<>(this.f25717d, looper, this.f25714a, v62);
    }

    /* renamed from: b */
    public final void mo21988b(T t) {
        if (!this.f25720g) {
            Objects.requireNonNull(t);
            this.f25717d.add(new w72(t));
        }
    }

    /* renamed from: c */
    public final void mo21989c() {
        if (!this.f25719f.isEmpty()) {
            if (!this.f25715b.mo20561z(0)) {
                r22 r22 = this.f25715b;
                r22.mo20558f(r22.mo20555c(0));
            }
            boolean isEmpty = this.f25718e.isEmpty();
            this.f25718e.addAll(this.f25719f);
            this.f25719f.clear();
            if (!(!isEmpty)) {
                while (!this.f25718e.isEmpty()) {
                    this.f25718e.peekFirst().run();
                    this.f25718e.removeFirst();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo21990d(int i, u52<T> u52) {
        this.f25719f.add(new t42(new CopyOnWriteArraySet(this.f25717d), i, u52));
    }

    /* renamed from: e */
    public final void mo21991e() {
        Iterator<w72<T>> it = this.f25717d.iterator();
        while (it.hasNext()) {
            it.next().mo21740c(this.f25716c);
        }
        this.f25717d.clear();
        this.f25720g = true;
    }

    /* renamed from: f */
    public final void mo21992f(T t) {
        Iterator<w72<T>> it = this.f25717d.iterator();
        while (it.hasNext()) {
            w72 next = it.next();
            if (next.f25258a.equals(t)) {
                next.mo21740c(this.f25716c);
                this.f25717d.remove(next);
            }
        }
    }

    private x82(CopyOnWriteArraySet<w72<T>> copyOnWriteArraySet, Looper looper, ht1 ht1, v62<T> v62) {
        this.f25714a = ht1;
        this.f25717d = copyOnWriteArraySet;
        this.f25716c = v62;
        this.f25718e = new ArrayDeque<>();
        this.f25719f = new ArrayDeque<>();
        this.f25715b = ht1.mo18209a(looper, new s32(this));
    }
}
