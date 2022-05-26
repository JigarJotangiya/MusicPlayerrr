package androidx.core.app;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.core.app.k */
/* compiled from: Person */
public class C0499k {

    /* renamed from: a */
    CharSequence f2679a;

    /* renamed from: b */
    IconCompat f2680b;

    /* renamed from: c */
    String f2681c;

    /* renamed from: d */
    String f2682d;

    /* renamed from: e */
    boolean f2683e;

    /* renamed from: f */
    boolean f2684f;

    /* renamed from: a */
    public IconCompat mo3234a() {
        return this.f2680b;
    }

    /* renamed from: b */
    public String mo3235b() {
        return this.f2682d;
    }

    /* renamed from: c */
    public CharSequence mo3236c() {
        return this.f2679a;
    }

    /* renamed from: d */
    public String mo3237d() {
        return this.f2681c;
    }

    /* renamed from: e */
    public boolean mo3238e() {
        return this.f2683e;
    }

    /* renamed from: f */
    public boolean mo3239f() {
        return this.f2684f;
    }

    /* renamed from: g */
    public String mo3240g() {
        String str = this.f2681c;
        if (str != null) {
            return str;
        }
        if (this.f2679a == null) {
            return BuildConfig.FLAVOR;
        }
        return "name:" + this.f2679a;
    }

    /* renamed from: h */
    public Person mo3241h() {
        return new Person.Builder().setName(mo3236c()).setIcon(mo3234a() != null ? mo3234a().mo3303u() : null).setUri(mo3237d()).setKey(mo3235b()).setBot(mo3238e()).setImportant(mo3239f()).build();
    }
}
