package com.coocent.colorpicker.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.colorpicker.utils.a */
/* compiled from: TypeUtil.kt */
public final class C2221a {

    /* renamed from: a */
    public static final C2222a f7456a = new C2222a((C8589g) null);

    /* renamed from: com.coocent.colorpicker.utils.a$a */
    /* compiled from: TypeUtil.kt */
    public static final class C2222a {
        private C2222a() {
        }

        /* renamed from: a */
        public final void mo8783a(View view, Object obj) {
            C8594l.m46771e(view, "view");
            C8594l.m46771e(obj, "res");
            if (obj instanceof Drawable) {
                view.setBackground((Drawable) obj);
            } else if (obj instanceof Integer) {
                view.setBackgroundResource(((Number) obj).intValue());
            }
        }

        public /* synthetic */ C2222a(C8589g gVar) {
            this();
        }
    }
}
