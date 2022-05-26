package p159f.p166c.p181e.p182a.p190b.p198m;

import android.content.Context;
import androidx.lifecycle.C0670e0;
import androidx.lifecycle.C0696m0;
import androidx.lifecycle.C0701n0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import p159f.p166c.p181e.p182a.p183a.p187d.C4378c;
import p159f.p166c.p181e.p182a.p183a.p188e.C4422j;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.b.m.a */
/* compiled from: AllLyricActivityViewModel.kt */
public final class C4485a extends C0696m0 {

    /* renamed from: c */
    private C0670e0<List<String>> f13083c;

    @C8533f(mo30599c = "com.coocent.music.base.ui.viewmodel.AllLyricActivityViewModel$loadData$1", mo30600f = "AllLyricActivityViewModel.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.b.m.a$a */
    /* compiled from: AllLyricActivityViewModel.kt */
    static final class C4486a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Context $context;
        int label;
        final /* synthetic */ C4485a this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4486a(Context context, C4485a aVar, C8508d<? super C4486a> dVar) {
            super(2, dVar);
            this.$context = context;
            this.this$0 = aVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4486a(this.$context, this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4486a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                this.this$0.mo15195g().mo4153l(C4422j.f13001a.mo14989a(this.$context));
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C4485a() {
        C0670e0<List<String>> e0Var = new C0670e0<>();
        this.f13083c = e0Var;
        e0Var.mo4156o(new ArrayList());
    }

    /* renamed from: f */
    public final boolean mo15194f(String str, String str2) {
        C8594l.m46771e(str, "path");
        C8594l.m46771e(str2, "musicName");
        return C4378c.f12969c.mo14931a(str, str2);
    }

    /* renamed from: g */
    public final C0670e0<List<String>> mo15195g() {
        return this.f13083c;
    }

    /* renamed from: h */
    public final void mo15196h(Context context) {
        C8594l.m46771e(context, "context");
        C8902r0 a = C0701n0.m4259a(this);
        C8768g1 g1Var = C8768g1.f35122a;
        C8665a2 unused = C8875m.m47725b(a, C8768g1.m47302b(), (C8910t0) null, new C4486a(context, this, (C8508d<? super C4486a>) null), 2, (Object) null);
    }
}
