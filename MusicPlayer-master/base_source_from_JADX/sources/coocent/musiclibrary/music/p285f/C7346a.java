package coocent.musiclibrary.music.p285f;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import coocent.musiclibrary.music.folder.p288ui.FilePickerActivity;
import coocent.musiclibrary.music.p285f.p286b.C7347a;
import coocent.musiclibrary.music.p285f.p286b.C7348b;
import coocent.musiclibrary.music.p285f.p286b.C7349c;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: coocent.musiclibrary.music.f.a */
/* compiled from: MaterialFilePicker */
public class C7346a {

    /* renamed from: a */
    private Activity f32381a;

    /* renamed from: b */
    private Fragment f32382b;

    /* renamed from: c */
    private Fragment f32383c;

    /* renamed from: d */
    private Class<? extends FilePickerActivity> f32384d = FilePickerActivity.class;

    /* renamed from: e */
    private Integer f32385e;

    /* renamed from: f */
    private Pattern f32386f;

    /* renamed from: g */
    private Boolean f32387g;

    /* renamed from: h */
    private String f32388h;

    /* renamed from: i */
    private String f32389i;

    /* renamed from: j */
    private Boolean f32390j;

    /* renamed from: k */
    private Boolean f32391k;

    /* renamed from: l */
    private CharSequence f32392l;

    /* renamed from: m */
    private int f32393m;

    /* renamed from: n */
    private int f32394n;

    public C7346a() {
        Boolean bool = Boolean.FALSE;
        this.f32387g = bool;
        this.f32390j = bool;
        this.f32391k = Boolean.TRUE;
    }

    /* renamed from: a */
    public C7347a mo28089a() {
        ArrayList arrayList = new ArrayList();
        if (!this.f32390j.booleanValue()) {
            arrayList.add(new C7348b());
        }
        Pattern pattern = this.f32386f;
        if (pattern != null) {
            arrayList.add(new C7349c(pattern, this.f32387g.booleanValue()));
        }
        return new C7347a(arrayList);
    }

    /* renamed from: b */
    public Intent mo28090b() {
        C7347a a = mo28089a();
        Activity activity = this.f32381a;
        if (activity == null) {
            Fragment fragment = this.f32382b;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                Fragment fragment2 = this.f32383c;
                activity = fragment2 != null ? fragment2.getActivity() : null;
            }
        }
        Intent intent = new Intent(activity, this.f32384d);
        intent.putExtra("arg_filter", a);
        intent.putExtra("arg_closeable", this.f32391k);
        String str = this.f32388h;
        if (str != null) {
            intent.putExtra("arg_start_path", str);
        }
        String str2 = this.f32389i;
        if (str2 != null) {
            intent.putExtra("arg_current_path", str2);
        }
        CharSequence charSequence = this.f32392l;
        if (charSequence != null) {
            intent.putExtra("arg_title", charSequence);
        }
        int i = this.f32393m;
        if (i != 0) {
            intent.putExtra("arg_accent_color", i);
        }
        int i2 = this.f32394n;
        if (i2 != 0) {
            intent.putExtra("arg_default_color", i2);
        }
        return intent;
    }

    /* renamed from: c */
    public void mo28091c() {
        if (this.f32381a == null && this.f32382b == null && this.f32383c == null) {
            throw new RuntimeException("You must pass Activity/Fragment by calling withActivity/withFragment/withSupportFragment method");
        } else if (this.f32385e != null) {
            Intent b = mo28090b();
            Activity activity = this.f32381a;
            if (activity != null) {
                activity.startActivityForResult(b, this.f32385e.intValue());
                return;
            }
            Fragment fragment = this.f32382b;
            if (fragment != null) {
                fragment.startActivityForResult(b, this.f32385e.intValue());
            } else {
                this.f32383c.startActivityForResult(b, this.f32385e.intValue());
            }
        } else {
            throw new RuntimeException("You must pass request code by calling withRequestCode method");
        }
    }

    /* renamed from: d */
    public C7346a mo28092d(int i) {
        this.f32393m = i;
        return this;
    }

    /* renamed from: e */
    public C7346a mo28093e(Activity activity) {
        if (this.f32383c == null && this.f32382b == null) {
            this.f32381a = activity;
            return this;
        }
        throw new RuntimeException("You must pass either Activity, Fragment or SupportFragment");
    }

    /* renamed from: f */
    public C7346a mo28094f(int i) {
        this.f32394n = i;
        return this;
    }

    /* renamed from: g */
    public C7346a mo28095g(boolean z) {
        this.f32387g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: h */
    public C7346a mo28096h(boolean z) {
        this.f32390j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: i */
    public C7346a mo28097i(int i) {
        this.f32385e = Integer.valueOf(i);
        return this;
    }

    /* renamed from: j */
    public C7346a mo28098j(CharSequence charSequence) {
        this.f32392l = charSequence;
        return this;
    }
}
