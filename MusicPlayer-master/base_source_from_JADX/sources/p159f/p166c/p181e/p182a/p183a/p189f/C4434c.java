package p159f.p166c.p181e.p182a.p183a.p189f;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.C0506a;
import java.io.File;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8864k;
import kotlinx.coroutines.C8876m0;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.C8912t1;
import p159f.p166c.p181e.p182a.p183a.p184a.C4361a;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p184a.C4364d;
import p159f.p166c.p181e.p182a.p183a.p186c.C4374c;
import p159f.p166c.p181e.p182a.p183a.p186c.C4375d;
import p159f.p166c.p181e.p182a.p183a.p187d.C4376a;
import p159f.p166c.p181e.p182a.p183a.p187d.C4378c;
import p159f.p166c.p181e.p182a.p183a.p187d.C4379d;
import p159f.p166c.p181e.p182a.p183a.p187d.C4389e;
import p159f.p166c.p181e.p182a.p183a.p189f.C4430a;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.p381j.p382a.C8529b;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.e.a.a.f.c */
/* compiled from: DataBaseApi.kt */
public final class C4434c {

    /* renamed from: a */
    private static boolean f13011a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static C4374c f13012b = new C4375d();

    /* renamed from: c */
    public static final C4434c f13013c = new C4434c();

    @C8533f(mo30599c = "com.coocent.music.base.data.utils.DataBaseApi$initPlaylistInfo$1", mo30600f = "DataBaseApi.kt", mo30601l = {232, 242}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.a.f.c$a */
    /* compiled from: DataBaseApi.kt */
    static final class C4435a extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ C4364d $initPlaylistInfoListener;
        int label;

        @C8533f(mo30599c = "com.coocent.music.base.data.utils.DataBaseApi$initPlaylistInfo$1$firstOpen$1", mo30600f = "DataBaseApi.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.e.a.a.f.c$a$a */
        /* compiled from: DataBaseApi.kt */
        static final class C4436a extends C8539k implements C8574p<C8902r0, C8508d<? super Boolean>, Object> {
            int label;
            final /* synthetic */ C4435a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4436a(C4435a aVar, C8508d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C8594l.m46771e(dVar, "completion");
                return new C4436a(this.this$0, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C4436a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    C4374c a = C4434c.f13012b;
                    if (a != null) {
                        a.mo14863R(this.this$0.$context);
                    }
                    return C8529b.m46723a(true);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @C8533f(mo30599c = "com.coocent.music.base.data.utils.DataBaseApi$initPlaylistInfo$1$firstOpen$2", mo30600f = "DataBaseApi.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.e.a.a.f.c$a$b */
        /* compiled from: DataBaseApi.kt */
        static final class C4437b extends C8539k implements C8574p<C8902r0, C8508d<? super Boolean>, Object> {
            int label;
            final /* synthetic */ C4435a this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4437b(C4435a aVar, C8508d dVar) {
                super(2, dVar);
                this.this$0 = aVar;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C8594l.m46771e(dVar, "completion");
                return new C4437b(this.this$0, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C4437b) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    C4374c a = C4434c.f13012b;
                    if (a != null) {
                        a.mo14863R(this.this$0.$context);
                    }
                    return C8529b.m46723a(true);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4435a(Context context, C4364d dVar, C8508d dVar2) {
            super(2, dVar2);
            this.$context = context;
            this.$initPlaylistInfoListener = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C4435a(this.$context, this.$initPlaylistInfoListener, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C4435a) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            boolean z = false;
            if (i == 0) {
                C8450m.m46575b(obj);
                C4441e n = C4441e.m19454n(this.$context);
                C8594l.m46770d(n, "MusicPreference.getInstance(context)");
                if (n.mo15117i()) {
                    if (Build.VERSION.SDK_INT < 23) {
                        C4441e n2 = C4441e.m19454n(this.$context);
                        C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
                        n2.mo15099C(false);
                        C8876m0 b = C8768g1.m47302b();
                        C4437b bVar = new C4437b(this, (C8508d) null);
                        this.label = 2;
                        obj = C8864k.m47676e(b, bVar, this);
                        if (obj == d) {
                            return d;
                        }
                        z = ((Boolean) obj).booleanValue();
                    } else if (C0506a.m3149a(this.$context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                        C4441e n3 = C4441e.m19454n(this.$context);
                        C8594l.m46770d(n3, "MusicPreference.getInstance(context)");
                        n3.mo15099C(false);
                        C8876m0 b2 = C8768g1.m47302b();
                        C4436a aVar = new C4436a(this, (C8508d) null);
                        this.label = 1;
                        obj = C8864k.m47676e(b2, aVar, this);
                        if (obj == d) {
                            return d;
                        }
                    }
                }
                this.$initPlaylistInfoListener.mo14802F(z);
                return C8457t.f34900a;
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else if (i == 2) {
                C8450m.m46575b(obj);
                z = ((Boolean) obj).booleanValue();
                this.$initPlaylistInfoListener.mo14802F(z);
                return C8457t.f34900a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = ((Boolean) obj).booleanValue();
            this.$initPlaylistInfoListener.mo14802F(z);
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.music.base.data.utils.DataBaseApi$loadPlaylistData$1", mo30600f = "DataBaseApi.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.e.a.a.f.c$b */
    /* compiled from: DataBaseApi.kt */
    static final class C4438b extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4438b(Context context, C8508d dVar) {
            super(2, dVar);
            this.$context = context;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C8594l.m46771e(dVar, "completion");
            return new C4438b(this.$context, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C4438b) create(obj, (C8508d) obj2)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                C4441e n = C4441e.m19454n(this.$context);
                C8594l.m46770d(n, "MusicPreference.getInstance(context)");
                if (n.mo15117i()) {
                    C4374c a = C4434c.f13012b;
                    if (a != null) {
                        a.mo14888i(this.$context);
                    }
                    C4441e n2 = C4441e.m19454n(this.$context);
                    C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
                    n2.mo15099C(false);
                } else {
                    C4374c a2 = C4434c.f13012b;
                    if (a2 != null) {
                        a2.mo14866U(this.$context);
                    }
                }
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private C4434c() {
    }

    /* renamed from: e0 */
    private final void m19367e0(Context context) {
        C4378c cVar = C4378c.f12969c;
        cVar.mo14937g(String.valueOf(context.getExternalCacheDir()) + File.separator + "lrc");
    }

    /* renamed from: g0 */
    private final void m19368g0(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            m19369h0(context);
        } else if (C0506a.m3149a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            m19369h0(context);
        }
    }

    /* renamed from: h0 */
    private final void m19369h0(Context context) {
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47302b(), (C8910t0) null, new C4438b(context, (C8508d) null), 2, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14854I(r2);
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15014A(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.mo14854I(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15014A(android.content.Context):java.lang.String");
    }

    /* renamed from: A0 */
    public final void mo15015A0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "order");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14878d(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14871Z(r2);
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Album> mo15016B(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14871Z(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15016B(android.content.Context):java.util.List");
    }

    /* renamed from: B0 */
    public final void mo15017B0(boolean z) {
        f13011a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14864S(r2);
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Artist> mo15018C(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14864S(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15018C(android.content.Context):java.util.List");
    }

    /* renamed from: C0 */
    public final <T> void mo15019C0(Context context, long j, int i, T t) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14862Q(context, j, i, t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14911t0(r2);
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15020D(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14911t0(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15020D(android.content.Context):java.util.List");
    }

    /* renamed from: D0 */
    public final int mo15021D0(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14850E(context, j);
        }
        return -4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14908s(r2, r3);
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.coocent.music.base.data.entity.Playlist mo15022E(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            com.coocent.music.base.data.entity.Playlist r2 = r0.mo14908s(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            com.coocent.music.base.data.entity.Playlist r2 = new com.coocent.music.base.data.entity.Playlist
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15022E(android.content.Context, java.lang.String):com.coocent.music.base.data.entity.Playlist");
    }

    /* renamed from: E0 */
    public final int mo15023E0(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14892k(context, j);
        }
        return -4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14901o0(r2);
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo15024F(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14901o0(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15024F(android.content.Context):java.util.List");
    }

    /* renamed from: F0 */
    public final int mo15025F0(Context context, long j, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14904q(context, j, str);
        }
        return -4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14847B(r2, r3);
     */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Album> mo15026G(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14847B(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15026G(android.content.Context, java.lang.String):java.util.List");
    }

    /* renamed from: G0 */
    public final int mo15027G0(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14883f0(context, j);
        }
        return -4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14872a(r2, r3);
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Artist> mo15028H(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14872a(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15028H(android.content.Context, java.lang.String):java.util.List");
    }

    /* renamed from: H0 */
    public final void mo15029H0(Activity activity, long j, String str, String str2, String str3, String str4, C4363c cVar) {
        String str5 = str3;
        String str6 = str4;
        Activity activity2 = activity;
        C8594l.m46771e(activity, "activity");
        String str7 = str;
        C8594l.m46771e(str, "oldTitle");
        C8594l.m46771e(str5, "newAlbum");
        C8594l.m46771e(str6, "newArtist");
        C8594l.m46771e(cVar, "changeMusicInfoListener");
        ContentValues contentValues = new ContentValues();
        String str8 = str2;
        contentValues.put("title", str2);
        contentValues.put("album", str5);
        contentValues.put("artist", str6);
        C4374c cVar2 = f13012b;
        if (cVar2 != null) {
            cVar2.mo14856K(activity, j, str, contentValues, cVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14865T(r2, r3, r4);
     */
    /* renamed from: I */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15030I(android.content.Context r2, java.lang.String r3, boolean r4) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14865T(r2, r3, r4)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15030I(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14916y(r2, r3);
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo15031J(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "name"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14916y(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15031J(android.content.Context, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14896m(r2, r3);
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15032K(android.content.Context r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "path"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14896m(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15032K(android.content.Context, java.lang.String):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14909s0(r2);
     */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15033L(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.mo14909s0(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15033L(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14868W(r2);
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Folder> mo15034M(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14868W(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15034M(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14867V(r2);
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Genres> mo15035N(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14867V(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15035N(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14884g(r2, r3);
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15036O(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14884g(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15036O(android.content.Context, long):java.util.List");
    }

    /* renamed from: P */
    public final String mo15037P() {
        return C4378c.f12969c.mo14934d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14874b(r2);
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15038Q(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14874b(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15038Q(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14853H(r2);
     */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15039R(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14853H(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15039R(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14894l(r2);
     */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15040S(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.mo14894l(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15040S(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14898n(r2, r3);
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.coocent.music.base.data.entity.Playlist mo15041T(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            com.coocent.music.base.data.entity.Playlist r2 = r0.mo14898n(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            com.coocent.music.base.data.entity.Playlist r2 = new com.coocent.music.base.data.entity.Playlist
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15041T(android.content.Context, long):com.coocent.music.base.data.entity.Playlist");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14885g0(r2, r3);
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15042U(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14885g0(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15042U(android.content.Context, long):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14875b0(r2);
     */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15043V(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.mo14875b0(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15043V(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14880e(r2);
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15044W(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.mo14880e(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15044W(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14852G(r2);
     */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo15045X(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14852G(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15045X(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14861P(r2);
     */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Playlist> mo15046Y(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14861P(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15046Y(android.content.Context):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14915x(r2, r3);
     */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15047Z(android.content.Context r2, int r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14915x(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15047Z(android.content.Context, int):java.util.List");
    }

    /* renamed from: a0 */
    public final boolean mo15048a0() {
        return f13011a;
    }

    /* renamed from: b */
    public final int mo15049b(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14907r0(context, jArr, j);
        }
        return -4;
    }

    /* renamed from: b0 */
    public final String mo15050b0(Context context, long j, int i) {
        C8594l.m46771e(context, "context");
        return C4376a.m19232g(context, j, i);
    }

    /* renamed from: c */
    public final boolean mo15051c(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14879d0(context, j);
        }
        return false;
    }

    /* renamed from: c0 */
    public final String mo15052c0(Context context, long j, long j2, int i) {
        C8594l.m46771e(context, "context");
        return C4376a.f12965e.mo14923h(context, j, j2, i);
    }

    /* renamed from: d */
    public final boolean mo15053d(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14882f(context, j);
        }
        return false;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d0 */
    public final void mo15054d0(Context context, boolean z) {
        String[] strArr;
        C8594l.m46771e(context, "context");
        if (Build.VERSION.SDK_INT >= 29) {
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String p = n.mo15122p();
            if (TextUtils.isEmpty(p)) {
                strArr = null;
            } else {
                C8594l.m46770d(p, "modifyAllIds");
                Object[] array = C8437p.m46547V(p, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array;
            }
            C4389e.m19277i(strArr);
        }
        m19367e0(context);
        if (z) {
            m19368g0(context);
        }
    }

    /* renamed from: e */
    public final boolean mo15055e(Context context, long j, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14899n0(context, j, str);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo15056f(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14848C(context, j);
        }
        return false;
    }

    /* renamed from: f0 */
    public final void mo15057f0(Context context, C4364d dVar) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(dVar, "initPlaylistInfoListener");
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47303c(), (C8910t0) null, new C4435a(context, dVar, (C8508d) null), 2, (Object) null);
    }

    /* renamed from: g */
    public final long mo15058g(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        C4374c cVar = f13012b;
        return cVar != null ? cVar.mo14890j(context, str) : (long) -4;
    }

    /* renamed from: h */
    public final void mo15059h(Object obj, long j, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14851F(obj, j, aVar);
        }
    }

    /* renamed from: i */
    public final void mo15060i(Object obj, long j, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14913v(obj, j, aVar);
        }
    }

    /* renamed from: i0 */
    public final int mo15061i0(Context context, long[] jArr, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14877c0(context, jArr, j);
        }
        return -4;
    }

    /* renamed from: j */
    public final void mo15062j(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4389e.f12981f.mo14947a(context, j);
    }

    /* renamed from: j0 */
    public final int mo15063j0(Context context, String str, long j) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14869X(context, str, j);
        }
        return -4;
    }

    /* renamed from: k */
    public final int mo15064k(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "musicIds");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14860O(context, jArr);
        }
        return -4;
    }

    /* renamed from: k0 */
    public final void mo15065k0(Context context) {
        C8594l.m46771e(context, "context");
        C4430a.f13008e.mo15007b(context);
    }

    /* renamed from: l */
    public final void mo15066l(Object obj, List<Long> list, C4379d.C4380a aVar) {
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(list, "ids");
        C8594l.m46771e(aVar, "deleteMusicListener");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14903p0(obj, list, aVar);
        }
    }

    /* renamed from: l0 */
    public final void mo15067l0(Context context, long j, int i) {
        C8594l.m46771e(context, "context");
        C4376a.m19233i(context, j, i);
    }

    /* renamed from: m */
    public final int mo15068m(Context context, long j) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14895l0(context, j);
        }
        return -4;
    }

    /* renamed from: m0 */
    public final void mo15069m0(String str, C4361a aVar) {
        C8594l.m46771e(str, "musicName");
        C8594l.m46771e(aVar, "bindLyricListener");
        C4378c cVar = C4378c.f12969c;
        cVar.mo14936f(aVar);
        boolean b = cVar.mo14932b(str);
        C4361a c = cVar.mo14933c();
        if (c != null) {
            c.mo9270x0(b);
        }
        cVar.mo14936f((C4361a) null);
    }

    /* renamed from: n */
    public final int mo15070n(Context context, long j, String str, String str2, String str3) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "playlistName");
        C8594l.m46771e(str2, "artworkUrl");
        C8594l.m46771e(str3, "description");
        C4374c cVar = f13012b;
        if (cVar != null) {
            return cVar.mo14846A(context, j, str, str2, str3);
        }
        return -4;
    }

    /* renamed from: n0 */
    public final void mo15071n0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14876c(context, str);
        }
    }

    /* renamed from: o */
    public final Uri mo15072o(long j) {
        Uri withAppendedId = ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), j);
        C8594l.m46770d(withAppendedId, "ContentUris.withAppended…udio/albumart\"), albumId)");
        return withAppendedId;
    }

    /* renamed from: o0 */
    public final void mo15073o0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14873a0(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14900o(r2);
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Album> mo15074p(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14900o(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15074p(android.content.Context):java.util.List");
    }

    /* renamed from: p0 */
    public final void mo15075p0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14859N(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14893k0(r2, r3);
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Album> mo15076q(android.content.Context r2, long[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "ids"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14893k0(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15076q(android.content.Context, long[]):java.util.List");
    }

    /* renamed from: q0 */
    public final void mo15077q0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14857L(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14902p(r2, r3);
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Long> mo15078r(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14902p(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15078r(android.content.Context, long):java.util.List");
    }

    /* renamed from: r0 */
    public final void mo15079r0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14855J(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14891j0(r2, r3);
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15080s(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14891j0(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15080s(android.content.Context, long):java.util.List");
    }

    /* renamed from: s0 */
    public final void mo15081s0(C4430a.C4431a aVar) {
        C8594l.m46771e(aVar, "focusChangeListener");
        C4430a.f13008e.mo15008c(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14914w(r2);
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo15082t(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.lang.String r2 = r0.mo14914w(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0012
        L_0x0010:
            java.lang.String r2 = ""
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15082t(android.content.Context):java.lang.String");
    }

    /* renamed from: t0 */
    public final void mo15083t0(Context context, int i) {
        C8594l.m46771e(context, "context");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14887h0(context, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14889i0(r2, r3);
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Album> mo15084u(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14889i0(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15084u(android.content.Context, long):java.util.List");
    }

    /* renamed from: u0 */
    public final void mo15085u0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14917z(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14906r(r2, r3);
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.coocent.music.base.data.entity.Artist mo15086v(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            com.coocent.music.base.data.entity.Artist r2 = r0.mo14906r(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            com.coocent.music.base.data.entity.Artist r2 = new com.coocent.music.base.data.entity.Artist
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15086v(android.content.Context, long):com.coocent.music.base.data.entity.Artist");
    }

    /* renamed from: v0 */
    public final void mo15087v0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14881e0(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14849D(r2);
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Artist> mo15088w(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14849D(r2)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15088w(android.content.Context):java.util.List");
    }

    /* renamed from: w0 */
    public final void mo15089w0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14897m0(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = r0.mo14886h(r2, r3);
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Artist> mo15090x(android.content.Context r2, long[] r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            java.lang.String r0 = "ids"
            p369i.p387z.p389d.C8594l.m46771e(r3, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0015
            java.util.List r2 = r0.mo14886h(r2, r3)
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15090x(android.content.Context, long[]):java.util.List");
    }

    /* renamed from: x0 */
    public final void mo15091x0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14910t(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14905q0(r2, r3);
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.Long> mo15092y(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14905q0(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15092y(android.content.Context, long):java.util.List");
    }

    /* renamed from: y0 */
    public final void mo15093y0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "sortOrder");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14912u(context, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r0.mo14858M(r2, r3);
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.coocent.music.base.data.entity.Music> mo15094z(android.content.Context r2, long r3) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r2, r0)
            f.c.e.a.a.c.c r0 = f13012b
            if (r0 == 0) goto L_0x0010
            java.util.List r2 = r0.mo14858M(r2, r3)
            if (r2 == 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0015:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p189f.C4434c.mo15094z(android.content.Context, long):java.util.List");
    }

    /* renamed from: z0 */
    public final void mo15095z0(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "order");
        C4374c cVar = f13012b;
        if (cVar != null) {
            cVar.mo14870Y(context, str);
        }
    }
}
