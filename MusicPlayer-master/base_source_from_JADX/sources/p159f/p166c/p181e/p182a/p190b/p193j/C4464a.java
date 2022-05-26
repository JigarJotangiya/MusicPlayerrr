package p159f.p166c.p181e.p182a.p190b.p193j;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import com.coocent.music.base.p056ui.folder.p057ui.FilePickerActivity;
import java.util.ArrayList;
import java.util.regex.Pattern;
import p159f.p166c.p181e.p182a.p190b.p193j.p194b.C4465a;
import p159f.p166c.p181e.p182a.p190b.p193j.p194b.C4466b;
import p159f.p166c.p181e.p182a.p190b.p193j.p194b.C4467c;

/* renamed from: f.c.e.a.b.j.a */
/* compiled from: MaterialFilePicker */
public class C4464a {

    /* renamed from: a */
    private Activity f13043a;

    /* renamed from: b */
    private Fragment f13044b;

    /* renamed from: c */
    private Fragment f13045c;

    /* renamed from: d */
    private Class<? extends FilePickerActivity> f13046d = FilePickerActivity.class;

    /* renamed from: e */
    private Integer f13047e;

    /* renamed from: f */
    private Pattern f13048f;

    /* renamed from: g */
    private Boolean f13049g;

    /* renamed from: h */
    private String f13050h;

    /* renamed from: i */
    private String f13051i;

    /* renamed from: j */
    private Boolean f13052j;

    /* renamed from: k */
    private Boolean f13053k;

    /* renamed from: l */
    private CharSequence f13054l;

    /* renamed from: m */
    private int f13055m;

    /* renamed from: n */
    private int f13056n;

    public C4464a() {
        Boolean bool = Boolean.FALSE;
        this.f13049g = bool;
        this.f13052j = bool;
        this.f13053k = Boolean.TRUE;
    }

    /* renamed from: a */
    public C4465a mo15158a() {
        ArrayList arrayList = new ArrayList();
        if (!this.f13052j.booleanValue()) {
            arrayList.add(new C4466b());
        }
        Pattern pattern = this.f13048f;
        if (pattern != null) {
            arrayList.add(new C4467c(pattern, this.f13049g.booleanValue()));
        }
        return new C4465a(arrayList);
    }

    /* renamed from: b */
    public Intent mo15159b() {
        C4465a a = mo15158a();
        Activity activity = this.f13043a;
        if (activity == null) {
            Fragment fragment = this.f13044b;
            if (fragment != null) {
                activity = fragment.getActivity();
            } else {
                Fragment fragment2 = this.f13045c;
                activity = fragment2 != null ? fragment2.getActivity() : null;
            }
        }
        Intent intent = new Intent(activity, this.f13046d);
        intent.putExtra("arg_filter", a);
        intent.putExtra("arg_closeable", this.f13053k);
        String str = this.f13050h;
        if (str != null) {
            intent.putExtra("arg_start_path", str);
        }
        String str2 = this.f13051i;
        if (str2 != null) {
            intent.putExtra("arg_current_path", str2);
        }
        CharSequence charSequence = this.f13054l;
        if (charSequence != null) {
            intent.putExtra("arg_title", charSequence);
        }
        int i = this.f13055m;
        if (i != 0) {
            intent.putExtra("arg_accent_color", i);
        }
        int i2 = this.f13056n;
        if (i2 != 0) {
            intent.putExtra("arg_default_color", i2);
        }
        return intent;
    }

    /* renamed from: c */
    public void mo15160c() {
        if (this.f13043a == null && this.f13044b == null && this.f13045c == null) {
            throw new RuntimeException("You must pass Activity/Fragment by calling withActivity/withFragment/withSupportFragment method");
        } else if (this.f13047e != null) {
            Intent b = mo15159b();
            Activity activity = this.f13043a;
            if (activity != null) {
                activity.startActivityForResult(b, this.f13047e.intValue());
                return;
            }
            Fragment fragment = this.f13044b;
            if (fragment != null) {
                fragment.startActivityForResult(b, this.f13047e.intValue());
            } else {
                this.f13045c.startActivityForResult(b, this.f13047e.intValue());
            }
        } else {
            throw new RuntimeException("You must pass request code by calling withRequestCode method");
        }
    }

    /* renamed from: d */
    public C4464a mo15161d(Activity activity) {
        if (this.f13045c == null && this.f13044b == null) {
            this.f13043a = activity;
            return this;
        }
        throw new RuntimeException("You must pass either Activity, Fragment or SupportFragment");
    }

    /* renamed from: e */
    public C4464a mo15162e(boolean z) {
        this.f13049g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public C4464a mo15163f(boolean z) {
        this.f13052j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    public C4464a mo15164g(int i) {
        this.f13047e = Integer.valueOf(i);
        return this;
    }
}
