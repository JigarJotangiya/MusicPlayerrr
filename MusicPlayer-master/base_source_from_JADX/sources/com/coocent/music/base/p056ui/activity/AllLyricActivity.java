package com.coocent.music.base.p056ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.C0133c;
import androidx.core.content.p003d.C0524f;
import androidx.lifecycle.C0703o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.C8912t1;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p183a.p187d.C4378c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4445h;
import p159f.p166c.p181e.p182a.p190b.C4447a;
import p159f.p166c.p181e.p182a.p190b.C4448b;
import p159f.p166c.p181e.p182a.p190b.C4449c;
import p159f.p166c.p181e.p182a.p190b.C4452f;
import p159f.p166c.p181e.p182a.p190b.p191h.C4456c;
import p159f.p166c.p181e.p182a.p190b.p193j.C4464a;
import p159f.p166c.p181e.p182a.p190b.p197l.C4484g;
import p159f.p166c.p181e.p182a.p190b.p198m.C4485a;
import p369i.C8418f;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8559a;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.music.base.ui.activity.AllLyricActivity */
/* compiled from: AllLyricActivity.kt */
public final class AllLyricActivity extends AppCompatActivity {

    /* renamed from: C */
    public static final C2343a f8233C = new C2343a((C8589g) null);

    /* renamed from: A */
    public C4456c f8234A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public String f8235B = BuildConfig.FLAVOR;

    /* renamed from: z */
    private final C8418f f8236z = C8443h.m46573a(new C2346d(this));

    /* renamed from: com.coocent.music.base.ui.activity.AllLyricActivity$a */
    /* compiled from: AllLyricActivity.kt */
    public static final class C2343a {
        private C2343a() {
        }

        public /* synthetic */ C2343a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo9265a(Context context, String str, C4361a aVar) {
            C8594l.m46771e(context, "context");
            C8594l.m46771e(str, "musicName");
            C8594l.m46771e(aVar, "bindLyricListener");
            Intent intent = new Intent(context, AllLyricActivity.class);
            intent.putExtra("musicName", str);
            intent.setFlags(268435456);
            C4378c.f12969c.mo14936f(aVar);
            context.startActivity(intent);
        }
    }

    @C8533f(mo30599c = "com.coocent.music.base.ui.activity.AllLyricActivity$copyLrcToPrivate$1", mo30600f = "AllLyricActivity.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: com.coocent.music.base.ui.activity.AllLyricActivity$b */
    /* compiled from: AllLyricActivity.kt */
    static final class C2344b extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $path;
        int label;
        final /* synthetic */ AllLyricActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2344b(AllLyricActivity allLyricActivity, String str, C8508d<? super C2344b> dVar) {
            super(2, dVar);
            this.this$0 = allLyricActivity;
            this.$path = str;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C2344b(this.this$0, this.$path, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C2344b) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C4485a g2 = this.this$0.m11052p2();
                String str = this.$path;
                String e2 = this.this$0.f8235B;
                C8594l.m46769c(e2);
                if (g2.mo15194f(str, e2)) {
                    this.this$0.m11060x2();
                    C4445h.m19502d(this.this$0, (Context) null, C4452f.success, 0, 5, (Object) null);
                    this.this$0.m11047j2(true);
                } else {
                    C4445h.m19502d(this.this$0, (Context) null, C4452f.coocent_error_message, 0, 5, (Object) null);
                }
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.coocent.music.base.ui.activity.AllLyricActivity$c */
    /* compiled from: AllLyricActivity.kt */
    static final class C2345c extends C8595m implements C8570l<String, C8457t> {
        final /* synthetic */ AllLyricActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2345c(AllLyricActivity allLyricActivity) {
            super(1);
            this.this$0 = allLyricActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return C8457t.f34900a;
        }

        public final void invoke(String str) {
            C8594l.m46771e(str, "it");
            this.this$0.m11039D2(str);
        }
    }

    /* renamed from: com.coocent.music.base.ui.activity.AllLyricActivity$d */
    /* compiled from: AllLyricActivity.kt */
    static final class C2346d extends C8595m implements C8559a<C4485a> {
        final /* synthetic */ AllLyricActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2346d(AllLyricActivity allLyricActivity) {
            super(0);
            this.this$0 = allLyricActivity;
        }

        public final C4485a invoke() {
            return (C4485a) new C0703o0(this.this$0).mo4262a(C4485a.class);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m11036A2(AllLyricActivity allLyricActivity, List list) {
        C8594l.m46771e(allLyricActivity, "this$0");
        ((ProgressBar) allLyricActivity.findViewById(C4448b.progress)).setVisibility(8);
        C4456c m2 = allLyricActivity.mo9263m2();
        C8594l.m46770d(list, "it");
        m2.mo15143g(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public static final void m11037B2(AllLyricActivity allLyricActivity, View view) {
        C8594l.m46771e(allLyricActivity, "this$0");
        int id = view.getId();
        if (id == C4448b.backBtn) {
            allLyricActivity.m11047j2(false);
        } else if (id == C4448b.lyricBtn) {
            allLyricActivity.m11059w2();
        }
    }

    /* renamed from: C2 */
    private final void m11038C2() {
        C4484g gVar = C4484g.f13081a;
        C4484g.m19687a(this);
        Window window = getWindow();
        if (Build.VERSION.SDK_INT >= 21) {
            window.setNavigationBarColor(C0524f.m3223d(getResources(), C4447a.art_work_navigation_bg_color, (Resources.Theme) null));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D2 */
    public final void m11039D2(String str) {
        C0133c.C0134a aVar = new C0133c.C0134a(this);
        aVar.mo644o(C4452f.bind_lyric);
        aVar.mo636g(C4452f.bind_lyric_tip);
        aVar.mo641l(17039370, new C2352b(this, str));
        aVar.mo638i(17039360, C2353c.f8265g);
        aVar.mo630a().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static final void m11040E2(AllLyricActivity allLyricActivity, String str, DialogInterface dialogInterface, int i) {
        C8594l.m46771e(allLyricActivity, "this$0");
        C8594l.m46771e(str, "$path");
        allLyricActivity.m11048k2(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m11041F2(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final void m11047j2(boolean z) {
        if (z) {
            setResult(-1);
        }
        finish();
    }

    /* renamed from: k2 */
    private final void m11048k2(String str) {
        C8912t1 t1Var = C8912t1.f35302g;
        C8768g1 g1Var = C8768g1.f35122a;
        C8665a2 unused = C8875m.m47725b(t1Var, C8768g1.m47303c(), (C8910t0) null, new C2344b(this, str, (C8508d<? super C2344b>) null), 2, (Object) null);
    }

    /* renamed from: l2 */
    private final void m11049l2() {
        C4445h.m19502d(this, (Context) null, C4452f.coocent_error_message, 0, 5, (Object) null);
        finish();
    }

    /* renamed from: n2 */
    private final void m11050n2() {
        String stringExtra = getIntent().getStringExtra("musicName");
        this.f8235B = stringExtra;
        if (stringExtra == null) {
            m11049l2();
            return;
        }
        C8594l.m46769c(stringExtra);
        if (stringExtra.length() == 0) {
            m11049l2();
        }
    }

    /* renamed from: o2 */
    private final void m11051o2() {
        ((ProgressBar) findViewById(C4448b.progress)).setVisibility(0);
        m11052p2().mo15196h(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C4485a m11052p2() {
        return (C4485a) this.f8236z.getValue();
    }

    /* renamed from: q2 */
    private final void m11053q2() {
        int i = C4448b.recyclerView;
        ((RecyclerView) findViewById(i)).setLayoutManager(new LinearLayoutManager(this));
        mo9264y2(new C4456c(m11052p2().mo15195g().mo4146e()));
        mo9263m2().mo15144h(new C2345c(this));
        ((RecyclerView) findViewById(i)).setAdapter(mo9263m2());
    }

    /* renamed from: r2 */
    private final void m11054r2() {
        setContentView(C4449c.activity_all_lyric);
        m11053q2();
    }

    /* renamed from: w2 */
    private final void m11059w2() {
        C4464a aVar = new C4464a();
        aVar.mo15161d(this);
        aVar.mo15164g(1025);
        aVar.mo15162e(true);
        aVar.mo15163f(true);
        aVar.mo15160c();
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public final void m11060x2() {
        C4378c cVar = C4378c.f12969c;
        C4361a c = cVar.mo14933c();
        if (c != null) {
            c.mo9270x0(true);
        }
        cVar.mo14936f((C4361a) null);
    }

    /* renamed from: z2 */
    private final void m11061z2() {
        m11052p2().mo15195g().mo4149h(this, new C2351a(this));
        C2354d dVar = new C2354d(this);
        ((ImageView) findViewById(C4448b.lyricBtn)).setOnClickListener(dVar);
        ((ImageView) findViewById(C4448b.backBtn)).setOnClickListener(dVar);
    }

    /* renamed from: m2 */
    public final C4456c mo9263m2() {
        C4456c cVar = this.f8234A;
        if (cVar != null) {
            return cVar;
        }
        C8594l.m46783q("adapter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i == 1025 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("result_file_path")) != null && C8436o.m46518l(stringExtra, ".lrc", false, 2, (Object) null)) {
            m11048k2(stringExtra);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m11038C2();
        m11050n2();
        m11054r2();
        m11061z2();
        m11051o2();
    }

    /* renamed from: y2 */
    public final void mo9264y2(C4456c cVar) {
        C8594l.m46771e(cVar, "<set-?>");
        this.f8234A = cVar;
    }
}
