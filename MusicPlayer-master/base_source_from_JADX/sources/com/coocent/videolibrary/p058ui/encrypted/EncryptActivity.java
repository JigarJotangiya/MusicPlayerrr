package com.coocent.videolibrary.p058ui.encrypted;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0703o0;
import androidx.lifecycle.C0712q0;
import androidx.lifecycle.C0719w;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.coocent.pinview.C2478b;
import com.coocent.pinview.C2479c;
import com.coocent.pinview.C2480d;
import com.coocent.pinview.C2481e;
import com.coocent.pinview.fragment.C2487d;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import com.coocent.videolibrary.p058ui.BaseActivity;
import com.coocent.videolibrary.p058ui.C2627h;
import com.coocent.videolibrary.p058ui.encrypted.C2577o;
import java.util.Objects;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import p159f.p166c.p222m.C4613a;
import p159f.p166c.p222m.C4615b;
import p159f.p166c.p222m.C4616c;
import p159f.p166c.p224o.C4619a;
import p159f.p166c.p224o.C4625g;
import p159f.p166c.p224o.C4627i;
import p159f.p166c.p224o.p225k.C4629a;
import p159f.p166c.p224o.p226l.C4647b;
import p159f.p166c.p224o.p226l.C4655f;
import p159f.p166c.p224o.p226l.C4668q;
import p159f.p166c.p224o.p227m.C4680h;
import p159f.p166c.p224o.p227m.C4681i;
import p159f.p166c.p231p.p234c.C4814m;
import p159f.p166c.p231p.p234c.C4815n;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.videolibrary.ui.encrypted.EncryptActivity */
/* compiled from: EncryptedActivity.kt */
public final class EncryptActivity extends BaseActivity implements SwipeRefreshLayout.C1051j, C2627h, C2479c {

    /* renamed from: L */
    public static final C2559a f8973L = new C2559a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: M */
    public static C2576n f8974M;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public C4629a f8975C;

    /* renamed from: D */
    private C4815n f8976D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public C4613a f8977E;

    /* renamed from: F */
    private boolean f8978F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public boolean f8979G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C2577o f8980H;

    /* renamed from: I */
    private int f8981I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f8982J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f8983K;

    /* renamed from: com.coocent.videolibrary.ui.encrypted.EncryptActivity$a */
    /* compiled from: EncryptedActivity.kt */
    public static final class C2559a {
        private C2559a() {
        }

        public /* synthetic */ C2559a(C8589g gVar) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ void m11826d(C2559a aVar, Context context, boolean z, boolean z2, C2576n nVar, int i, Object obj) {
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            if ((i & 8) != 0) {
                nVar = null;
            }
            aVar.mo10056c(context, z, z2, nVar);
        }

        /* renamed from: a */
        public final C2576n mo10054a() {
            return EncryptActivity.f8974M;
        }

        /* renamed from: b */
        public final void mo10055b(C2576n nVar) {
            EncryptActivity.f8974M = nVar;
        }

        /* renamed from: c */
        public final void mo10056c(Context context, boolean z, boolean z2, C2576n nVar) {
            C8594l.m46771e(context, "context");
            mo10055b(nVar);
            Intent putExtra = new Intent(context, EncryptActivity.class).putExtra("isDark", z).putExtra("isFirst", z2);
            C8594l.m46770d(putExtra, "Intent(context, EncryptA…tExtra(IS_FIRST, isFirst)");
            context.startActivity(putExtra);
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.EncryptActivity$b */
    /* compiled from: EncryptedActivity.kt */
    public static final class C2560b extends C0602j.C0608f {

        /* renamed from: a */
        final /* synthetic */ EncryptActivity f8984a;

        C2560b(EncryptActivity encryptActivity) {
            this.f8984a = encryptActivity;
        }

        /* renamed from: c */
        public void mo3990c(C0602j jVar, Fragment fragment, Bundle bundle) {
            C8594l.m46771e(jVar, "fm");
            C8594l.m46771e(fragment, "f");
            super.mo3990c(jVar, fragment, bundle);
            if (fragment instanceof C2487d) {
                ActionBar R1 = this.f8984a.mo471R1();
                if (R1 != null) {
                    R1.mo412k();
                }
                this.f8984a.f8982J = false;
            }
            if (fragment instanceof C2577o) {
                ActionBar R12 = this.f8984a.mo471R1();
                if (R12 != null) {
                    R12.mo405A();
                }
                this.f8984a.f8983K = false;
            }
        }

        /* renamed from: d */
        public void mo3991d(C0602j jVar, Fragment fragment) {
            C2577o r2;
            C4613a u2;
            C4613a u22;
            C8594l.m46771e(jVar, "fm");
            C8594l.m46771e(fragment, "f");
            super.mo3991d(jVar, fragment);
            if (fragment instanceof C2577o) {
                this.f8984a.f8983K = true;
                C4629a p2 = this.f8984a.f8975C;
                if (p2 != null) {
                    p2.f13354e.setEnabled(true);
                    ActionBar R1 = this.f8984a.mo471R1();
                    if (R1 != null) {
                        R1.mo405A();
                    }
                    if (EncryptActivity.f8973L.mo10054a() == null && (u22 = this.f8984a.f8977E) != null) {
                        u22.mo15368n(this.f8984a);
                    }
                    this.f8984a.finish();
                } else {
                    C8594l.m46783q("mBinding");
                    throw null;
                }
            }
            if (fragment instanceof C2487d) {
                this.f8984a.f8982J = true;
                C4629a p22 = this.f8984a.f8975C;
                if (p22 != null) {
                    p22.f13354e.setEnabled(true);
                    ActionBar R12 = this.f8984a.mo471R1();
                    if (R12 != null) {
                        R12.mo405A();
                    }
                    if (!this.f8984a.f8983K && (r2 = this.f8984a.f8980H) != null) {
                        EncryptActivity encryptActivity = this.f8984a;
                        if (!r2.mo3652a1()) {
                            if (EncryptActivity.f8973L.mo10054a() == null && (u2 = encryptActivity.f8977E) != null) {
                                u2.mo15368n(encryptActivity);
                            }
                            encryptActivity.finish();
                            return;
                        }
                        return;
                    }
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
        }

        /* renamed from: i */
        public void mo3996i(C0602j jVar, Fragment fragment) {
            ActionBar R1;
            C8594l.m46771e(jVar, "fm");
            C8594l.m46771e(fragment, "f");
            super.mo3996i(jVar, fragment);
            if ((fragment instanceof C2577o) && (R1 = this.f8984a.mo471R1()) != null) {
                R1.mo405A();
            }
        }
    }

    /* renamed from: com.coocent.videolibrary.ui.encrypted.EncryptActivity$c */
    /* compiled from: EncryptedActivity.kt */
    public static final class C2561c implements C2481e {

        /* renamed from: a */
        final /* synthetic */ EncryptActivity f8985a;

        C2561c(EncryptActivity encryptActivity) {
            this.f8985a = encryptActivity;
        }

        /* renamed from: a */
        public void mo9616a() {
            ActionBar R1 = this.f8985a.mo471R1();
            if (R1 != null) {
                R1.mo405A();
            }
            C4629a p2 = this.f8985a.f8975C;
            if (p2 != null) {
                p2.f13354e.setEnabled(true);
                C2576n a = EncryptActivity.f8973L.mo10054a();
                if (a != null) {
                    a.mo10061a();
                    return;
                }
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }

        /* renamed from: b */
        public /* synthetic */ Boolean mo9617b() {
            return C2480d.m11636b(this);
        }

        /* renamed from: c */
        public Fragment mo9618c() {
            ActionBar R1 = this.f8985a.mo471R1();
            if (R1 != null) {
                R1.mo405A();
            }
            C4629a p2 = this.f8985a.f8975C;
            if (p2 != null) {
                p2.f13354e.setEnabled(true);
                if (this.f8985a.f8979G) {
                    C2480d.m11635a(this);
                }
                return this.f8985a.f8980H;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }

        /* renamed from: d */
        public boolean mo9619d() {
            return !this.f8985a.f8979G;
        }
    }

    @C8533f(mo30599c = "com.coocent.videolibrary.ui.encrypted.EncryptActivity$savePwd$1", mo30600f = "EncryptedActivity.kt", mo30601l = {336}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.videolibrary.ui.encrypted.EncryptActivity$d */
    /* compiled from: EncryptedActivity.kt */
    static final class C2562d extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $password;
        int label;
        final /* synthetic */ EncryptActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2562d(EncryptActivity encryptActivity, String str, C8508d<? super C2562d> dVar) {
            super(2, dVar);
            this.this$0 = encryptActivity;
            this.$password = str;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2562d(this.this$0, this.$password, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2562d) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C4655f fVar = C4655f.f13444a;
                EncryptActivity encryptActivity = this.this$0;
                String str = this.$password;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                this.label = 1;
                if (fVar.mo15390b(encryptActivity, str, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C8457t.f34900a;
        }
    }

    public EncryptActivity() {
        C4616c a = C4615b.m20080a();
        this.f8977E = a == null ? null : a.mo15370a();
    }

    /* renamed from: B2 */
    private final void m11801B2(String str) {
        C8665a2 unused = C8875m.m47725b(C0719w.m4282a(this), C8768g1.m47302b(), (C8910t0) null, new C2562d(this, str, (C8508d<? super C2562d>) null), 2, (Object) null);
    }

    /* renamed from: C2 */
    private final void m11802C2() {
        Application application = getApplication();
        C8594l.m46770d(application, "application");
        C0696m0 a = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4814m(application)).mo4262a(C4815n.class);
        C8594l.m46770d(a, "ViewModelProvider(\n     …oreViewModel::class.java)");
        this.f8976D = (C4815n) a;
        Application application2 = getApplication();
        C8594l.m46770d(application2, "application");
        C0696m0 a2 = new C0703o0((C0712q0) this, (C0703o0.C0705b) new C4680h(application2)).mo4262a(C4681i.class);
        C8594l.m46770d(a2, "ViewModelProvider(\n     …aryViewModel::class.java)");
        C4681i iVar = (C4681i) a2;
        C4815n nVar = this.f8976D;
        if (nVar != null) {
            nVar.mo15560x().mo4149h(this, new C2564b(this));
            ActionBar R1 = mo471R1();
            if (R1 != null) {
                R1.mo426y(getString(C4627i.video_encrypted_video));
                return;
            }
            return;
        }
        C8594l.m46783q("mVideoStoreViewModel");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public static final void m11803D2(EncryptActivity encryptActivity, Exception exc) {
        C8594l.m46771e(encryptActivity, "this$0");
        C4629a aVar = encryptActivity.f8975C;
        if (aVar != null) {
            aVar.f13354e.setRefreshing(false);
            C4613a aVar2 = encryptActivity.f8977E;
            if (aVar2 != null) {
                C4629a aVar3 = encryptActivity.f8975C;
                if (aVar3 != null) {
                    FrameLayout frameLayout = aVar3.f13352c;
                    C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                    aVar2.mo15359e(frameLayout);
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            return;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    /* renamed from: n2 */
    private final void m11804n2() {
        getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new C2563a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static final void m11805o2(EncryptActivity encryptActivity) {
        C8594l.m46771e(encryptActivity, "this$0");
        Rect rect = new Rect();
        encryptActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        int i = encryptActivity.f8981I;
        if (i == 0) {
            encryptActivity.f8981I = height;
        } else if (i != height) {
            if (i - height > 200) {
                if (encryptActivity.f8979G) {
                    C4629a aVar = encryptActivity.f8975C;
                    if (aVar != null) {
                        aVar.f13352c.setVisibility(8);
                        C4629a aVar2 = encryptActivity.f8975C;
                        if (aVar2 != null) {
                            aVar2.f13351b.setVisibility(8);
                        } else {
                            C8594l.m46783q("mBinding");
                            throw null;
                        }
                    } else {
                        C8594l.m46783q("mBinding");
                        throw null;
                    }
                }
                encryptActivity.f8981I = height;
            } else if (height - i > 200) {
                C4629a aVar3 = encryptActivity.f8975C;
                if (aVar3 != null) {
                    aVar3.f13352c.setVisibility(0);
                    AudioPlayService instance = AudioPlayService.Companion.getInstance();
                    if (instance != null) {
                        if (instance.isAudioPlay()) {
                            C4629a aVar4 = encryptActivity.f8975C;
                            if (aVar4 != null) {
                                aVar4.f13351b.setVisibility(0);
                            } else {
                                C8594l.m46783q("mBinding");
                                throw null;
                            }
                        } else {
                            C4629a aVar5 = encryptActivity.f8975C;
                            if (aVar5 != null) {
                                aVar5.f13351b.setVisibility(8);
                            } else {
                                C8594l.m46783q("mBinding");
                                throw null;
                            }
                        }
                    }
                    encryptActivity.f8981I = height;
                    return;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
    }

    /* renamed from: y2 */
    private final void m11815y2() {
        C0620p i = mo3730H1().mo3957i();
        C8594l.m46770d(i, "supportFragmentManager.beginTransaction()");
        mo3730H1().mo3926O0(new C2560b(this), true);
        Fragment Y = mo3730H1().mo3938Y(C2487d.class.getSimpleName());
        if (Y == null) {
            Y = C2487d.m11655g3(true);
            C4629a aVar = this.f8975C;
            if (aVar != null) {
                i.mo4069c(aVar.f13353d.getId(), Y, C2487d.class.getSimpleName());
                i.mo4073g((String) null);
            } else {
                C8594l.m46783q("mBinding");
                throw null;
            }
        }
        if (Y != null) {
            i.mo3826v(Y);
        }
        i.mo3815i();
        Objects.requireNonNull(Y, "null cannot be cast to non-null type com.coocent.pinview.fragment.SetPinFragment");
        ((C2487d) Y).mo9639i3(new C2561c(this));
    }

    /* renamed from: I */
    public boolean mo9612I() {
        return this.f8978F;
    }

    /* renamed from: J */
    public void mo10042J(boolean z) {
        C4629a aVar = this.f8975C;
        if (aVar != null) {
            aVar.f13354e.setEnabled(z);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: J0 */
    public /* synthetic */ String mo9613J0() {
        return C2478b.m11629a(this);
    }

    /* renamed from: W */
    public /* synthetic */ int mo9614W() {
        return C2478b.m11630b(this);
    }

    /* renamed from: e1 */
    public void mo5827e1() {
        mo10033j2(true);
    }

    /* renamed from: h2 */
    public void mo10031h2(boolean z) {
        C4629a aVar = this.f8975C;
        if (aVar != null) {
            aVar.f13354e.setRefreshing(z);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: j1 */
    public void mo9615j1(String str) {
        m11801B2(str);
    }

    public void onBackPressed() {
        super.onBackPressed();
        C4613a aVar = this.f8977E;
        if (aVar != null) {
            aVar.mo15368n(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4629a d = C4629a.m20084d(getLayoutInflater());
        C8594l.m46770d(d, "inflate(layoutInflater)");
        this.f8975C = d;
        if (d != null) {
            setContentView((View) d.mo7577a());
            C4629a aVar = this.f8975C;
            if (aVar != null) {
                aVar.f13355f.setPopupTheme(C4668q.f13454a.mo15399b(this));
                C4629a aVar2 = this.f8975C;
                if (aVar2 != null) {
                    mo478Y1(aVar2.f13355f);
                    ActionBar R1 = mo471R1();
                    if (R1 != null) {
                        R1.mo423v(true);
                        R1.mo420s(true);
                    }
                    C4629a aVar3 = this.f8975C;
                    if (aVar3 != null) {
                        SwipeRefreshLayout swipeRefreshLayout = aVar3.f13354e;
                        swipeRefreshLayout.setColorSchemeColors(C4647b.m20153b(this, C4619a.colorAccent, 0, 4, (Object) null));
                        swipeRefreshLayout.setRefreshing(false);
                        swipeRefreshLayout.setEnabled(false);
                        swipeRefreshLayout.setOnRefreshListener(this);
                        C4613a aVar4 = this.f8977E;
                        if (aVar4 != null) {
                            C4629a aVar5 = this.f8975C;
                            if (aVar5 != null) {
                                FrameLayout frameLayout = aVar5.f13352c;
                                C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                                aVar4.mo15361g(frameLayout);
                            } else {
                                C8594l.m46783q("mBinding");
                                throw null;
                            }
                        }
                        Intent intent = getIntent();
                        if (intent != null) {
                            this.f8978F = intent.getBooleanExtra("isDark", false);
                            this.f8979G = intent.getBooleanExtra("isFirst", false);
                        }
                        this.f8980H = C2577o.C2578a.m11897b(C2577o.f9003z0, (String) null, 0, false, 7, (Object) null);
                        m11804n2();
                        m11815y2();
                        m11802C2();
                        mo5827e1();
                        return;
                    }
                    C8594l.m46783q("mBinding");
                    throw null;
                }
                C8594l.m46783q("mBinding");
                throw null;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
        C8594l.m46783q("mBinding");
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C4625g.video_menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C4613a aVar = this.f8977E;
        if (aVar != null) {
            C4629a aVar2 = this.f8975C;
            if (aVar2 != null) {
                FrameLayout frameLayout = aVar2.f13352c;
                C8594l.m46770d(frameLayout, "mBinding.layoutAds");
                aVar.mo15365k(frameLayout);
                return;
            }
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C8594l.m46771e(menuItem, "item");
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C4629a aVar = this.f8975C;
        if (aVar != null) {
            aVar.f13351b.mo10357t(this);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: s1 */
    public void mo10045s1(boolean z) {
        C4629a aVar = this.f8975C;
        if (aVar != null) {
            aVar.f13354e.setRefreshing(z);
        } else {
            C8594l.m46783q("mBinding");
            throw null;
        }
    }

    /* renamed from: v0 */
    public void mo10046v0(String str) {
        C8594l.m46771e(str, "title");
        ActionBar R1 = mo471R1();
        if (R1 != null) {
            R1.mo426y(str);
        }
    }
}
