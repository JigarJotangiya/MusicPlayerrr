package p159f.p166c.p181e.p182a.p183a.p187d;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8874l2;
import kotlinx.coroutines.C8876m0;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.C8912t1;
import p159f.p166c.p181e.p182a.p183a.p188e.C4423k;
import p159f.p166c.p181e.p182a.p183a.p189f.C4434c;
import p369i.C8446k;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8602t;

/* renamed from: f.c.e.a.a.d.d */
/* compiled from: MusicDeleteKit.kt */
public final class C4379d {

    /* renamed from: a */
    private static C4381b f12970a;

    /* renamed from: b */
    public static final C4379d f12971b = new C4379d();

    /* renamed from: f.c.e.a.a.d.d$a */
    /* compiled from: MusicDeleteKit.kt */
    public interface C4380a {
        /* renamed from: a */
        void mo14943a();

        /* renamed from: b */
        void mo14944b(List<Long> list);

        /* renamed from: c */
        void mo14945c(int i, int i2, long j);
    }

    /* renamed from: f.c.e.a.a.d.d$b */
    /* compiled from: MusicDeleteKit.kt */
    public interface C4381b {
        /* renamed from: a */
        void mo14946a();
    }

    @C8533f(mo30599c = "com.coocent.music.base.data.kit.MusicDeleteKit$deleteMusicDownR$1$1", mo30600f = "MusicDeleteKit.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.a.d.d$c */
    /* compiled from: MusicDeleteKit.kt */
    static final class C4382c extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Object $any$inlined;
        final /* synthetic */ C8602t $context$inlined;
        final /* synthetic */ C4380a $deleteMusicListener$inlined;

        /* renamed from: $i */
        final /* synthetic */ int f12972$i;
        final /* synthetic */ List $ids$inlined;
        final /* synthetic */ List $pairList;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4382c(int i, List list, C8508d dVar, C8602t tVar, List list2, Object obj, C4380a aVar) {
            super(2, dVar);
            this.f12972$i = i;
            this.$pairList = list;
            this.$context$inlined = tVar;
            this.$ids$inlined = list2;
            this.$any$inlined = obj;
            this.$deleteMusicListener$inlined = aVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C4382c(this.f12972$i, this.$pairList, dVar, this.$context$inlined, this.$ids$inlined, this.$any$inlined, this.$deleteMusicListener$inlined);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C4382c) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                this.$deleteMusicListener$inlined.mo14945c(this.f12972$i, this.$pairList.size(), ((Number) ((C8446k) this.$pairList.get(this.f12972$i)).getFirst()).longValue());
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C8533f(mo30599c = "com.coocent.music.base.data.kit.MusicDeleteKit$deleteMusicDownR$1$2", mo30600f = "MusicDeleteKit.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.a.d.d$d */
    /* compiled from: MusicDeleteKit.kt */
    static final class C4383d extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Object $any$inlined;
        final /* synthetic */ C8602t $context$inlined;
        final /* synthetic */ C4380a $deleteMusicListener$inlined;
        final /* synthetic */ List $ids$inlined;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4383d(C8508d dVar, C8602t tVar, List list, Object obj, C4380a aVar) {
            super(2, dVar);
            this.$context$inlined = tVar;
            this.$ids$inlined = list;
            this.$any$inlined = obj;
            this.$deleteMusicListener$inlined = aVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C4383d(dVar, this.$context$inlined, this.$ids$inlined, this.$any$inlined, this.$deleteMusicListener$inlined);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C4383d) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                this.$deleteMusicListener$inlined.mo14944b(this.$ids$inlined);
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: f.c.e.a.a.d.d$e */
    /* compiled from: MusicDeleteKit.kt */
    public static final class C4384e implements C4381b {

        /* renamed from: a */
        final /* synthetic */ List f12973a;

        /* renamed from: b */
        final /* synthetic */ Object f12974b;

        /* renamed from: c */
        final /* synthetic */ C4380a f12975c;

        @C8533f(mo30599c = "com.coocent.music.base.data.kit.MusicDeleteKit$deleteMusicUpR$1$grant$1", mo30600f = "MusicDeleteKit.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.e.a.a.d.d$e$a */
        /* compiled from: MusicDeleteKit.kt */
        static final class C4385a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            int label;
            final /* synthetic */ C4384e this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4385a(C4384e eVar, C8508d dVar) {
                super(2, dVar);
                this.this$0 = eVar;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C8594l.m46771e(dVar, "completion");
                return new C4385a(this.this$0, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C4385a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    int size = this.this$0.f12973a.size();
                    for (int i = 0; i < size; i++) {
                        C4379d dVar = C4379d.f12971b;
                        C4384e eVar = this.this$0;
                        dVar.m19260j(eVar.f12974b, ((Number) eVar.f12973a.get(i)).longValue());
                        C4384e eVar2 = this.this$0;
                        eVar2.f12975c.mo14945c(i, eVar2.f12973a.size(), ((Number) this.this$0.f12973a.get(i)).longValue());
                    }
                    C4384e eVar3 = this.this$0;
                    eVar3.f12975c.mo14944b(eVar3.f12973a);
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        C4384e(List list, Object obj, C4380a aVar) {
            this.f12973a = list;
            this.f12974b = obj;
            this.f12975c = aVar;
        }

        /* renamed from: a */
        public void mo14946a() {
            C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C4385a(this, (C8508d) null), 2, (Object) null);
        }
    }

    @C8533f(mo30599c = "com.coocent.music.base.data.kit.MusicDeleteKit$deleteMusicUpR$3", mo30600f = "MusicDeleteKit.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.a.d.d$f */
    /* compiled from: MusicDeleteKit.kt */
    static final class C4386f extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ C4380a $deleteMusicListener;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4386f(C4380a aVar, C8508d dVar) {
            super(2, dVar);
            this.$deleteMusicListener = aVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C4386f(this.$deleteMusicListener, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C4386f) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                this.$deleteMusicListener.mo14943a();
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C8533f(mo30599c = "com.coocent.music.base.data.kit.MusicDeleteKit$deleteMusics$1", mo30600f = "MusicDeleteKit.kt", mo30601l = {125}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.a.d.d$g */
    /* compiled from: MusicDeleteKit.kt */
    static final class C4387g extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Object $any;
        final /* synthetic */ C4380a $deleteMusicListener;
        final /* synthetic */ List $ids;
        int label;

        @C8533f(mo30599c = "com.coocent.music.base.data.kit.MusicDeleteKit$deleteMusics$1$1", mo30600f = "MusicDeleteKit.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.e.a.a.d.d$g$a */
        /* compiled from: MusicDeleteKit.kt */
        static final class C4388a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
            int label;
            final /* synthetic */ C4387g this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4388a(C4387g gVar, C8508d dVar) {
                super(2, dVar);
                this.this$0 = gVar;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C8594l.m46771e(dVar, "completion");
                return new C4388a(this.this$0, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C4388a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    if (Build.VERSION.SDK_INT >= 30) {
                        C4379d dVar = C4379d.f12971b;
                        C4387g gVar = this.this$0;
                        dVar.m19259g(gVar.$any, gVar.$ids, gVar.$deleteMusicListener);
                    } else {
                        C4379d dVar2 = C4379d.f12971b;
                        C4387g gVar2 = this.this$0;
                        dVar2.m19258f(gVar2.$any, gVar2.$ids, gVar2.$deleteMusicListener);
                    }
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4387g(Object obj, List list, C4380a aVar, C8508d dVar) {
            super(2, dVar);
            this.$any = obj;
            this.$ids = list;
            this.$deleteMusicListener = aVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C4387g(this.$any, this.$ids, this.$deleteMusicListener, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C4387g) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C8876m0 b = C8768g1.m47302b();
                C4388a aVar = new C4388a(this, (C8508d) null);
                this.label = 1;
                if (C8864k.m47676e(b, aVar, this) == d) {
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

    private C4379d() {
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m19258f(Object obj, List<Long> list, C4380a aVar) {
        int i;
        Object obj2 = obj;
        C8602t tVar = new C8602t();
        tVar.element = null;
        if (obj2 instanceof Activity) {
            tVar.element = ((Activity) obj2).getApplicationContext();
        } else if (obj2 instanceof Fragment) {
            tVar.element = ((Fragment) obj2).mo3708v2();
        }
        T t = tVar.element;
        Context context = (Context) t;
        if (context != null) {
            List<C8446k<Long, String>> v = C4423k.f13002a.mo14999v((Context) t, C8490t.m46676A(list));
            int size = v.size();
            int i2 = 0;
            while (i2 < size) {
                try {
                    Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, ((Number) v.get(i2).getFirst()).longValue());
                    C8594l.m46770d(withAppendedId, "ContentUris.withAppended…T_URI, pairList[i].first)");
                    if (context.getContentResolver().delete(withAppendedId, (String) null, (String[]) null) > 0) {
                        File file = new File((String) v.get(i2).getSecond());
                        if (file.exists()) {
                            file.delete();
                        }
                        f12971b.m19260j(obj2, list.get(i2).longValue());
                        C8912t1 t1Var = C8912t1.f35302g;
                        C8874l2 c = C8768g1.m47303c();
                        i = i2;
                        try {
                            C4382c cVar = new C4382c(i2, v, (C8508d) null, tVar, list, obj, aVar);
                            C8665a2 unused = C8875m.m47725b(t1Var, c, (C8910t0) null, cVar, 2, (Object) null);
                        } catch (Exception e) {
                            e = e;
                        }
                    } else {
                        i = i2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    i = i2;
                    e.printStackTrace();
                    i2 = i + 1;
                }
                i2 = i + 1;
            }
            C8665a2 unused2 = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C4383d((C8508d) null, tVar, list, obj, aVar), 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m19259g(Object obj, List<Long> list, C4380a aVar) {
        FragmentActivity L;
        ArrayList arrayList = new ArrayList();
        try {
            for (Long longValue : list) {
                Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, longValue.longValue());
                C8594l.m46770d(withAppendedId, "ContentUris.withAppended…EXTERNAL_CONTENT_URI, id)");
                arrayList.add(withAppendedId);
            }
        } catch (Exception e) {
            try {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
                C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C4386f(aVar, (C8508d) null), 2, (Object) null);
                return;
            }
        }
        f12970a = new C4384e(list, obj, aVar);
        if (obj instanceof Activity) {
            PendingIntent createDeleteRequest = MediaStore.createDeleteRequest(((Activity) obj).getContentResolver(), arrayList);
            C8594l.m46770d(createDeleteRequest, "MediaStore.createDeleteR…                    uris)");
            ((Activity) obj).startIntentSenderForResult(createDeleteRequest.getIntentSender(), 1026, (Intent) null, 0, 0, 0);
        } else if ((obj instanceof Fragment) && (L = ((Fragment) obj).mo3606L()) != null) {
            C8594l.m46770d(L, "it");
            PendingIntent createDeleteRequest2 = MediaStore.createDeleteRequest(L.getContentResolver(), arrayList);
            C8594l.m46770d(createDeleteRequest2, "MediaStore.createDeleteR…  .contentResolver, uris)");
            ((Fragment) obj).mo3641V2(createDeleteRequest2.getIntentSender(), 1026, (Intent) null, 0, 0, 0, (Bundle) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m19260j(Object obj, long j) {
        Context context;
        if (obj instanceof Activity) {
            context = ((Activity) obj).getApplicationContext();
        } else {
            context = obj instanceof Fragment ? ((Fragment) obj).mo3606L() : null;
        }
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                C4434c.f13013c.mo15062j(context, j);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(j));
            C4434c.f13013c.mo15064k(context, C8490t.m46676A(arrayList));
        }
    }

    /* renamed from: d */
    public final void mo14938d(Object obj, long j, C4380a aVar) {
        Context context;
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        if (obj instanceof Activity) {
            context = ((Activity) obj).getApplicationContext();
        } else {
            context = obj instanceof Fragment ? ((Fragment) obj).mo3708v2() : null;
        }
        if (context != null) {
            f12971b.mo14940h(obj, C4434c.f13013c.mo15078r(context, j), aVar);
        }
    }

    /* renamed from: e */
    public final void mo14939e(Object obj, long j, C4380a aVar) {
        Context context;
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        if (obj instanceof Activity) {
            context = ((Activity) obj).getApplicationContext();
        } else {
            context = obj instanceof Fragment ? ((Fragment) obj).mo3708v2() : null;
        }
        if (context != null) {
            f12971b.mo14940h(obj, C4434c.f13013c.mo15092y(context, j), aVar);
        }
    }

    /* renamed from: h */
    public final void mo14940h(Object obj, List<Long> list, C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(list, "ids");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C4387g(obj, list, aVar, (C8508d) null), 2, (Object) null);
    }

    /* renamed from: i */
    public final C4381b mo14941i() {
        return f12970a;
    }

    /* renamed from: k */
    public final void mo14942k(C4381b bVar) {
        f12970a = bVar;
    }
}
