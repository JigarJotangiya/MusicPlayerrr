package com.google.android.gms.common.api.internal;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p082e.p098e.C3465a;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class zzb extends Fragment implements C3185g {

    /* renamed from: g */
    private final Map<String, LifecycleCallback> f10481g = Collections.synchronizedMap(new C3465a());

    static {
        new WeakHashMap();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f10481g.values()) {
            a.mo11539a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback b : this.f10481g.values()) {
            b.mo11540b(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry next : this.f10481g.entrySet()) {
            ((LifecycleCallback) next.getValue()).mo11541c(bundle != null ? bundle.getBundle((String) next.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        for (LifecycleCallback d : this.f10481g.values()) {
            d.mo11542d();
        }
    }

    public final void onResume() {
        super.onResume();
        for (LifecycleCallback e : this.f10481g.values()) {
            e.mo11543e();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f10481g.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo11544f(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        for (LifecycleCallback g : this.f10481g.values()) {
            g.mo11545g();
        }
    }

    public final void onStop() {
        super.onStop();
        for (LifecycleCallback h : this.f10481g.values()) {
            h.mo11546h();
        }
    }
}
