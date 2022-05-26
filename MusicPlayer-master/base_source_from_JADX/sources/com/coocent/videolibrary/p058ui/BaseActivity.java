package com.coocent.videolibrary.p058ui;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.C0466a;
import androidx.fragment.app.C0602j;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0719w;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8874l2;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import p159f.p166c.p224o.p226l.C4658h;
import p159f.p166c.p224o.p226l.C4667p;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p159f.p166c.p224o.p228n.p230c.C4736s;
import p159f.p166c.p224o.p228n.p230c.C4745t;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: com.coocent.videolibrary.ui.BaseActivity */
/* compiled from: BaseActivity.kt */
public class BaseActivity extends AppCompatActivity implements C2625g {

    /* renamed from: A */
    private C4815n f8951A;

    /* renamed from: B */
    private boolean f8952B;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C4681i f8953z;

    /* renamed from: com.coocent.videolibrary.ui.BaseActivity$a */
    /* compiled from: BaseActivity.kt */
    public static final class C2547a implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseActivity f8954a;

        C2547a(BaseActivity baseActivity) {
            this.f8954a = baseActivity;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10037b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10037b(int i) {
            if (i == 1) {
                Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f8954a.getPackageName(), (String) null));
                C8594l.m46770d(data, "Intent(Settings.ACTION_A…age\", packageName, null))");
                data.addFlags(268435456);
                this.f8954a.startActivity(data);
                return;
            }
            C4681i d2 = this.f8954a.f8953z;
            if (d2 != null) {
                d2.mo15406D(false);
                C4681i d22 = this.f8954a.f8953z;
                if (d22 != null) {
                    d22.mo15410H(true);
                    this.f8954a.mo10031h2(false);
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.BaseActivity$b */
    /* compiled from: BaseActivity.kt */
    public static final class C2548b implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseActivity f8955a;

        C2548b(BaseActivity baseActivity) {
            this.f8955a = baseActivity;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10038b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10038b(int i) {
            if (i == 1) {
                Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f8955a.getPackageName(), (String) null));
                C8594l.m46770d(data, "Intent(Settings.ACTION_A…age\", packageName, null))");
                data.addFlags(268435456);
                this.f8955a.startActivity(data);
                return;
            }
            C4681i d2 = this.f8955a.f8953z;
            if (d2 != null) {
                d2.mo15406D(false);
                C4681i d22 = this.f8955a.f8953z;
                if (d22 != null) {
                    d22.mo15410H(true);
                    this.f8955a.mo10031h2(false);
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.BaseActivity$requestStoragePermission$2", mo30600f = "BaseActivity.kt", mo30601l = {106, 107}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.BaseActivity$c */
    /* compiled from: BaseActivity.kt */
    static final class C2549c extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ BaseActivity this$0;

        @C8533f(mo30599c = "com.coocent.videolibrary.ui.BaseActivity$requestStoragePermission$2$1", mo30600f = "BaseActivity.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: com.coocent.videolibrary.ui.BaseActivity$c$a */
        /* compiled from: BaseActivity.kt */
        static final class C2550a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            final /* synthetic */ boolean $isFirst;
            int label;
            final /* synthetic */ BaseActivity this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2550a(boolean z, BaseActivity baseActivity, C8508d<? super C2550a> dVar) {
                super(2, dVar);
                this.$isFirst = z;
                this.this$0 = baseActivity;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C2550a(this.$isFirst, this.this$0, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
                return ((C2550a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    if (this.$isFirst) {
                        C0466a.m2986m(this.this$0, C4667p.m20177a(), 1111);
                    } else {
                        this.this$0.mo10031h2(false);
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2549c(BaseActivity baseActivity, C8508d<? super C2549c> dVar) {
            super(2, dVar);
            this.this$0 = baseActivity;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2549c(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2549c) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C4681i d2 = this.this$0.f8953z;
                if (d2 != null) {
                    this.label = 1;
                    obj = d2.mo15422r(this);
                    if (obj == d) {
                        return d;
                    }
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else if (i == 2) {
                C8450m.m46575b(obj);
                return C8457t.f34900a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean booleanValue = ((Boolean) obj).booleanValue();
            C8874l2 c = C8768g1.m47303c();
            C2550a aVar = new C2550a(booleanValue, this.this$0, (C8508d<? super C2550a>) null);
            this.label = 2;
            if (C8864k.m47676e(c, aVar, this) == d) {
                return d;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.BaseActivity$d */
    /* compiled from: BaseActivity.kt */
    public static final class C2551d implements C4745t<Integer> {

        /* renamed from: a */
        final /* synthetic */ BaseActivity f8956a;

        C2551d(BaseActivity baseActivity) {
            this.f8956a = baseActivity;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo10036a(Object obj) {
            mo10041b(((Number) obj).intValue());
        }

        /* renamed from: b */
        public void mo10041b(int i) {
            if (i == 1) {
                Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", this.f8956a.getPackageName(), (String) null));
                C8594l.m46770d(data, "Intent(Settings.ACTION_A…age\", packageName, null))");
                data.addFlags(268435456);
                this.f8956a.startActivity(data);
                return;
            }
            C4681i d2 = this.f8956a.f8953z;
            if (d2 != null) {
                d2.mo15406D(false);
                C4681i d22 = this.f8956a.f8953z;
                if (d22 != null) {
                    d22.mo15410H(true);
                    this.f8956a.mo10031h2(false);
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m11764k2(BaseActivity baseActivity, Exception exc) {
        C8594l.m46771e(baseActivity, "this$0");
        baseActivity.mo10031h2(false);
    }

    /* renamed from: l2 */
    private final void m11765l2(boolean z) {
        C4681i iVar = this.f8953z;
        if (iVar != null) {
            iVar.mo15406D(false);
            C4681i iVar2 = this.f8953z;
            if (iVar2 != null) {
                iVar2.mo15409G(true);
                C4681i iVar3 = this.f8953z;
                if (iVar3 != null) {
                    iVar3.mo15410H(false);
                    if (C4658h.m20159a() >= 5242880) {
                        C4815n nVar = this.f8951A;
                        if (nVar != null) {
                            nVar.mo15543S();
                        } else {
                            C8594l.m46783q("mVideoStoreViewModel");
                            throw null;
                        }
                    } else {
                        mo10031h2(false);
                        Toast.makeText(this, "Internal storage has not enough space", 0).show();
                    }
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        } else {
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
    }

    /* renamed from: e2 */
    public void mo10030e2() {
        setTheme(C4668q.C4669a.m20180e(C4668q.f13454a, this, false, 2, (Object) null));
    }

    /* renamed from: h2 */
    public void mo10031h2(boolean z) {
    }

    /* renamed from: i2 */
    public void mo10032i2() {
        mo10033j2(false);
    }

    /* renamed from: j2 */
    public void mo10033j2(boolean z) {
        this.f8952B = z;
        Application application = getApplication();
        C8594l.m46770d(application, "application");
        C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(this, …oreViewModel::class.java)");
        this.f8951A = (C4815n) a;
        Application application2 = getApplication();
        C8594l.m46770d(application2, "application");
        C0696m0 a2 = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a2, "ViewModelProvider(this, …aryViewModel::class.java)");
        this.f8953z = (C4681i) a2;
        C4815n nVar = this.f8951A;
        if (nVar != null) {
            nVar.mo15560x().mo4149h(this, new C2553a(this));
            if (C4667p.m20178b(this)) {
                m11765l2(z);
                return;
            }
            C4681i iVar = this.f8953z;
            if (iVar != null) {
                iVar.mo15409G(false);
                C4681i iVar2 = this.f8953z;
                if (iVar2 != null) {
                    iVar2.mo15410H(true);
                    C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2549c(this, (C8508d<? super C2549c>) null), 2, (Object) null);
                    return;
                }
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
            C8594l.m46783q("mVideoLibraryViewModel");
            throw null;
        }
        C8594l.m46783q("mVideoStoreViewModel");
        throw null;
    }

    /* renamed from: m2 */
    public void mo10034m2() {
        if (C4667p.m20179c(this)) {
            C0466a.m2986m(this, C4667p.m20177a(), 1111);
            return;
        }
        C4736s sVar = C4736s.f13541a;
        C0602j H1 = mo3730H1();
        C8594l.m46770d(H1, "supportFragmentManager");
        sVar.mo15465h(H1, new C2551d(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1112) {
            return;
        }
        if (C4667p.m20178b(this)) {
            m11765l2(this.f8952B);
            return;
        }
        C4681i iVar = this.f8953z;
        if (iVar != null) {
            iVar.mo15409G(false);
            C4736s sVar = C4736s.f13541a;
            C0602j H1 = mo3730H1();
            C8594l.m46770d(H1, "supportFragmentManager");
            sVar.mo15465h(H1, new C2547a(this));
            return;
        }
        C8594l.m46783q("mVideoLibraryViewModel");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo10030e2();
        super.onCreate(bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C8594l.m46771e(strArr, "permissions");
        C8594l.m46771e(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1111) {
            return;
        }
        if (C4667p.m20178b(this)) {
            m11765l2(this.f8952B);
        } else if (C4667p.m20179c(this)) {
            mo10031h2(false);
            C4681i iVar = this.f8953z;
            if (iVar != null) {
                iVar.mo15409G(false);
                C4681i iVar2 = this.f8953z;
                if (iVar2 != null) {
                    iVar2.mo15410H(true);
                    C4681i iVar3 = this.f8953z;
                    if (iVar3 != null) {
                        iVar3.mo15406D(false);
                    } else {
                        C8594l.m46783q("mVideoLibraryViewModel");
                        throw null;
                    }
                } else {
                    C8594l.m46783q("mVideoLibraryViewModel");
                    throw null;
                }
            } else {
                C8594l.m46783q("mVideoLibraryViewModel");
                throw null;
            }
        } else {
            C4736s sVar = C4736s.f13541a;
            C0602j H1 = mo3730H1();
            C8594l.m46770d(H1, "supportFragmentManager");
            sVar.mo15465h(H1, new C2548b(this));
        }
    }

    /* renamed from: p1 */
    public void mo10035p1(boolean z) {
        this.f8952B = z;
        if (C4667p.m20178b(this)) {
            m11765l2(z);
        } else {
            mo10034m2();
        }
    }
}
