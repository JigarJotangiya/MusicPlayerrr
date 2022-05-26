package p082e.p122i.p123a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.i.a.c */
/* compiled from: ResourceCursorAdapter */
public abstract class C3799c extends C3794a {

    /* renamed from: o */
    private int f11876o;

    /* renamed from: p */
    private int f11877p;

    /* renamed from: q */
    private LayoutInflater f11878q;

    @Deprecated
    public C3799c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f11877p = i;
        this.f11876o = i;
        this.f11878q = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: p */
    public View mo13246p(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f11878q.inflate(this.f11877p, viewGroup, false);
    }

    /* renamed from: q */
    public View mo1931q(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f11878q.inflate(this.f11876o, viewGroup, false);
    }
}
