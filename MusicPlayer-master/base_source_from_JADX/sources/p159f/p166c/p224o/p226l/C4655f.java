package p159f.p166c.p224o.p226l;

import android.content.Context;
import p082e.p126k.p129c.p130i.C3878a;
import p082e.p126k.p129c.p130i.C3888f;
import p082e.p126k.p129c.p130i.C3889g;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;

/* renamed from: f.c.o.l.f */
/* compiled from: DataStoreUtils.kt */
public final class C4655f {

    /* renamed from: a */
    public static final C4655f f13444a = new C4655f();

    @C8533f(mo30599c = "com.coocent.videolibrary.utils.DataStoreUtils$put$2", mo30600f = "DataStoreUtils.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.o.l.f$a */
    /* compiled from: DataStoreUtils.kt */
    static final class C4656a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ T $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4656a(T t, String str, C8508d<? super C4656a> dVar) {
            super(2, dVar);
            this.$value = t;
            this.$key = str;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4656a aVar = new C4656a(this.$value, this.$key, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
            return ((C4656a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C3878a aVar = (C3878a) this.L$0;
                T t = this.$value;
                if (t instanceof Integer) {
                    aVar.mo13384i(C3888f.m16599d(this.$key), this.$value);
                } else if (t instanceof Long) {
                    aVar.mo13384i(C3888f.m16600e(this.$key), this.$value);
                } else if (t instanceof Double) {
                    aVar.mo13384i(C3888f.m16597b(this.$key), this.$value);
                } else if (t instanceof Float) {
                    aVar.mo13384i(C3888f.m16598c(this.$key), this.$value);
                } else if (t instanceof Boolean) {
                    aVar.mo13384i(C3888f.m16596a(this.$key), this.$value);
                } else if (t instanceof String) {
                    aVar.mo13384i(C3888f.m16601f(this.$key), this.$value);
                } else {
                    throw new IllegalArgumentException("This type can be saved into DataStore");
                }
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C4655f() {
    }

    /* renamed from: a */
    public final <T> Object mo15389a(Context context, String str, T t, C8508d<? super C8457t> dVar) {
        Object a = C3889g.m16603a(C4657g.m20158a(context), new C4656a(t, str, (C8508d<? super C4656a>) null), dVar);
        return a == C8527d.m46722d() ? a : C8457t.f34900a;
    }

    /* renamed from: b */
    public final Object mo15390b(Context context, String str, C8508d<? super C8457t> dVar) {
        Object a = mo15389a(context, "encrypt_pwd", str, dVar);
        return a == C8527d.m46722d() ? a : C8457t.f34900a;
    }
}
