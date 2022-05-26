package p159f.p166c.p224o.p226l;

import android.content.Context;
import android.os.Build;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.p397f3.C8731d;
import p159f.p166c.p224o.C4628j;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.q */
/* compiled from: ThemeUtils.kt */
public final class C4668q {

    /* renamed from: a */
    public static final C4669a f13454a = new C4669a((C8589g) null);

    /* renamed from: f.c.o.l.q$a */
    /* compiled from: ThemeUtils.kt */
    public static final class C4669a {

        @C8533f(mo30599c = "com.coocent.videolibrary.utils.ThemeUtils$Companion$getThemeMode$1", mo30600f = "ThemeUtils.kt", mo30601l = {150}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.o.l.q$a$a */
        /* compiled from: ThemeUtils.kt */
        static final class C4670a extends C8539k implements C8574p<C8902r0, C8508d<? super Integer>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4670a(Context context, C8508d<? super C4670a> dVar) {
                super(2, dVar);
                this.$context = context;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                return new C4670a(this.$context, dVar);
            }

            public final Object invoke(C8902r0 r0Var, C8508d<? super Integer> dVar) {
                return ((C4670a) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object d = C8527d.m46722d();
                int i = this.label;
                if (i == 0) {
                    C8450m.m46575b(obj);
                    C4655f fVar = C4655f.f13444a;
                    C4652e eVar = new C4652e(C4657g.m20158a(this.$context).mo13321b());
                    this.label = 1;
                    obj = C8731d.m47259d(eVar, this);
                    if (obj == d) {
                        return d;
                    }
                } else if (i == 1) {
                    C8450m.m46575b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        private C4669a() {
        }

        public /* synthetic */ C4669a(C8589g gVar) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ int m20180e(C4669a aVar, Context context, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo15401d(context, z);
        }

        /* renamed from: g */
        private final int m20181g(Context context) {
            return ((Number) C8868l.m47691b((C8513g) null, new C4670a(context, (C8508d<? super C4670a>) null), 1, (Object) null)).intValue();
        }

        /* renamed from: h */
        private final boolean m20182h(Context context) {
            if (Build.VERSION.SDK_INT >= 30) {
                return context.getResources().getConfiguration().isNightModeActive();
            }
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        }

        /* renamed from: a */
        public final int mo15398a(Context context) {
            C8594l.m46771e(context, "context");
            return mo15403i(context, m20181g(context)) ? C4628j.VideoTheme_Dialog_Dark : C4628j.VideoTheme_Dialog;
        }

        /* renamed from: b */
        public final int mo15399b(Context context) {
            C8594l.m46771e(context, "context");
            return mo15403i(context, m20181g(context)) ? C4628j.VideoTheme_ToolBar_PopupTheme_Dark : C4628j.VideoTheme_ToolBar_PopupTheme;
        }

        /* renamed from: c */
        public final int mo15400c(Context context) {
            C8594l.m46771e(context, "context");
            return mo15403i(context, m20181g(context)) ? C4628j.VideoTheme_SearchDialog_Dark : C4628j.VideoTheme_SearchDialog;
        }

        /* renamed from: d */
        public final int mo15401d(Context context, boolean z) {
            C8594l.m46771e(context, "context");
            if (z) {
                return C4628j.VideoTheme_List_Dark;
            }
            return C4628j.VideoTheme_List_Dark;
        }

        /* renamed from: f */
        public final int mo15402f(Context context, int i) {
            C8594l.m46771e(context, "context");
            return C4647b.m20153b(context, i, 0, 4, (Object) null);
        }

        /* renamed from: i */
        public final boolean mo15403i(Context context, int i) {
            C8594l.m46771e(context, "context");
            if (i != -1) {
                return i == 2;
            }
            return m20182h(context);
        }

        /* renamed from: j */
        public final boolean mo15404j(Context context) {
            C8594l.m46771e(context, "context");
            return mo15403i(context, m20181g(context));
        }
    }
}
