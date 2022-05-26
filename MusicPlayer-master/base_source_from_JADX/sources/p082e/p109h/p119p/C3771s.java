package p082e.p109h.p119p;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: e.h.p.s */
/* compiled from: PointerIconCompat */
public final class C3771s {

    /* renamed from: a */
    private Object f11830a;

    private C3771s(Object obj) {
        this.f11830a = obj;
    }

    /* renamed from: b */
    public static C3771s m16145b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C3771s(PointerIcon.getSystemIcon(context, i));
        }
        return new C3771s((Object) null);
    }

    /* renamed from: a */
    public Object mo13197a() {
        return this.f11830a;
    }
}
