package p082e.p109h.p116m;

import android.os.Handler;
import android.os.Looper;

/* renamed from: e.h.m.b */
/* compiled from: CalleeHandler */
class C3660b {
    /* renamed from: a */
    static Handler m15722a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
