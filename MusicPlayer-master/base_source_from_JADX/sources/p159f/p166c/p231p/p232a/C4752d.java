package p159f.p166c.p231p.p232a;

import android.app.Application;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.lifecycle.C0654a0;
import androidx.lifecycle.C0671f;
import androidx.lifecycle.LiveData;
import com.coocent.videostore.p066db.C2799c;
import com.coocent.videostore.p066db.VideoStoreDatabase;
import com.coocent.videostore.p067po.Video;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.C8665a2;
import kotlinx.coroutines.C8768g1;
import kotlinx.coroutines.C8897q1;
import kotlinx.coroutines.C8902r0;
import kotlinx.coroutines.C8906s0;
import kotlinx.coroutines.C8910t0;
import kotlinx.coroutines.C8912t1;
import kotlinx.coroutines.C8933y2;
import kotlinx.coroutines.p397f3.C8729b;
import kotlinx.coroutines.p397f3.C8730c;
import p082e.p126k.p127b.C3823f;
import p082e.p126k.p129c.p130i.C3878a;
import p082e.p126k.p129c.p130i.C3884d;
import p082e.p126k.p129c.p130i.C3888f;
import p082e.p126k.p129c.p130i.C3889g;
import p082e.p149u.p150a.C4213a;
import p159f.p166c.p231p.p235d.C4816a;
import p159f.p166c.p231p.p235d.C4819b;
import p159f.p334h.p335a.C7781s;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p379w.C8513g;
import p369i.p379w.p381j.p382a.C8529b;
import p369i.p379w.p381j.p382a.C8531d;
import p369i.p379w.p381j.p382a.C8533f;
import p369i.p379w.p381j.p382a.C8539k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8592j;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8600r;
import p369i.p387z.p389d.C8602t;
import p394k.C8645n;

/* renamed from: f.c.p.a.d */
/* compiled from: VideoDataSource.kt */
public final class C4752d {

    /* renamed from: e */
    public static final C4753a f13568e = new C4753a((C8589g) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Application f13569a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final VideoStoreDatabase f13570b;

    /* renamed from: c */
    private final C8897q1 f13571c = C8933y2.m47854b(5, "video info");

    /* renamed from: d */
    private final String[] f13572d = {"video/avi", "video/x-flv", "video/x-ms-wmv"};

    /* renamed from: f.c.p.a.d$a */
    /* compiled from: VideoDataSource.kt */
    public static final class C4753a extends C4819b<C4752d, Application> {

        /* renamed from: f.c.p.a.d$a$a */
        /* compiled from: VideoDataSource.kt */
        /* synthetic */ class C4754a extends C8592j implements C8570l<Application, C4752d> {
            public static final C4754a INSTANCE = new C4754a();

            C4754a() {
                super(1, C4752d.class, "<init>", "<init>(Landroid/app/Application;)V", 0);
            }

            public final C4752d invoke(Application application) {
                C8594l.m46771e(application, "p0");
                return new C4752d(application);
            }
        }

        private C4753a() {
            super(C4754a.INSTANCE);
        }

        public /* synthetic */ C4753a(C8589g gVar) {
            this();
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$updateEncryptedVideo$1", mo30600f = "VideoDataSource.kt", mo30601l = {1329}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$a0 */
    /* compiled from: VideoDataSource.kt */
    static final class C4755a0 extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ List<Video> $videoList;
        Object L$0;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4755a0(List<Video> list, String str, C4752d dVar, C8508d<? super C4755a0> dVar2) {
            super(2, dVar2);
            this.$videoList = list;
            this.$path = str;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4755a0(this.$videoList, this.$path, this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4755a0) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Iterator<Video> it;
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                it = this.$videoList.iterator();
            } else if (i == 1) {
                it = (Iterator) this.L$0;
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (it.hasNext()) {
                Video next = it.next();
                next.mo10526O(C8529b.m46723a(true));
                next.mo10527P(next.mo10561t());
                next.mo10528Q(next.mo10567x());
                next.mo10533W(this.$path);
                next.mo10540b0(this.$path);
                C2799c F = this.this$0.f13570b.mo10390F();
                this.L$0 = it;
                this.label = 1;
                if (F.mo10416q(next, this) == d) {
                    return d;
                }
            }
            this.$videoList.clear();
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$deleteVideoAndThumbnail$1", mo30600f = "VideoDataSource.kt", mo30601l = {647, 659, 660, 698, 699, 703}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$b */
    /* compiled from: VideoDataSource.kt */
    static final class C4756b extends C8539k implements C8574p<C0654a0<Object>, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<Video> $videoList;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4756b(List<? extends Video> list, C4752d dVar, C8508d<? super C4756b> dVar2) {
            super(2, dVar2);
            this.$videoList = list;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4756b bVar = new C4756b(this.$videoList, this.this$0, dVar);
            bVar.L$0 = obj;
            return bVar;
        }

        public final Object invoke(C0654a0<Object> a0Var, C8508d<? super C8457t> dVar) {
            return ((C4756b) create(a0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.lifecycle.a0} */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
            r14.L$0 = r1;
            r14.label = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
            if (r1.emit(null, r14) != r0) goto L_0x01ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0105, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b2, code lost:
            r14.L$0 = r1;
            r14.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01bb, code lost:
            if (r1.emit(null, r14) != r0) goto L_0x01ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bd, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
            r15 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bf, code lost:
            r15.printStackTrace();
            r14.L$0 = null;
            r14.label = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cb, code lost:
            if (r1.emit(r15, r14) == r0) goto L_0x01cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cd, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d0, code lost:
            return p369i.C8457t.f34900a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            p369i.C8450m.m46575b(r15);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                int r1 = r14.label
                r2 = 0
                switch(r1) {
                    case 0: goto L_0x003c;
                    case 1: goto L_0x0037;
                    case 2: goto L_0x002e;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0020;
                    case 5: goto L_0x0017;
                    case 6: goto L_0x0012;
                    default: goto L_0x000a;
                }
            L_0x000a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0012:
                p369i.C8450m.m46575b(r15)
                goto L_0x01ce
            L_0x0017:
                java.lang.Object r1 = r14.L$0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
            L_0x001b:
                p369i.C8450m.m46575b(r15)     // Catch:{ Exception -> 0x01be }
                goto L_0x01ce
            L_0x0020:
                java.lang.Object r1 = r14.L$0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                p369i.C8450m.m46575b(r15)     // Catch:{ Exception -> 0x01be }
                goto L_0x01b2
            L_0x0029:
                java.lang.Object r1 = r14.L$0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                goto L_0x001b
            L_0x002e:
                java.lang.Object r1 = r14.L$0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                p369i.C8450m.m46575b(r15)     // Catch:{ Exception -> 0x01be }
                goto L_0x00fa
            L_0x0037:
                java.lang.Object r1 = r14.L$0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                goto L_0x001b
            L_0x003c:
                p369i.C8450m.m46575b(r15)
                java.lang.Object r15 = r14.L$0
                r1 = r15
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                int r15 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01be }
                r3 = 30
                r4 = 1
                java.lang.String r5 = "video.isPrivateVideo"
                if (r15 < r3) goto L_0x0106
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x01be }
                r15.<init>()     // Catch:{ Exception -> 0x01be }
                java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x01be }
                r3.<init>()     // Catch:{ Exception -> 0x01be }
                java.util.List<com.coocent.videostore.po.Video> r6 = r14.$videoList     // Catch:{ Exception -> 0x01be }
                java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x01be }
            L_0x005d:
                boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x01be }
                if (r7 == 0) goto L_0x008b
                java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x01be }
                java.lang.Boolean r8 = r7.mo10554m()     // Catch:{ Exception -> 0x01be }
                p369i.p387z.p389d.C8594l.m46770d(r8, r5)     // Catch:{ Exception -> 0x01be }
                boolean r8 = r8.booleanValue()     // Catch:{ Exception -> 0x01be }
                if (r8 == 0) goto L_0x007a
                r3.add(r7)     // Catch:{ Exception -> 0x01be }
                goto L_0x005d
            L_0x007a:
                java.lang.String r7 = r7.mo10567x()     // Catch:{ Exception -> 0x01be }
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x01be }
                java.lang.String r8 = "parse(video.uriString)"
                p369i.p387z.p389d.C8594l.m46770d(r7, r8)     // Catch:{ Exception -> 0x01be }
                r15.add(r7)     // Catch:{ Exception -> 0x01be }
                goto L_0x005d
            L_0x008b:
                boolean r5 = r3.isEmpty()     // Catch:{ Exception -> 0x01be }
                if (r5 == 0) goto L_0x00af
                f.c.p.a.d r3 = r14.this$0     // Catch:{ Exception -> 0x01be }
                android.app.Application r3 = r3.f13569a     // Catch:{ Exception -> 0x01be }
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x01be }
                android.app.PendingIntent r15 = android.provider.MediaStore.createDeleteRequest(r3, r15)     // Catch:{ Exception -> 0x01be }
                java.lang.String r3 = "createDeleteRequest(mApp…on.contentResolver, list)"
                p369i.p387z.p389d.C8594l.m46770d(r15, r3)     // Catch:{ Exception -> 0x01be }
                r14.L$0 = r1     // Catch:{ Exception -> 0x01be }
                r14.label = r4     // Catch:{ Exception -> 0x01be }
                java.lang.Object r15 = r1.emit(r15, r14)     // Catch:{ Exception -> 0x01be }
                if (r15 != r0) goto L_0x01ce
                return r0
            L_0x00af:
                java.util.Iterator r15 = r3.iterator()     // Catch:{ Exception -> 0x01be }
            L_0x00b3:
                boolean r4 = r15.hasNext()     // Catch:{ Exception -> 0x01be }
                if (r4 == 0) goto L_0x00e4
                java.lang.Object r4 = r15.next()     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.po.Video r4 = (com.coocent.videostore.p067po.Video) r4     // Catch:{ Exception -> 0x01be }
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x01be }
                java.lang.String r6 = r4.mo10561t()     // Catch:{ Exception -> 0x01be }
                r5.<init>(r6)     // Catch:{ Exception -> 0x01be }
                boolean r6 = r5.exists()     // Catch:{ Exception -> 0x01be }
                if (r6 == 0) goto L_0x00d1
                r5.delete()     // Catch:{ Exception -> 0x01be }
            L_0x00d1:
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x01be }
                java.lang.String r4 = r4.mo10564v()     // Catch:{ Exception -> 0x01be }
                r5.<init>(r4)     // Catch:{ Exception -> 0x01be }
                boolean r4 = r5.exists()     // Catch:{ Exception -> 0x01be }
                if (r4 == 0) goto L_0x00b3
                r5.delete()     // Catch:{ Exception -> 0x01be }
                goto L_0x00b3
            L_0x00e4:
                f.c.p.a.d r15 = r14.this$0     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.db.VideoStoreDatabase r15 = r15.f13570b     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.db.c r15 = r15.mo10390F()     // Catch:{ Exception -> 0x01be }
                r14.L$0 = r1     // Catch:{ Exception -> 0x01be }
                r4 = 2
                r14.label = r4     // Catch:{ Exception -> 0x01be }
                java.lang.Object r15 = r15.mo10413n(r3, r14)     // Catch:{ Exception -> 0x01be }
                if (r15 != r0) goto L_0x00fa
                return r0
            L_0x00fa:
                r14.L$0 = r1     // Catch:{ Exception -> 0x01be }
                r15 = 3
                r14.label = r15     // Catch:{ Exception -> 0x01be }
                java.lang.Object r15 = r1.emit(r2, r14)     // Catch:{ Exception -> 0x01be }
                if (r15 != r0) goto L_0x01ce
                return r0
            L_0x0106:
                java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ Exception -> 0x01be }
                r15.<init>()     // Catch:{ Exception -> 0x01be }
                java.util.List<com.coocent.videostore.po.Video> r3 = r14.$videoList     // Catch:{ Exception -> 0x01be }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x01be }
            L_0x0111:
                boolean r6 = r3.hasNext()     // Catch:{ Exception -> 0x01be }
                if (r6 == 0) goto L_0x019c
                java.lang.Object r6 = r3.next()     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.po.Video r6 = (com.coocent.videostore.p067po.Video) r6     // Catch:{ Exception -> 0x01be }
                r15.add(r6)     // Catch:{ Exception -> 0x01be }
                java.lang.Boolean r7 = r6.mo10554m()     // Catch:{ Exception -> 0x01be }
                p369i.p387z.p389d.C8594l.m46770d(r7, r5)     // Catch:{ Exception -> 0x01be }
                boolean r7 = r7.booleanValue()     // Catch:{ Exception -> 0x01be }
                if (r7 == 0) goto L_0x0152
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01be }
                java.lang.String r8 = r6.mo10561t()     // Catch:{ Exception -> 0x01be }
                r7.<init>(r8)     // Catch:{ Exception -> 0x01be }
                boolean r8 = r7.exists()     // Catch:{ Exception -> 0x01be }
                if (r8 == 0) goto L_0x013f
                r7.delete()     // Catch:{ Exception -> 0x01be }
            L_0x013f:
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01be }
                java.lang.String r6 = r6.mo10564v()     // Catch:{ Exception -> 0x01be }
                r7.<init>(r6)     // Catch:{ Exception -> 0x01be }
                boolean r6 = r7.exists()     // Catch:{ Exception -> 0x01be }
                if (r6 == 0) goto L_0x0111
                r7.delete()     // Catch:{ Exception -> 0x01be }
                goto L_0x0111
            L_0x0152:
                f.c.p.a.d r7 = r14.this$0     // Catch:{ Exception -> 0x01be }
                android.app.Application r7 = r7.f13569a     // Catch:{ Exception -> 0x01be }
                android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x01be }
                android.net.Uri r8 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x01be }
                java.lang.String r9 = "_id=?"
                java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ Exception -> 0x01be }
                r11 = 0
                long r12 = r6.mo10553l()     // Catch:{ Exception -> 0x01be }
                java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ Exception -> 0x01be }
                r10[r11] = r12     // Catch:{ Exception -> 0x01be }
                int r7 = r7.delete(r8, r9, r10)     // Catch:{ Exception -> 0x01be }
                if (r7 <= 0) goto L_0x0111
                r15.add(r6)     // Catch:{ Exception -> 0x01be }
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01be }
                java.lang.String r8 = r6.mo10561t()     // Catch:{ Exception -> 0x01be }
                r7.<init>(r8)     // Catch:{ Exception -> 0x01be }
                boolean r8 = r7.exists()     // Catch:{ Exception -> 0x01be }
                if (r8 == 0) goto L_0x0188
                r7.delete()     // Catch:{ Exception -> 0x01be }
            L_0x0188:
                java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x01be }
                java.lang.String r6 = r6.mo10564v()     // Catch:{ Exception -> 0x01be }
                r7.<init>(r6)     // Catch:{ Exception -> 0x01be }
                boolean r6 = r7.exists()     // Catch:{ Exception -> 0x01be }
                if (r6 == 0) goto L_0x0111
                r7.delete()     // Catch:{ Exception -> 0x01be }
                goto L_0x0111
            L_0x019c:
                f.c.p.a.d r3 = r14.this$0     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.db.VideoStoreDatabase r3 = r3.f13570b     // Catch:{ Exception -> 0x01be }
                com.coocent.videostore.db.c r3 = r3.mo10390F()     // Catch:{ Exception -> 0x01be }
                r14.L$0 = r1     // Catch:{ Exception -> 0x01be }
                r4 = 4
                r14.label = r4     // Catch:{ Exception -> 0x01be }
                java.lang.Object r15 = r3.mo10413n(r15, r14)     // Catch:{ Exception -> 0x01be }
                if (r15 != r0) goto L_0x01b2
                return r0
            L_0x01b2:
                r14.L$0 = r1     // Catch:{ Exception -> 0x01be }
                r15 = 5
                r14.label = r15     // Catch:{ Exception -> 0x01be }
                java.lang.Object r15 = r1.emit(r2, r14)     // Catch:{ Exception -> 0x01be }
                if (r15 != r0) goto L_0x01ce
                return r0
            L_0x01be:
                r15 = move-exception
                r15.printStackTrace()
                r14.L$0 = r2
                r2 = 6
                r14.label = r2
                java.lang.Object r15 = r1.emit(r15, r14)
                if (r15 != r0) goto L_0x01ce
                return r0
            L_0x01ce:
                i.t r15 = p369i.C8457t.f34900a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4756b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$updateRenameVideo$2", mo30600f = "VideoDataSource.kt", mo30601l = {578}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$b0 */
    /* compiled from: VideoDataSource.kt */
    static final class C4757b0 extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $displayName;
        final /* synthetic */ String $path;
        final /* synthetic */ String $title;
        final /* synthetic */ long $videoId;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4757b0(C4752d dVar, long j, String str, String str2, String str3, C8508d<? super C4757b0> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$videoId = j;
            this.$title = str;
            this.$displayName = str2;
            this.$path = str3;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4757b0(this.this$0, this.$videoId, this.$title, this.$displayName, this.$path, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4757b0) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                C2799c F = this.this$0.f13570b.mo10390F();
                long j = this.$videoId;
                String str = this.$title;
                String str2 = this.$displayName;
                String str3 = this.$path;
                this.label = 1;
                if (F.mo10409j(j, str, str2, str3, this) == d) {
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

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$deleteVideoInFolder$1", mo30600f = "VideoDataSource.kt", mo30601l = {739, 748, 773, 775, 776}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$c */
    /* compiled from: VideoDataSource.kt */
    static final class C4758c extends C8539k implements C8574p<C0654a0<Object>, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<String> $folderPathList;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4758c(List<String> list, C4752d dVar, C8508d<? super C4758c> dVar2) {
            super(2, dVar2);
            this.$folderPathList = list;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4758c cVar = new C4758c(this.$folderPathList, this.this$0, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        public final Object invoke(C0654a0<Object> a0Var, C8508d<? super C8457t> dVar) {
            return ((C4758c) create(a0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0199 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                int r2 = r0.label
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L_0x0053
                if (r2 == r7) goto L_0x0032
                if (r2 == r6) goto L_0x002d
                if (r2 == r5) goto L_0x002d
                if (r2 == r4) goto L_0x0023
                if (r2 != r3) goto L_0x001b
                goto L_0x002d
            L_0x001b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0023:
                java.lang.Object r2 = r0.L$0
                androidx.lifecycle.a0 r2 = (androidx.lifecycle.C0654a0) r2
                p369i.C8450m.m46575b(r21)
                r12 = r0
                goto L_0x018e
            L_0x002d:
                p369i.C8450m.m46575b(r21)
                goto L_0x019a
            L_0x0032:
                java.lang.Object r2 = r0.L$4
                java.util.List r2 = (java.util.List) r2
                java.lang.Object r9 = r0.L$3
                java.util.Iterator r9 = (java.util.Iterator) r9
                java.lang.Object r10 = r0.L$2
                f.c.p.a.d r10 = (p159f.p166c.p231p.p232a.C4752d) r10
                java.lang.Object r11 = r0.L$1
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r12 = r0.L$0
                androidx.lifecycle.a0 r12 = (androidx.lifecycle.C0654a0) r12
                p369i.C8450m.m46575b(r21)
                r13 = r21
                r14 = r0
                r19 = r10
                r10 = r9
                r9 = r12
                r12 = r19
                goto L_0x0097
            L_0x0053:
                p369i.C8450m.m46575b(r21)
                java.lang.Object r2 = r0.L$0
                androidx.lifecycle.a0 r2 = (androidx.lifecycle.C0654a0) r2
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                java.util.List<java.lang.String> r10 = r0.$folderPathList
                f.c.p.a.d r11 = r0.this$0
                java.util.Iterator r10 = r10.iterator()
                r12 = r0
                r19 = r9
                r9 = r2
                r2 = r19
            L_0x006d:
                boolean r13 = r10.hasNext()
                if (r13 == 0) goto L_0x00a0
                java.lang.Object r13 = r10.next()
                java.lang.String r13 = (java.lang.String) r13
                com.coocent.videostore.db.VideoStoreDatabase r14 = r11.f13570b
                com.coocent.videostore.db.c r14 = r14.mo10390F()
                r12.L$0 = r9
                r12.L$1 = r2
                r12.L$2 = r11
                r12.L$3 = r10
                r12.L$4 = r2
                r12.label = r7
                java.lang.Object r13 = r14.mo10404e(r13, r12)
                if (r13 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r14 = r12
                r12 = r11
                r11 = r2
            L_0x0097:
                java.util.Collection r13 = (java.util.Collection) r13
                r2.addAll(r13)
                r2 = r11
                r11 = r12
                r12 = r14
                goto L_0x006d
            L_0x00a0:
                int r10 = android.os.Build.VERSION.SDK_INT
                r11 = 30
                if (r10 < r11) goto L_0x00f2
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00af:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x00cc
                java.lang.Object r4 = r2.next()
                com.coocent.videostore.po.Video r4 = (com.coocent.videostore.p067po.Video) r4
                java.lang.String r4 = r4.mo10567x()
                android.net.Uri r4 = android.net.Uri.parse(r4)
                java.lang.String r5 = "parse(it.uriString)"
                p369i.p387z.p389d.C8594l.m46770d(r4, r5)
                r3.add(r4)
                goto L_0x00af
            L_0x00cc:
                f.c.p.a.d r2 = r12.this$0
                android.app.Application r2 = r2.f13569a
                android.content.ContentResolver r2 = r2.getContentResolver()
                android.app.PendingIntent r2 = android.provider.MediaStore.createDeleteRequest(r2, r3)
                java.lang.String r3 = "createDeleteRequest(mApp…on.contentResolver, list)"
                p369i.p387z.p389d.C8594l.m46770d(r2, r3)
                r12.L$0 = r8
                r12.L$1 = r8
                r12.L$2 = r8
                r12.L$3 = r8
                r12.L$4 = r8
                r12.label = r6
                java.lang.Object r2 = r9.emit(r2, r12)
                if (r2 != r1) goto L_0x019a
                return r1
            L_0x00f2:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                f.c.p.a.d r10 = r12.this$0
                java.util.Iterator r2 = r2.iterator()
            L_0x00fd:
                boolean r11 = r2.hasNext()
                if (r11 == 0) goto L_0x0152
                java.lang.Object r11 = r2.next()
                com.coocent.videostore.po.Video r11 = (com.coocent.videostore.p067po.Video) r11
                android.app.Application r13 = r10.f13569a
                android.content.ContentResolver r13 = r13.getContentResolver()
                android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI
                java.lang.String[] r15 = new java.lang.String[r7]
                r16 = 0
                long r17 = r11.mo10553l()
                java.lang.String r17 = java.lang.String.valueOf(r17)
                r15[r16] = r17
                java.lang.String r3 = "_id=?"
                int r3 = r13.delete(r14, r3, r15)
                if (r3 <= 0) goto L_0x0150
                java.io.File r3 = new java.io.File
                java.lang.String r13 = r11.mo10561t()
                r3.<init>(r13)
                boolean r13 = r3.exists()
                if (r13 == 0) goto L_0x013b
                r3.delete()
            L_0x013b:
                r6.add(r11)
                java.io.File r3 = new java.io.File
                java.lang.String r11 = r11.mo10564v()
                r3.<init>(r11)
                boolean r11 = r3.exists()
                if (r11 == 0) goto L_0x0150
                r3.delete()
            L_0x0150:
                r3 = 5
                goto L_0x00fd
            L_0x0152:
                boolean r2 = r6.isEmpty()
                if (r2 == 0) goto L_0x0170
                f.c.p.d.c.a r2 = new f.c.p.d.c.a
                r2.<init>(r8, r7, r8)
                r12.L$0 = r8
                r12.L$1 = r8
                r12.L$2 = r8
                r12.L$3 = r8
                r12.L$4 = r8
                r12.label = r5
                java.lang.Object r2 = r9.emit(r2, r12)
                if (r2 != r1) goto L_0x019a
                return r1
            L_0x0170:
                f.c.p.a.d r2 = r12.this$0
                com.coocent.videostore.db.VideoStoreDatabase r2 = r2.f13570b
                com.coocent.videostore.db.c r2 = r2.mo10390F()
                r12.L$0 = r9
                r12.L$1 = r8
                r12.L$2 = r8
                r12.L$3 = r8
                r12.L$4 = r8
                r12.label = r4
                java.lang.Object r2 = r2.mo10413n(r6, r12)
                if (r2 != r1) goto L_0x018d
                return r1
            L_0x018d:
                r2 = r9
            L_0x018e:
                r12.L$0 = r8
                r3 = 5
                r12.label = r3
                java.lang.Object r2 = r2.emit(r8, r12)
                if (r2 != r1) goto L_0x019a
                return r1
            L_0x019a:
                i.t r1 = p369i.C8457t.f34900a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4758c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$encryptedDeleteVideo$1", mo30600f = "VideoDataSource.kt", mo30601l = {1283, 1305, 1309, 1311, 1316}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$d */
    /* compiled from: VideoDataSource.kt */
    static final class C4759d extends C8539k implements C8574p<C0654a0<Object>, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ List<Video> $videos;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4759d(List<? extends Video> list, C4752d dVar, String str, C8508d<? super C4759d> dVar2) {
            super(2, dVar2);
            this.$videos = list;
            this.this$0 = dVar;
            this.$path = str;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4759d dVar2 = new C4759d(this.$videos, this.this$0, this.$path, dVar);
            dVar2.L$0 = obj;
            return dVar2;
        }

        public final Object invoke(C0654a0<Object> a0Var, C8508d<? super C8457t> dVar) {
            return ((C4759d) create(a0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: androidx.lifecycle.a0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8 A[Catch:{ Exception -> 0x0168 }] */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x017f A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r1 = r20
                java.lang.Object r2 = p369i.p379w.p380i.C8527d.m46722d()
                int r0 = r1.label
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r0 == 0) goto L_0x005d
                if (r0 == r7) goto L_0x0053
                if (r0 == r6) goto L_0x0037
                if (r0 == r5) goto L_0x002d
                if (r0 == r4) goto L_0x0027
                if (r0 != r3) goto L_0x001f
                p369i.C8450m.m46575b(r21)
                goto L_0x0180
            L_0x001f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0027:
                java.lang.Object r0 = r1.L$0
                r4 = r0
                androidx.lifecycle.a0 r4 = (androidx.lifecycle.C0654a0) r4
                goto L_0x0032
            L_0x002d:
                java.lang.Object r0 = r1.L$0
                r4 = r0
                androidx.lifecycle.a0 r4 = (androidx.lifecycle.C0654a0) r4
            L_0x0032:
                p369i.C8450m.m46575b(r21)     // Catch:{ Exception -> 0x0059 }
                goto L_0x0180
            L_0x0037:
                java.lang.Object r0 = r1.L$2
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r9 = r1.L$1
                java.util.List r9 = (java.util.List) r9
                java.lang.Object r10 = r1.L$0
                androidx.lifecycle.a0 r10 = (androidx.lifecycle.C0654a0) r10
                p369i.C8450m.m46575b(r21)     // Catch:{ Exception -> 0x004e }
                r11 = r1
                r19 = r10
                r10 = r9
                r9 = r19
                goto L_0x013d
            L_0x004e:
                r0 = move-exception
                r11 = r1
                r4 = r10
                goto L_0x016d
            L_0x0053:
                java.lang.Object r0 = r1.L$0
                r4 = r0
                androidx.lifecycle.a0 r4 = (androidx.lifecycle.C0654a0) r4
                goto L_0x0032
            L_0x0059:
                r0 = move-exception
                r11 = r1
                goto L_0x016d
            L_0x005d:
                p369i.C8450m.m46575b(r21)
                java.lang.Object r0 = r1.L$0
                r9 = r0
                androidx.lifecycle.a0 r9 = (androidx.lifecycle.C0654a0) r9
                int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x016a }
                r10 = 30
                if (r0 < r10) goto L_0x00b1
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x016a }
                r0.<init>()     // Catch:{ Exception -> 0x016a }
                java.util.List<com.coocent.videostore.po.Video> r4 = r1.$videos     // Catch:{ Exception -> 0x016a }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x016a }
            L_0x0076:
                boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x016a }
                if (r5 == 0) goto L_0x0093
                java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x016a }
                com.coocent.videostore.po.Video r5 = (com.coocent.videostore.p067po.Video) r5     // Catch:{ Exception -> 0x016a }
                java.lang.String r5 = r5.mo10567x()     // Catch:{ Exception -> 0x016a }
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x016a }
                java.lang.String r6 = "parse(video.uriString)"
                p369i.p387z.p389d.C8594l.m46770d(r5, r6)     // Catch:{ Exception -> 0x016a }
                r0.add(r5)     // Catch:{ Exception -> 0x016a }
                goto L_0x0076
            L_0x0093:
                f.c.p.a.d r4 = r1.this$0     // Catch:{ Exception -> 0x016a }
                android.app.Application r4 = r4.f13569a     // Catch:{ Exception -> 0x016a }
                android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x016a }
                android.app.PendingIntent r0 = android.provider.MediaStore.createDeleteRequest(r4, r0)     // Catch:{ Exception -> 0x016a }
                java.lang.String r4 = "createDeleteRequest(mApp…on.contentResolver, list)"
                p369i.p387z.p389d.C8594l.m46770d(r0, r4)     // Catch:{ Exception -> 0x016a }
                r1.L$0 = r9     // Catch:{ Exception -> 0x016a }
                r1.label = r7     // Catch:{ Exception -> 0x016a }
                java.lang.Object r0 = r9.emit(r0, r1)     // Catch:{ Exception -> 0x016a }
                if (r0 != r2) goto L_0x0180
                return r2
            L_0x00b1:
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ Exception -> 0x016a }
                r0.<init>()     // Catch:{ Exception -> 0x016a }
                java.util.List<com.coocent.videostore.po.Video> r10 = r1.$videos     // Catch:{ Exception -> 0x016a }
                java.util.Iterator r10 = r10.iterator()     // Catch:{ Exception -> 0x016a }
                r11 = r1
                r19 = r10
                r10 = r0
                r0 = r19
            L_0x00c2:
                boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0168 }
                if (r12 == 0) goto L_0x013f
                java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0168 }
                com.coocent.videostore.po.Video r12 = (com.coocent.videostore.p067po.Video) r12     // Catch:{ Exception -> 0x0168 }
                f.c.p.a.d r13 = r11.this$0     // Catch:{ Exception -> 0x0168 }
                android.app.Application r13 = r13.f13569a     // Catch:{ Exception -> 0x0168 }
                android.content.ContentResolver r13 = r13.getContentResolver()     // Catch:{ Exception -> 0x0168 }
                android.net.Uri r14 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0168 }
                java.lang.String r15 = "_id=?"
                java.lang.String[] r3 = new java.lang.String[r7]     // Catch:{ Exception -> 0x0168 }
                r16 = 0
                long r17 = r12.mo10553l()     // Catch:{ Exception -> 0x0168 }
                java.lang.String r17 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x0168 }
                r3[r16] = r17     // Catch:{ Exception -> 0x0168 }
                int r3 = r13.delete(r14, r15, r3)     // Catch:{ Exception -> 0x0168 }
                if (r3 <= 0) goto L_0x013d
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0168 }
                java.lang.String r13 = r12.mo10567x()     // Catch:{ Exception -> 0x0168 }
                r3.<init>(r13)     // Catch:{ Exception -> 0x0168 }
                boolean r13 = r3.exists()     // Catch:{ Exception -> 0x0168 }
                if (r13 == 0) goto L_0x0102
                r3.delete()     // Catch:{ Exception -> 0x0168 }
            L_0x0102:
                r10.add(r12)     // Catch:{ Exception -> 0x0168 }
                java.lang.Boolean r3 = p369i.p379w.p381j.p382a.C8529b.m46723a(r7)     // Catch:{ Exception -> 0x0168 }
                r12.mo10526O(r3)     // Catch:{ Exception -> 0x0168 }
                java.lang.String r3 = r12.mo10561t()     // Catch:{ Exception -> 0x0168 }
                r12.mo10527P(r3)     // Catch:{ Exception -> 0x0168 }
                java.lang.String r3 = r12.mo10567x()     // Catch:{ Exception -> 0x0168 }
                r12.mo10528Q(r3)     // Catch:{ Exception -> 0x0168 }
                java.lang.String r3 = r11.$path     // Catch:{ Exception -> 0x0168 }
                r12.mo10533W(r3)     // Catch:{ Exception -> 0x0168 }
                java.lang.String r3 = r11.$path     // Catch:{ Exception -> 0x0168 }
                r12.mo10540b0(r3)     // Catch:{ Exception -> 0x0168 }
                f.c.p.a.d r3 = r11.this$0     // Catch:{ Exception -> 0x0168 }
                com.coocent.videostore.db.VideoStoreDatabase r3 = r3.f13570b     // Catch:{ Exception -> 0x0168 }
                com.coocent.videostore.db.c r3 = r3.mo10390F()     // Catch:{ Exception -> 0x0168 }
                r11.L$0 = r9     // Catch:{ Exception -> 0x0168 }
                r11.L$1 = r10     // Catch:{ Exception -> 0x0168 }
                r11.L$2 = r0     // Catch:{ Exception -> 0x0168 }
                r11.label = r6     // Catch:{ Exception -> 0x0168 }
                java.lang.Object r3 = r3.mo10416q(r12, r11)     // Catch:{ Exception -> 0x0168 }
                if (r3 != r2) goto L_0x013d
                return r2
            L_0x013d:
                r3 = 5
                goto L_0x00c2
            L_0x013f:
                boolean r0 = r10.isEmpty()     // Catch:{ Exception -> 0x0168 }
                if (r0 == 0) goto L_0x0159
                f.c.p.d.c.a r0 = new f.c.p.d.c.a     // Catch:{ Exception -> 0x0168 }
                r0.<init>(r8, r7, r8)     // Catch:{ Exception -> 0x0168 }
                r11.L$0 = r9     // Catch:{ Exception -> 0x0168 }
                r11.L$1 = r8     // Catch:{ Exception -> 0x0168 }
                r11.L$2 = r8     // Catch:{ Exception -> 0x0168 }
                r11.label = r5     // Catch:{ Exception -> 0x0168 }
                java.lang.Object r0 = r9.emit(r0, r11)     // Catch:{ Exception -> 0x0168 }
                if (r0 != r2) goto L_0x0180
                return r2
            L_0x0159:
                r11.L$0 = r9     // Catch:{ Exception -> 0x0168 }
                r11.L$1 = r8     // Catch:{ Exception -> 0x0168 }
                r11.L$2 = r8     // Catch:{ Exception -> 0x0168 }
                r11.label = r4     // Catch:{ Exception -> 0x0168 }
                java.lang.Object r0 = r9.emit(r8, r11)     // Catch:{ Exception -> 0x0168 }
                if (r0 != r2) goto L_0x0180
                return r2
            L_0x0168:
                r0 = move-exception
                goto L_0x016c
            L_0x016a:
                r0 = move-exception
                r11 = r1
            L_0x016c:
                r4 = r9
            L_0x016d:
                r0.printStackTrace()
                r11.L$0 = r8
                r11.L$1 = r8
                r11.L$2 = r8
                r3 = 5
                r11.label = r3
                java.lang.Object r0 = r4.emit(r0, r11)
                if (r0 != r2) goto L_0x0180
                return r2
            L_0x0180:
                i.t r0 = p369i.C8457t.f34900a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4759d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$fetchVideoInfo$1", mo30600f = "VideoDataSource.kt", mo30601l = {912}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$e */
    /* compiled from: VideoDataSource.kt */
    static final class C4760e extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Video $video;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4760e(Video video, C4752d dVar, C8508d<? super C4760e> dVar2) {
            super(2, dVar2);
            this.$video = video;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4760e(this.$video, this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4760e) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x009a A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00e1 A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00f0 A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x010f A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x01a5 A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01a6 A[Catch:{ Exception -> 0x01e2 }] */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01ab A[SYNTHETIC, Splitter:B:95:0x01ab] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                int r1 = r14.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0019
                if (r1 != r3) goto L_0x0011
                p369i.C8450m.m46575b(r15)     // Catch:{ Exception -> 0x01e5 }
                goto L_0x01ef
            L_0x0011:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0019:
                p369i.C8450m.m46575b(r15)
                com.coocent.videostore.po.Video r15 = r14.$video     // Catch:{ Exception -> 0x01e5 }
                long r4 = r15.mo10547g()     // Catch:{ Exception -> 0x01e5 }
                r6 = 0
                r15 = 0
                int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r1 != 0) goto L_0x0055
                android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x01e5 }
                r1.<init>()     // Catch:{ Exception -> 0x01e5 }
                f.c.p.a.d r4 = r14.this$0     // Catch:{ Exception -> 0x01e2 }
                android.app.Application r4 = r4.f13569a     // Catch:{ Exception -> 0x01e2 }
                com.coocent.videostore.po.Video r5 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r5 = r5.mo10567x()     // Catch:{ Exception -> 0x01e2 }
                android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ Exception -> 0x01e2 }
                r1.setDataSource(r4, r5)     // Catch:{ Exception -> 0x01e2 }
                r4 = 9
                java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ Exception -> 0x01e2 }
                if (r4 != 0) goto L_0x004a
                goto L_0x0056
            L_0x004a:
                com.coocent.videostore.po.Video r5 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                long r6 = java.lang.Long.parseLong(r4)     // Catch:{ Exception -> 0x01e2 }
                r5.mo10520G(r6)     // Catch:{ Exception -> 0x01e2 }
                r4 = 1
                goto L_0x0057
            L_0x0055:
                r1 = r2
            L_0x0056:
                r4 = 0
            L_0x0057:
                com.coocent.videostore.po.Video r5 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                int r5 = r5.mo10568y()     // Catch:{ Exception -> 0x01e2 }
                if (r5 != 0) goto L_0x0092
                if (r1 != 0) goto L_0x007f
                android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x01e2 }
                r5.<init>()     // Catch:{ Exception -> 0x01e2 }
                f.c.p.a.d r1 = r14.this$0     // Catch:{ Exception -> 0x007b }
                android.app.Application r1 = r1.f13569a     // Catch:{ Exception -> 0x007b }
                com.coocent.videostore.po.Video r6 = r14.$video     // Catch:{ Exception -> 0x007b }
                java.lang.String r6 = r6.mo10567x()     // Catch:{ Exception -> 0x007b }
                android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x007b }
                r5.setDataSource(r1, r6)     // Catch:{ Exception -> 0x007b }
                r1 = r5
                goto L_0x007f
            L_0x007b:
                r15 = move-exception
                r2 = r5
                goto L_0x01e6
            L_0x007f:
                r5 = 18
                java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ Exception -> 0x01e2 }
                if (r5 != 0) goto L_0x0088
                goto L_0x0092
            L_0x0088:
                com.coocent.videostore.po.Video r4 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x01e2 }
                r4.mo10541c0(r5)     // Catch:{ Exception -> 0x01e2 }
                r4 = 1
            L_0x0092:
                com.coocent.videostore.po.Video r5 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                int r5 = r5.mo10552k()     // Catch:{ Exception -> 0x01e2 }
                if (r5 != 0) goto L_0x00c8
                if (r1 != 0) goto L_0x00b5
                android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x01e2 }
                r5.<init>()     // Catch:{ Exception -> 0x01e2 }
                f.c.p.a.d r1 = r14.this$0     // Catch:{ Exception -> 0x007b }
                android.app.Application r1 = r1.f13569a     // Catch:{ Exception -> 0x007b }
                com.coocent.videostore.po.Video r6 = r14.$video     // Catch:{ Exception -> 0x007b }
                java.lang.String r6 = r6.mo10567x()     // Catch:{ Exception -> 0x007b }
                android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ Exception -> 0x007b }
                r5.setDataSource(r1, r6)     // Catch:{ Exception -> 0x007b }
                r1 = r5
            L_0x00b5:
                r5 = 19
                java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ Exception -> 0x01e2 }
                if (r5 != 0) goto L_0x00be
                goto L_0x00c8
            L_0x00be:
                com.coocent.videostore.po.Video r4 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x01e2 }
                r4.mo10524M(r5)     // Catch:{ Exception -> 0x01e2 }
                r4 = 1
            L_0x00c8:
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x01e2 }
                f.c.p.a.d r6 = r14.this$0     // Catch:{ Exception -> 0x01e2 }
                android.app.Application r6 = r6.f13569a     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r7 = android.os.Environment.DIRECTORY_PICTURES     // Catch:{ Exception -> 0x01e2 }
                java.io.File r6 = r6.getExternalFilesDir(r7)     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r7 = "thumbnail"
                r5.<init>(r6, r7)     // Catch:{ Exception -> 0x01e2 }
                boolean r6 = r5.exists()     // Catch:{ Exception -> 0x01e2 }
                if (r6 != 0) goto L_0x00e4
                r5.mkdir()     // Catch:{ Exception -> 0x01e2 }
            L_0x00e4:
                com.coocent.videostore.po.Video r6 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r6 = r6.mo10564v()     // Catch:{ Exception -> 0x01e2 }
                boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x01e2 }
                if (r6 == 0) goto L_0x00fe
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01e2 }
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x01e2 }
                r6.<init>(r5, r7)     // Catch:{ Exception -> 0x01e2 }
                goto L_0x0109
            L_0x00fe:
                java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01e2 }
                com.coocent.videostore.po.Video r5 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r5 = r5.mo10564v()     // Catch:{ Exception -> 0x01e2 }
                r6.<init>(r5)     // Catch:{ Exception -> 0x01e2 }
            L_0x0109:
                boolean r5 = r6.exists()     // Catch:{ Exception -> 0x01e2 }
                if (r5 != 0) goto L_0x01a3
                if (r1 != 0) goto L_0x012a
                android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch:{ Exception -> 0x01e2 }
                r5.<init>()     // Catch:{ Exception -> 0x01e2 }
                f.c.p.a.d r1 = r14.this$0     // Catch:{ Exception -> 0x007b }
                android.app.Application r1 = r1.f13569a     // Catch:{ Exception -> 0x007b }
                com.coocent.videostore.po.Video r7 = r14.$video     // Catch:{ Exception -> 0x007b }
                java.lang.String r7 = r7.mo10567x()     // Catch:{ Exception -> 0x007b }
                android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x007b }
                r5.setDataSource(r1, r7)     // Catch:{ Exception -> 0x007b }
                r1 = r5
            L_0x012a:
                com.coocent.videostore.po.Video r5 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                int r5 = r5.mo10568y()     // Catch:{ Exception -> 0x01e2 }
                com.coocent.videostore.po.Video r7 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                int r7 = r7.mo10552k()     // Catch:{ Exception -> 0x01e2 }
                if (r5 < r7) goto L_0x0139
                r15 = 1
            L_0x0139:
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01e2 }
                r7 = 27
                r8 = 480(0x1e0, float:6.73E-43)
                r9 = 270(0x10e, float:3.78E-43)
                if (r5 < r7) goto L_0x015e
                r10 = -1
                r12 = 2
                if (r15 == 0) goto L_0x014b
                r13 = 480(0x1e0, float:6.73E-43)
                goto L_0x014d
            L_0x014b:
                r13 = 270(0x10e, float:3.78E-43)
            L_0x014d:
                if (r15 == 0) goto L_0x0152
                r15 = 270(0x10e, float:3.78E-43)
                goto L_0x0154
            L_0x0152:
                r15 = 480(0x1e0, float:6.73E-43)
            L_0x0154:
                r7 = r1
                r8 = r10
                r10 = r12
                r11 = r13
                r12 = r15
                android.graphics.Bitmap r15 = r7.getScaledFrameAtTime(r8, r10, r11, r12)     // Catch:{ Exception -> 0x01e2 }
                goto L_0x0178
            L_0x015e:
                r10 = -1
                r7 = 2
                android.graphics.Bitmap r7 = r1.getFrameAtTime(r10, r7)     // Catch:{ Exception -> 0x01e2 }
                if (r7 != 0) goto L_0x0169
                r15 = r7
                goto L_0x0178
            L_0x0169:
                if (r15 == 0) goto L_0x016e
                r10 = 480(0x1e0, float:6.73E-43)
                goto L_0x0170
            L_0x016e:
                r10 = 270(0x10e, float:3.78E-43)
            L_0x0170:
                if (r15 == 0) goto L_0x0174
                r8 = 270(0x10e, float:3.78E-43)
            L_0x0174:
                android.graphics.Bitmap r15 = android.media.ThumbnailUtils.extractThumbnail(r7, r10, r8)     // Catch:{ Exception -> 0x01e2 }
            L_0x0178:
                if (r15 != 0) goto L_0x017b
                goto L_0x01a3
            L_0x017b:
                com.coocent.videostore.po.Video r4 = r14.$video     // Catch:{ Exception -> 0x01e2 }
                java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x01e2 }
                r7.<init>(r6)     // Catch:{ Exception -> 0x01e2 }
                r8 = 30
                if (r5 < r8) goto L_0x018e
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.WEBP_LOSSLESS     // Catch:{ Exception -> 0x01e2 }
                r8 = 100
                r15.compress(r5, r8, r7)     // Catch:{ Exception -> 0x01e2 }
                goto L_0x0195
            L_0x018e:
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ Exception -> 0x01e2 }
                r8 = 75
                r15.compress(r5, r8, r7)     // Catch:{ Exception -> 0x01e2 }
            L_0x0195:
                r7.flush()     // Catch:{ Exception -> 0x01e2 }
                r7.close()     // Catch:{ Exception -> 0x01e2 }
                java.lang.String r15 = r6.getPath()     // Catch:{ Exception -> 0x01e2 }
                r4.mo10536Z(r15)     // Catch:{ Exception -> 0x01e2 }
                r4 = 1
            L_0x01a3:
                if (r1 != 0) goto L_0x01a6
                goto L_0x01a9
            L_0x01a6:
                r1.release()     // Catch:{ Exception -> 0x01e2 }
            L_0x01a9:
                if (r4 == 0) goto L_0x01ef
                f.c.p.a.d r15 = r14.this$0     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.db.VideoStoreDatabase r15 = r15.f13570b     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.db.c r4 = r15.mo10390F()     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.po.Video r15 = r14.$video     // Catch:{ Exception -> 0x01e5 }
                long r5 = r15.mo10553l()     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.po.Video r15 = r14.$video     // Catch:{ Exception -> 0x01e5 }
                long r7 = r15.mo10547g()     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.po.Video r15 = r14.$video     // Catch:{ Exception -> 0x01e5 }
                int r9 = r15.mo10568y()     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.po.Video r15 = r14.$video     // Catch:{ Exception -> 0x01e5 }
                int r10 = r15.mo10552k()     // Catch:{ Exception -> 0x01e5 }
                com.coocent.videostore.po.Video r15 = r14.$video     // Catch:{ Exception -> 0x01e5 }
                java.lang.String r11 = r15.mo10564v()     // Catch:{ Exception -> 0x01e5 }
                java.lang.String r15 = "video.thumbnail"
                p369i.p387z.p389d.C8594l.m46770d(r11, r15)     // Catch:{ Exception -> 0x01e5 }
                r14.label = r3     // Catch:{ Exception -> 0x01e5 }
                r12 = r14
                java.lang.Object r15 = r4.mo10410k(r5, r7, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01e5 }
                if (r15 != r0) goto L_0x01ef
                return r0
            L_0x01e2:
                r15 = move-exception
                r2 = r1
                goto L_0x01e6
            L_0x01e5:
                r15 = move-exception
            L_0x01e6:
                r15.printStackTrace()
                if (r2 != 0) goto L_0x01ec
                goto L_0x01ef
            L_0x01ec:
                r2.release()
            L_0x01ef:
                i.t r15 = p369i.C8457t.f34900a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4760e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$getVideosInFolder$1", mo30600f = "VideoDataSource.kt", mo30601l = {544, 546}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$f */
    /* compiled from: VideoDataSource.kt */
    static final class C4761f extends C8539k implements C8574p<C0654a0<List<? extends Video>>, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<String> $folderPathList;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4761f(List<String> list, C4752d dVar, C8508d<? super C4761f> dVar2) {
            super(2, dVar2);
            this.$folderPathList = list;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4761f fVar = new C4761f(this.$folderPathList, this.this$0, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        public final Object invoke(C0654a0<List<Video>> a0Var, C8508d<? super C8457t> dVar) {
            return ((C4761f) create(a0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                int r1 = r8.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                p369i.C8450m.m46575b(r9)
                goto L_0x0093
            L_0x0013:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x001b:
                java.lang.Object r1 = r8.L$3
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r4 = r8.L$2
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r8.L$1
                java.util.List r5 = (java.util.List) r5
                java.lang.Object r6 = r8.L$0
                androidx.lifecycle.a0 r6 = (androidx.lifecycle.C0654a0) r6
                p369i.C8450m.m46575b(r9)
                r7 = r6
                r6 = r4
                r4 = r1
                r1 = r0
                r0 = r8
                goto L_0x0076
            L_0x0034:
                p369i.C8450m.m46575b(r9)
                java.lang.Object r9 = r8.L$0
                androidx.lifecycle.a0 r9 = (androidx.lifecycle.C0654a0) r9
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.List<java.lang.String> r4 = r8.$folderPathList
                java.util.Iterator r4 = r4.iterator()
                r6 = r9
                r9 = r8
            L_0x0048:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x0081
                java.lang.Object r5 = r4.next()
                java.lang.String r5 = (java.lang.String) r5
                f.c.p.a.d r7 = r9.this$0
                com.coocent.videostore.db.VideoStoreDatabase r7 = r7.f13570b
                com.coocent.videostore.db.c r7 = r7.mo10390F()
                r9.L$0 = r6
                r9.L$1 = r1
                r9.L$2 = r4
                r9.L$3 = r1
                r9.label = r3
                java.lang.Object r5 = r7.mo10404e(r5, r9)
                if (r5 != r0) goto L_0x006f
                return r0
            L_0x006f:
                r7 = r6
                r6 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                r9 = r5
                r5 = r4
            L_0x0076:
                java.util.Collection r9 = (java.util.Collection) r9
                r4.addAll(r9)
                r9 = r0
                r0 = r1
                r1 = r5
                r4 = r6
                r6 = r7
                goto L_0x0048
            L_0x0081:
                r3 = 0
                r9.L$0 = r3
                r9.L$1 = r3
                r9.L$2 = r3
                r9.L$3 = r3
                r9.label = r2
                java.lang.Object r9 = r6.emit(r1, r9)
                if (r9 != r0) goto L_0x0093
                return r0
            L_0x0093:
                i.t r9 = p369i.C8457t.f34900a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4761f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$removeVideosDbAndDeleteThumbnails$1", mo30600f = "VideoDataSource.kt", mo30601l = {714}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$g */
    /* compiled from: VideoDataSource.kt */
    static final class C4762g extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ List<Video> $videoList;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4762g(List<Video> list, C4752d dVar, C8508d<? super C4762g> dVar2) {
            super(2, dVar2);
            this.$videoList = list;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4762g(this.$videoList, this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4762g) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 != r2) goto L_0x0018
                java.lang.Object r1 = r6.L$1
                com.coocent.videostore.po.Video r1 = (com.coocent.videostore.p067po.Video) r1
                java.lang.Object r3 = r6.L$0
                java.util.Iterator r3 = (java.util.Iterator) r3
                p369i.C8450m.m46575b(r7)
                r7 = r6
                goto L_0x0050
            L_0x0018:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x0020:
                p369i.C8450m.m46575b(r7)
                java.util.List<com.coocent.videostore.po.Video> r7 = r6.$videoList
                java.util.Iterator r7 = r7.iterator()
                r3 = r7
                r7 = r6
            L_0x002b:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L_0x0063
                java.lang.Object r1 = r3.next()
                com.coocent.videostore.po.Video r1 = (com.coocent.videostore.p067po.Video) r1
                f.c.p.a.d r4 = r7.this$0
                com.coocent.videostore.db.VideoStoreDatabase r4 = r4.f13570b
                com.coocent.videostore.db.c r4 = r4.mo10390F()
                java.util.List<com.coocent.videostore.po.Video> r5 = r7.$videoList
                r7.L$0 = r3
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r4 = r4.mo10413n(r5, r7)
                if (r4 != r0) goto L_0x0050
                return r0
            L_0x0050:
                java.io.File r4 = new java.io.File
                java.lang.String r1 = r1.mo10564v()
                r4.<init>(r1)
                boolean r1 = r4.exists()
                if (r1 == 0) goto L_0x002b
                r4.delete()
                goto L_0x002b
            L_0x0063:
                java.util.List<com.coocent.videostore.po.Video> r7 = r7.$videoList
                r7.clear()
                i.t r7 = p369i.C8457t.f34900a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4762g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$renameVideo$1", mo30600f = "VideoDataSource.kt", mo30601l = {602, 603, 605, 606, 610, 611, 613, 617, 621}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$h */
    /* compiled from: VideoDataSource.kt */
    static final class C4763h extends C8539k implements C8574p<C0654a0<Exception>, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $title;
        final /* synthetic */ Video $video;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4763h(String str, Video video, C4752d dVar, C8508d<? super C4763h> dVar2) {
            super(2, dVar2);
            this.$title = str;
            this.$video = video;
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4763h hVar = new C4763h(this.$title, this.$video, this.this$0, dVar);
            hVar.L$0 = obj;
            return hVar;
        }

        public final Object invoke(C0654a0<Exception> a0Var, C8508d<? super C8457t> dVar) {
            return ((C4763h) create(a0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v31, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: androidx.lifecycle.a0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: androidx.lifecycle.a0} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            r8.L$0 = r1;
            r8.label = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
            if (r1.emit(null, r8) != r9) goto L_0x01d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0111, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r8.L$0 = r1;
            r8.label = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
            if (r1.emit(null, r8) != r9) goto L_0x01d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r8.L$0 = r1;
            r8.label = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a0, code lost:
            if (r1.emit(null, r8) != r9) goto L_0x01d8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a2, code lost:
            return r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            p369i.C8450m.m46575b(r18);
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0106=Splitter:B:36:0x0106, B:60:0x0197=Splitter:B:60:0x0197, B:49:0x0148=Splitter:B:49:0x0148, B:6:0x001e=Splitter:B:6:0x001e} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r8 = r17
                java.lang.Object r9 = p369i.p379w.p380i.C8527d.m46722d()
                int r0 = r8.label
                r10 = 0
                switch(r0) {
                    case 0: goto L_0x005c;
                    case 1: goto L_0x004f;
                    case 2: goto L_0x0049;
                    case 3: goto L_0x003f;
                    case 4: goto L_0x0039;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x0029;
                    case 7: goto L_0x0023;
                    case 8: goto L_0x0019;
                    case 9: goto L_0x0014;
                    default: goto L_0x000c;
                }
            L_0x000c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0014:
                p369i.C8450m.m46575b(r18)
                goto L_0x01d8
            L_0x0019:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
            L_0x001e:
                p369i.C8450m.m46575b(r18)     // Catch:{ Exception -> 0x0059 }
                goto L_0x01d8
            L_0x0023:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                goto L_0x001e
            L_0x0029:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                goto L_0x001e
            L_0x002f:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                p369i.C8450m.m46575b(r18)     // Catch:{ Exception -> 0x0059 }
                goto L_0x0197
            L_0x0039:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                goto L_0x001e
            L_0x003f:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                p369i.C8450m.m46575b(r18)     // Catch:{ Exception -> 0x0059 }
                goto L_0x0148
            L_0x0049:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                goto L_0x001e
            L_0x004f:
                java.lang.Object r0 = r8.L$0
                r1 = r0
                androidx.lifecycle.a0 r1 = (androidx.lifecycle.C0654a0) r1
                p369i.C8450m.m46575b(r18)     // Catch:{ Exception -> 0x0059 }
                goto L_0x0106
            L_0x0059:
                r0 = move-exception
                goto L_0x01c8
            L_0x005c:
                p369i.C8450m.m46575b(r18)
                java.lang.Object r0 = r8.L$0
                r11 = r0
                androidx.lifecycle.a0 r11 = (androidx.lifecycle.C0654a0) r11
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01c6 }
                r0.<init>()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r1 = r8.$title     // Catch:{ Exception -> 0x01c6 }
                r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
                r1 = 46
                r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r1 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r1 = r1.mo10548h()     // Catch:{ Exception -> 0x01c6 }
                r0.append(r1)     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r5 = r0.toString()     // Catch:{ Exception -> 0x01c6 }
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r1 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r1 = r1.mo10551j()     // Catch:{ Exception -> 0x01c6 }
                r0.<init>(r1, r5)     // Catch:{ Exception -> 0x01c6 }
                android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x01c6 }
                r1.<init>()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r2 = "_display_name"
                r1.put(r2, r5)     // Catch:{ Exception -> 0x01c6 }
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01c6 }
                r3 = 30
                if (r2 >= r3) goto L_0x00a4
                java.lang.String r4 = "_data"
                java.lang.String r6 = r0.getPath()     // Catch:{ Exception -> 0x01c6 }
                r1.put(r4, r6)     // Catch:{ Exception -> 0x01c6 }
            L_0x00a4:
                android.net.Uri r4 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r6 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                long r6 = r6.mo10553l()     // Catch:{ Exception -> 0x01c6 }
                android.net.Uri r4 = android.content.ContentUris.withAppendedId(r4, r6)     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r6 = "withAppendedId(MediaStor…AL_CONTENT_URI, video.id)"
                p369i.p387z.p389d.C8594l.m46770d(r4, r6)     // Catch:{ Exception -> 0x01c6 }
                f.c.p.a.d r6 = r8.this$0     // Catch:{ Exception -> 0x01c6 }
                android.app.Application r6 = r6.f13569a     // Catch:{ Exception -> 0x01c6 }
                android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r7 = "_id = ?"
                r12 = 1
                java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ Exception -> 0x01c6 }
                r14 = 0
                com.coocent.videostore.po.Video r15 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                long r15 = r15.mo10553l()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r15 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x01c6 }
                r13[r14] = r15     // Catch:{ Exception -> 0x01c6 }
                int r1 = r6.update(r4, r1, r7, r13)     // Catch:{ Exception -> 0x01c6 }
                if (r1 <= 0) goto L_0x01b4
                java.lang.String r1 = "renameFile.path"
                if (r2 < r3) goto L_0x0112
                f.c.p.a.d r2 = r8.this$0     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.db.VideoStoreDatabase r2 = r2.f13570b     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.db.c r2 = r2.mo10390F()     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r3 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                long r3 = r3.mo10553l()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r6 = r8.$title     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x01c6 }
                p369i.p387z.p389d.C8594l.m46770d(r0, r1)     // Catch:{ Exception -> 0x01c6 }
                r8.L$0 = r11     // Catch:{ Exception -> 0x01c6 }
                r8.label = r12     // Catch:{ Exception -> 0x01c6 }
                r1 = r2
                r2 = r3
                r4 = r6
                r6 = r0
                r7 = r17
                java.lang.Object r0 = r1.mo10409j(r2, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01c6 }
                if (r0 != r9) goto L_0x0105
                return r9
            L_0x0105:
                r1 = r11
            L_0x0106:
                r8.L$0 = r1     // Catch:{ Exception -> 0x0059 }
                r0 = 2
                r8.label = r0     // Catch:{ Exception -> 0x0059 }
                java.lang.Object r0 = r1.emit(r10, r8)     // Catch:{ Exception -> 0x0059 }
                if (r0 != r9) goto L_0x01d8
                return r9
            L_0x0112:
                r3 = 29
                if (r2 < r3) goto L_0x0154
                boolean r2 = android.os.Environment.isExternalStorageLegacy()     // Catch:{ Exception -> 0x01c6 }
                if (r2 != 0) goto L_0x0154
                f.c.p.a.d r2 = r8.this$0     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.db.VideoStoreDatabase r2 = r2.f13570b     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.db.c r2 = r2.mo10390F()     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r3 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                long r3 = r3.mo10553l()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r6 = r8.$title     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x01c6 }
                p369i.p387z.p389d.C8594l.m46770d(r0, r1)     // Catch:{ Exception -> 0x01c6 }
                r8.L$0 = r11     // Catch:{ Exception -> 0x01c6 }
                r1 = 3
                r8.label = r1     // Catch:{ Exception -> 0x01c6 }
                r1 = r2
                r2 = r3
                r4 = r6
                r6 = r0
                r7 = r17
                java.lang.Object r0 = r1.mo10409j(r2, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01c6 }
                if (r0 != r9) goto L_0x0147
                return r9
            L_0x0147:
                r1 = r11
            L_0x0148:
                r8.L$0 = r1     // Catch:{ Exception -> 0x0059 }
                r0 = 4
                r8.label = r0     // Catch:{ Exception -> 0x0059 }
                java.lang.Object r0 = r1.emit(r10, r8)     // Catch:{ Exception -> 0x0059 }
                if (r0 != r9) goto L_0x01d8
                return r9
            L_0x0154:
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r3 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r3 = r3.mo10551j()     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r4 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r4 = r4.mo10546f()     // Catch:{ Exception -> 0x01c6 }
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x01c6 }
                boolean r2 = r2.renameTo(r0)     // Catch:{ Exception -> 0x01c6 }
                if (r2 == 0) goto L_0x01a3
                f.c.p.a.d r2 = r8.this$0     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.db.VideoStoreDatabase r2 = r2.f13570b     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.db.c r2 = r2.mo10390F()     // Catch:{ Exception -> 0x01c6 }
                com.coocent.videostore.po.Video r3 = r8.$video     // Catch:{ Exception -> 0x01c6 }
                long r3 = r3.mo10553l()     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r6 = r8.$title     // Catch:{ Exception -> 0x01c6 }
                java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x01c6 }
                p369i.p387z.p389d.C8594l.m46770d(r0, r1)     // Catch:{ Exception -> 0x01c6 }
                r8.L$0 = r11     // Catch:{ Exception -> 0x01c6 }
                r1 = 5
                r8.label = r1     // Catch:{ Exception -> 0x01c6 }
                r1 = r2
                r2 = r3
                r4 = r6
                r6 = r0
                r7 = r17
                java.lang.Object r0 = r1.mo10409j(r2, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01c6 }
                if (r0 != r9) goto L_0x0196
                return r9
            L_0x0196:
                r1 = r11
            L_0x0197:
                r8.L$0 = r1     // Catch:{ Exception -> 0x0059 }
                r0 = 6
                r8.label = r0     // Catch:{ Exception -> 0x0059 }
                java.lang.Object r0 = r1.emit(r10, r8)     // Catch:{ Exception -> 0x0059 }
                if (r0 != r9) goto L_0x01d8
                return r9
            L_0x01a3:
                f.c.p.d.c.b r0 = new f.c.p.d.c.b     // Catch:{ Exception -> 0x01c6 }
                r0.<init>(r10, r12, r10)     // Catch:{ Exception -> 0x01c6 }
                r8.L$0 = r11     // Catch:{ Exception -> 0x01c6 }
                r1 = 7
                r8.label = r1     // Catch:{ Exception -> 0x01c6 }
                java.lang.Object r0 = r11.emit(r0, r8)     // Catch:{ Exception -> 0x01c6 }
                if (r0 != r9) goto L_0x01d8
                return r9
            L_0x01b4:
                f.c.p.d.c.b r0 = new f.c.p.d.c.b     // Catch:{ Exception -> 0x01c6 }
                r0.<init>(r10, r12, r10)     // Catch:{ Exception -> 0x01c6 }
                r8.L$0 = r11     // Catch:{ Exception -> 0x01c6 }
                r1 = 8
                r8.label = r1     // Catch:{ Exception -> 0x01c6 }
                java.lang.Object r0 = r11.emit(r0, r8)     // Catch:{ Exception -> 0x01c6 }
                if (r0 != r9) goto L_0x01d8
                return r9
            L_0x01c6:
                r0 = move-exception
                r1 = r11
            L_0x01c8:
                r0.printStackTrace()
                r8.L$0 = r10
                r2 = 9
                r8.label = r2
                java.lang.Object r0 = r1.emit(r0, r8)
                if (r0 != r9) goto L_0x01d8
                return r9
            L_0x01d8:
                i.t r0 = p369i.C8457t.f34900a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4763h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateToSDCard$1", mo30600f = "VideoDataSource.kt", mo30601l = {942, 944, 952, 954}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$i */
    /* compiled from: VideoDataSource.kt */
    static final class C4764i extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4764i(C4752d dVar, C8508d<? super C4764i> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4764i(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4764i) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES), "VPrivate");
                File file2 = new File(file, this.this$0.f13569a.getPackageName());
                if (Build.VERSION.SDK_INT >= 29) {
                    if (Environment.isExternalStorageLegacy() && file.exists() && file2.exists()) {
                        Map e = this.this$0.m20314A(file2);
                        if (e == null || !(!e.isEmpty())) {
                            C4752d dVar = this.this$0;
                            this.label = 2;
                            if (dVar.m20321J(file2, false, this) == d) {
                                return d;
                            }
                        } else {
                            C4752d dVar2 = this.this$0;
                            this.label = 1;
                            if (dVar2.m20318G(file2, e, this) == d) {
                                return d;
                            }
                        }
                    }
                } else if (file.exists() && file2.exists()) {
                    Map e2 = this.this$0.m20314A(file2);
                    if (e2 == null || !(!e2.isEmpty())) {
                        C4752d dVar3 = this.this$0;
                        this.label = 4;
                        if (dVar3.m20321J(file2, false, this) == d) {
                            return d;
                        }
                    } else {
                        C4752d dVar4 = this.this$0;
                        this.label = 3;
                        if (dVar4.m20318G(file2, e2, this) == d) {
                            return d;
                        }
                    }
                }
            } else if (i == 1 || i == 2 || i == 3 || i == 4) {
                try {
                    C8450m.m46575b(obj);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateVideoToDB$1$1", mo30600f = "VideoDataSource.kt", mo30601l = {987, 989, 997, 1002}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$j */
    /* compiled from: VideoDataSource.kt */
    static final class C4765j extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4765j(C4752d dVar, C8508d<? super C4765j> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4765j(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4765j) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0138 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0139 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = p369i.p379w.p380i.C8527d.m46722d()
                int r1 = r11.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x004b
                if (r1 == r5) goto L_0x0047
                if (r1 == r4) goto L_0x003b
                if (r1 == r3) goto L_0x0029
                if (r1 != r2) goto L_0x0021
                java.lang.Object r1 = r11.L$1
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r4 = r11.L$0
                java.util.Map r4 = (java.util.Map) r4
                p369i.C8450m.m46575b(r12)
                goto L_0x00a6
            L_0x0021:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0029:
                java.lang.Object r1 = r11.L$2
                com.coocent.videostore.po.PrivateVideo r1 = (com.coocent.videostore.p067po.PrivateVideo) r1
                java.lang.Object r4 = r11.L$1
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r6 = r11.L$0
                java.util.Map r6 = (java.util.Map) r6
                p369i.C8450m.m46575b(r12)
                r12 = r11
                goto L_0x00ec
            L_0x003b:
                java.lang.Object r1 = r11.L$1
                java.util.Map r1 = (java.util.Map) r1
                java.lang.Object r4 = r11.L$0
                java.util.List r4 = (java.util.List) r4
                p369i.C8450m.m46575b(r12)
                goto L_0x0082
            L_0x0047:
                p369i.C8450m.m46575b(r12)
                goto L_0x0061
            L_0x004b:
                p369i.C8450m.m46575b(r12)
                f.c.p.a.d r12 = r11.this$0
                com.coocent.videostore.db.VideoStoreDatabase r12 = r12.f13570b
                com.coocent.videostore.db.a r12 = r12.mo10389E()
                r11.label = r5
                java.lang.Object r12 = r12.mo10392a(r11)
                if (r12 != r0) goto L_0x0061
                return r0
            L_0x0061:
                java.util.List r12 = (java.util.List) r12
                java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                r1.<init>()
                f.c.p.a.d r6 = r11.this$0
                com.coocent.videostore.db.VideoStoreDatabase r6 = r6.f13570b
                com.coocent.videostore.db.c r6 = r6.mo10390F()
                r11.L$0 = r12
                r11.L$1 = r1
                r11.label = r4
                java.lang.Object r4 = r6.mo10400a(r11)
                if (r4 != r0) goto L_0x007f
                return r0
            L_0x007f:
                r10 = r4
                r4 = r12
                r12 = r10
            L_0x0082:
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.Iterator r12 = r12.iterator()
            L_0x0088:
                boolean r6 = r12.hasNext()
                if (r6 == 0) goto L_0x00a0
                java.lang.Object r6 = r12.next()
                com.coocent.videostore.po.Video r6 = (com.coocent.videostore.p067po.Video) r6
                long r7 = r6.mo10553l()
                java.lang.Long r7 = p369i.p379w.p381j.p382a.C8529b.m46725c(r7)
                r1.put(r7, r6)
                goto L_0x0088
            L_0x00a0:
                java.util.Iterator r12 = r4.iterator()
                r4 = r1
                r1 = r12
            L_0x00a6:
                r12 = r11
            L_0x00a7:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L_0x0139
                java.lang.Object r6 = r1.next()
                com.coocent.videostore.po.PrivateVideo r6 = (com.coocent.videostore.p067po.PrivateVideo) r6
                java.lang.Boolean r7 = p369i.p379w.p381j.p382a.C8529b.m46723a(r5)
                r6.mo10468O(r7)
                long r7 = r6.mo10495l()
                java.lang.Long r7 = p369i.p379w.p381j.p382a.C8529b.m46725c(r7)
                java.lang.Object r7 = r4.get(r7)
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7
                if (r7 != 0) goto L_0x0100
                f.c.p.a.d r7 = r12.this$0
                com.coocent.videostore.db.VideoStoreDatabase r7 = r7.f13570b
                com.coocent.videostore.db.c r7 = r7.mo10390F()
                com.coocent.videostore.po.Video r8 = new com.coocent.videostore.po.Video
                r8.<init>((com.coocent.videostore.p067po.PrivateVideo) r6)
                r12.L$0 = r4
                r12.L$1 = r1
                r12.L$2 = r6
                r12.label = r3
                java.lang.Object r7 = r7.mo10403d(r8, r12)
                if (r7 != r0) goto L_0x00e8
                return r0
            L_0x00e8:
                r10 = r4
                r4 = r1
                r1 = r6
                r6 = r10
            L_0x00ec:
                f.c.p.a.d r7 = r12.this$0
                com.coocent.videostore.db.VideoStoreDatabase r7 = r7.f13570b
                com.coocent.videostore.db.a r7 = r7.mo10389E()
                long r8 = r1.mo10495l()
                r7.mo10393b(r8)
                r1 = r4
                r4 = r6
                goto L_0x00a7
            L_0x0100:
                java.lang.Boolean r8 = r6.mo10496m()
                if (r8 == 0) goto L_0x0117
                java.lang.Boolean r6 = r6.mo10496m()
                java.lang.String r8 = "privateVideo.isPrivateVideo"
                p369i.p387z.p389d.C8594l.m46770d(r6, r8)
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L_0x0117
                r6 = 1
                goto L_0x0118
            L_0x0117:
                r6 = 0
            L_0x0118:
                java.lang.Boolean r6 = p369i.p379w.p381j.p382a.C8529b.m46723a(r6)
                r7.mo10526O(r6)
                f.c.p.a.d r6 = r12.this$0
                com.coocent.videostore.db.VideoStoreDatabase r6 = r6.f13570b
                com.coocent.videostore.db.c r6 = r6.mo10390F()
                r12.L$0 = r4
                r12.L$1 = r1
                r8 = 0
                r12.L$2 = r8
                r12.label = r2
                java.lang.Object r6 = r6.mo10416q(r7, r12)
                if (r6 != r0) goto L_0x00a7
                return r0
            L_0x0139:
                i.t r12 = p369i.C8457t.f34900a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4765j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: f.c.p.a.d$k */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4766k implements C8729b<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13573g;

        /* renamed from: f.c.p.a.d$k$a */
        /* compiled from: Collect.kt */
        public static final class C4767a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13574g;

            @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateWithConfig$$inlined$map$1$2", mo30600f = "VideoDataSource.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.p.a.d$k$a$a */
            public static final class C4768a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4767a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4768a(C4767a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4767a(C8730c cVar) {
                this.f13574g = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p231p.p232a.C4752d.C4766k.C4767a.C4768a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.p.a.d$k$a$a r0 = (p159f.p166c.p231p.p232a.C4752d.C4766k.C4767a.C4768a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.p.a.d$k$a$a r0 = new f.c.p.a.d$k$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0059
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13574g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    java.lang.String r2 = "private_restore_completed"
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16596a(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 != 0) goto L_0x0048
                    r5 = 0
                    goto L_0x004c
                L_0x0048:
                    boolean r5 = r5.booleanValue()
                L_0x004c:
                    java.lang.Boolean r5 = p369i.p379w.p381j.p382a.C8529b.m46723a(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0059
                    return r1
                L_0x0059:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4766k.C4767a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4766k(C8729b bVar) {
            this.f13573g = bVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13573g.collect(new C4767a(cVar), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.p.a.d$l */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4769l implements C8729b<Set<? extends String>> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13575g;

        /* renamed from: f.c.p.a.d$l$a */
        /* compiled from: Collect.kt */
        public static final class C4770a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13576g;

            @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateWithConfig$$inlined$map$2$2", mo30600f = "VideoDataSource.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.p.a.d$l$a$a */
            public static final class C4771a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4770a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4771a(C4770a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4770a(C8730c cVar) {
                this.f13576g = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p231p.p232a.C4752d.C4769l.C4770a.C4771a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.p.a.d$l$a$a r0 = (p159f.p166c.p231p.p232a.C4752d.C4769l.C4770a.C4771a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.p.a.d$l$a$a r0 = new f.c.p.a.d$l$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13576g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    java.lang.String r2 = "private_restore_list"
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16602g(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.util.Set r5 = (java.util.Set) r5
                    if (r5 != 0) goto L_0x004a
                    java.util.Set r5 = p369i.p377u.C8472e0.m46613b()
                L_0x004a:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4769l.C4770a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4769l(C8729b bVar) {
            this.f13575g = bVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13575g.collect(new C4770a(cVar), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource", mo30600f = "VideoDataSource.kt", mo30601l = {1033, 1037, 1078, 1121}, mo30602m = "restorePrivateWithConfig")
    /* renamed from: f.c.p.a.d$m */
    /* compiled from: VideoDataSource.kt */
    static final class C4772m extends C8531d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4772m(C4752d dVar, C8508d<? super C4772m> dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m20318G((File) null, (Map<String, String>) null, this);
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateWithConfig$2$1", mo30600f = "VideoDataSource.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$n */
    /* compiled from: VideoDataSource.kt */
    static final class C4773n extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
        final /* synthetic */ HashSet<String> $restoreSet;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4773n(HashSet<String> hashSet, C8508d<? super C4773n> dVar) {
            super(2, dVar);
            this.$restoreSet = hashSet;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4773n nVar = new C4773n(this.$restoreSet, dVar);
            nVar.L$0 = obj;
            return nVar;
        }

        public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
            return ((C4773n) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                ((C3878a) this.L$0).mo13384i(C3888f.m16602g("private_restore_list"), this.$restoreSet);
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateWithConfig$3$1", mo30600f = "VideoDataSource.kt", mo30601l = {1096}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$o */
    /* compiled from: VideoDataSource.kt */
    static final class C4774o extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Map.Entry<String, String> $entry;
        final /* synthetic */ String $path;
        final /* synthetic */ HashSet<String> $restoreSet;
        final /* synthetic */ Uri $uri;
        int label;
        final /* synthetic */ C4752d this$0;

        @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateWithConfig$3$1$1", mo30600f = "VideoDataSource.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.p.a.d$o$a */
        /* compiled from: VideoDataSource.kt */
        static final class C4775a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
            final /* synthetic */ HashSet<String> $restoreSet;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4775a(HashSet<String> hashSet, C8508d<? super C4775a> dVar) {
                super(2, dVar);
                this.$restoreSet = hashSet;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C4775a aVar = new C4775a(this.$restoreSet, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
                return ((C4775a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    ((C3878a) this.L$0).mo13384i(C3888f.m16602g("private_restore_list"), this.$restoreSet);
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4774o(HashSet<String> hashSet, Map.Entry<String, String> entry, C4752d dVar, Uri uri, String str, C8508d<? super C4774o> dVar2) {
            super(2, dVar2);
            this.$restoreSet = hashSet;
            this.$entry = entry;
            this.this$0 = dVar;
            this.$uri = uri;
            this.$path = str;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4774o(this.$restoreSet, this.$entry, this.this$0, this.$uri, this.$path, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4774o) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                this.$restoreSet.add(this.$entry.getValue());
                C3823f a = C4792e.m20358b(this.this$0.f13569a);
                C4775a aVar = new C4775a(this.$restoreSet, (C8508d<? super C4775a>) null);
                this.label = 1;
                if (C3889g.m16603a(a, aVar, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Uri uri = this.$uri;
            if (uri != null) {
                C4752d dVar = this.this$0;
                C8594l.m46770d(uri, "uri");
                dVar.m20323M(uri);
            } else if (!TextUtils.isEmpty(this.$path)) {
                C4752d dVar2 = this.this$0;
                Uri parse = Uri.parse(this.$path);
                C8594l.m46770d(parse, "parse(path)");
                dVar2.m20323M(parse);
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restorePrivateWithConfig$5", mo30600f = "VideoDataSource.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$p */
    /* compiled from: VideoDataSource.kt */
    static final class C4776p extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
        final /* synthetic */ C8600r $allRestored;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4776p(C8600r rVar, C8508d<? super C4776p> dVar) {
            super(2, dVar);
            this.$allRestored = rVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4776p pVar = new C4776p(this.$allRestored, dVar);
            pVar.L$0 = obj;
            return pVar;
        }

        public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
            return ((C4776p) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                ((C3878a) this.L$0).mo13384i(C3888f.m16596a("private_restore_completed"), C8529b.m46723a(this.$allRestored.element));
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreRecycleBinToSDCard$1", mo30600f = "VideoDataSource.kt", mo30601l = {973, 976}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$q */
    /* compiled from: VideoDataSource.kt */
    static final class C4777q extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4777q(C4752d dVar, C8508d<? super C4777q> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4777q(this.this$0, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4777q) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                File file = new File(externalStorageDirectory, '.' + this.this$0.f13569a.getPackageName() + "/.nomedia/video/recycleBin");
                if (Build.VERSION.SDK_INT < 29) {
                    C4752d dVar = this.this$0;
                    this.label = 2;
                    if (dVar.m20321J(file, true, this) == d) {
                        return d;
                    }
                } else if (Environment.isExternalStorageLegacy()) {
                    C4752d dVar2 = this.this$0;
                    this.label = 1;
                    if (dVar2.m20321J(file, true, this) == d) {
                        return d;
                    }
                }
            } else if (i == 1 || i == 2) {
                try {
                    C8450m.m46575b(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.p.a.d$r */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4778r implements C8729b<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13577g;

        /* renamed from: h */
        final /* synthetic */ C8602t f13578h;

        /* renamed from: f.c.p.a.d$r$a */
        /* compiled from: Collect.kt */
        public static final class C4779a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13579g;

            /* renamed from: h */
            final /* synthetic */ C8602t f13580h;

            @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreVideoWithoutConfig$$inlined$map$1$2", mo30600f = "VideoDataSource.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.p.a.d$r$a$a */
            public static final class C4780a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4779a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4780a(C4779a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4779a(C8730c cVar, C8602t tVar) {
                this.f13579g = cVar;
                this.f13580h = tVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p231p.p232a.C4752d.C4778r.C4779a.C4780a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.p.a.d$r$a$a r0 = (p159f.p166c.p231p.p232a.C4752d.C4778r.C4779a.C4780a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.p.a.d$r$a$a r0 = new f.c.p.a.d$r$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x005d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13579g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    i.z.d.t r2 = r4.f13580h
                    T r2 = r2.element
                    java.lang.String r2 = (java.lang.String) r2
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16596a(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    if (r5 != 0) goto L_0x004c
                    r5 = 0
                    goto L_0x0050
                L_0x004c:
                    boolean r5 = r5.booleanValue()
                L_0x0050:
                    java.lang.Boolean r5 = p369i.p379w.p381j.p382a.C8529b.m46723a(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4778r.C4779a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4778r(C8729b bVar, C8602t tVar) {
            this.f13577g = bVar;
            this.f13578h = tVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13577g.collect(new C4779a(cVar, this.f13578h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    /* renamed from: f.c.p.a.d$s */
    /* compiled from: SafeCollector.common.kt */
    public static final class C4781s implements C8729b<Set<? extends String>> {

        /* renamed from: g */
        final /* synthetic */ C8729b f13581g;

        /* renamed from: h */
        final /* synthetic */ C8602t f13582h;

        /* renamed from: f.c.p.a.d$s$a */
        /* compiled from: Collect.kt */
        public static final class C4782a implements C8730c<C3884d> {

            /* renamed from: g */
            final /* synthetic */ C8730c f13583g;

            /* renamed from: h */
            final /* synthetic */ C8602t f13584h;

            @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreVideoWithoutConfig$$inlined$map$2$2", mo30600f = "VideoDataSource.kt", mo30601l = {137}, mo30602m = "emit")
            /* renamed from: f.c.p.a.d$s$a$a */
            public static final class C4783a extends C8531d {
                Object L$0;
                int label;
                /* synthetic */ Object result;
                final /* synthetic */ C4782a this$0;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C4783a(C4782a aVar, C8508d dVar) {
                    super(dVar);
                    this.this$0 = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit((Object) null, this);
                }
            }

            public C4782a(C8730c cVar, C8602t tVar) {
                this.f13583g = cVar;
                this.f13584h = tVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, p369i.p379w.C8508d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p159f.p166c.p231p.p232a.C4752d.C4781s.C4782a.C4783a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    f.c.p.a.d$s$a$a r0 = (p159f.p166c.p231p.p232a.C4752d.C4781s.C4782a.C4783a) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    f.c.p.a.d$s$a$a r0 = new f.c.p.a.d$s$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = p369i.p379w.p380i.C8527d.m46722d()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    p369i.C8450m.m46575b(r6)
                    goto L_0x0057
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    p369i.C8450m.m46575b(r6)
                    kotlinx.coroutines.f3.c r6 = r4.f13583g
                    e.k.c.i.d r5 = (p082e.p126k.p129c.p130i.C3884d) r5
                    i.z.d.t r2 = r4.f13584h
                    T r2 = r2.element
                    java.lang.String r2 = (java.lang.String) r2
                    e.k.c.i.d$a r2 = p082e.p126k.p129c.p130i.C3888f.m16602g(r2)
                    java.lang.Object r5 = r5.mo13377b(r2)
                    java.util.Set r5 = (java.util.Set) r5
                    if (r5 != 0) goto L_0x004e
                    java.util.Set r5 = p369i.p377u.C8472e0.m46613b()
                L_0x004e:
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0057
                    return r1
                L_0x0057:
                    i.t r5 = p369i.C8457t.f34900a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4781s.C4782a.emit(java.lang.Object, i.w.d):java.lang.Object");
            }
        }

        public C4781s(C8729b bVar, C8602t tVar) {
            this.f13581g = bVar;
            this.f13582h = tVar;
        }

        public Object collect(C8730c cVar, C8508d dVar) {
            Object collect = this.f13581g.collect(new C4782a(cVar, this.f13582h), dVar);
            if (collect == C8527d.m46722d()) {
                return collect;
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource", mo30600f = "VideoDataSource.kt", mo30601l = {1146, 1163, 1196, 1237}, mo30602m = "restoreVideoWithoutConfig")
    /* renamed from: f.c.p.a.d$t */
    /* compiled from: VideoDataSource.kt */
    static final class C4784t extends C8531d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4784t(C4752d dVar, C8508d<? super C4784t> dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.m20321J((File) null, false, this);
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreVideoWithoutConfig$2", mo30600f = "VideoDataSource.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$u */
    /* compiled from: VideoDataSource.kt */
    static final class C4785u extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
        final /* synthetic */ C8602t<String> $restoreListKey;
        final /* synthetic */ HashSet<String> $restoreSet;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4785u(C8602t<String> tVar, HashSet<String> hashSet, C8508d<? super C4785u> dVar) {
            super(2, dVar);
            this.$restoreListKey = tVar;
            this.$restoreSet = hashSet;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4785u uVar = new C4785u(this.$restoreListKey, this.$restoreSet, dVar);
            uVar.L$0 = obj;
            return uVar;
        }

        public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
            return ((C4785u) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                ((C3878a) this.L$0).mo13384i(C3888f.m16602g((String) this.$restoreListKey.element), this.$restoreSet);
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreVideoWithoutConfig$3$1", mo30600f = "VideoDataSource.kt", mo30601l = {1213}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$v */
    /* compiled from: VideoDataSource.kt */
    static final class C4786v extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ String $path;
        final /* synthetic */ HashSet<String> $restoreSet;
        final /* synthetic */ Uri $uri;
        final /* synthetic */ File $videoFile;
        int label;
        final /* synthetic */ C4752d this$0;

        @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreVideoWithoutConfig$3$1$1", mo30600f = "VideoDataSource.kt", mo30601l = {}, mo30602m = "invokeSuspend")
        /* renamed from: f.c.p.a.d$v$a */
        /* compiled from: VideoDataSource.kt */
        static final class C4787a extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
            final /* synthetic */ HashSet<String> $restoreSet;
            /* synthetic */ Object L$0;
            int label;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4787a(HashSet<String> hashSet, C8508d<? super C4787a> dVar) {
                super(2, dVar);
                this.$restoreSet = hashSet;
            }

            public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
                C4787a aVar = new C4787a(this.$restoreSet, dVar);
                aVar.L$0 = obj;
                return aVar;
            }

            public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
                return ((C4787a) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = C8527d.m46722d();
                if (this.label == 0) {
                    C8450m.m46575b(obj);
                    ((C3878a) this.L$0).mo13384i(C3888f.m16602g("private_restore_list"), this.$restoreSet);
                    return C8457t.f34900a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4786v(HashSet<String> hashSet, File file, C4752d dVar, Uri uri, String str, C8508d<? super C4786v> dVar2) {
            super(2, dVar2);
            this.$restoreSet = hashSet;
            this.$videoFile = file;
            this.this$0 = dVar;
            this.$uri = uri;
            this.$path = str;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4786v(this.$restoreSet, this.$videoFile, this.this$0, this.$uri, this.$path, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4786v) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d = C8527d.m46722d();
            int i = this.label;
            if (i == 0) {
                C8450m.m46575b(obj);
                this.$restoreSet.add(this.$videoFile.getPath());
                C3823f a = C4792e.m20358b(this.this$0.f13569a);
                C4787a aVar = new C4787a(this.$restoreSet, (C8508d<? super C4787a>) null);
                this.label = 1;
                if (C3889g.m16603a(a, aVar, this) == d) {
                    return d;
                }
            } else if (i == 1) {
                C8450m.m46575b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Uri uri = this.$uri;
            if (uri != null) {
                C4752d dVar = this.this$0;
                C8594l.m46770d(uri, "uri");
                dVar.m20323M(uri);
            } else if (!TextUtils.isEmpty(this.$path)) {
                C4752d dVar2 = this.this$0;
                Uri parse = Uri.parse(this.$path);
                C8594l.m46770d(parse, "parse(path)");
                dVar2.m20323M(parse);
            }
            return C8457t.f34900a;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$restoreVideoWithoutConfig$5", mo30600f = "VideoDataSource.kt", mo30601l = {}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$w */
    /* compiled from: VideoDataSource.kt */
    static final class C4788w extends C8539k implements C8574p<C3878a, C8508d<? super C8457t>, Object> {
        final /* synthetic */ C8600r $allRestored;
        final /* synthetic */ C8602t<String> $restoreCompletedKey;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4788w(C8602t<String> tVar, C8600r rVar, C8508d<? super C4788w> dVar) {
            super(2, dVar);
            this.$restoreCompletedKey = tVar;
            this.$allRestored = rVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4788w wVar = new C4788w(this.$restoreCompletedKey, this.$allRestored, dVar);
            wVar.L$0 = obj;
            return wVar;
        }

        public final Object invoke(C3878a aVar, C8508d<? super C8457t> dVar) {
            return ((C4788w) create(aVar, dVar)).invokeSuspend(C8457t.f34900a);
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = C8527d.m46722d();
            if (this.label == 0) {
                C8450m.m46575b(obj);
                ((C3878a) this.L$0).mo13384i(C3888f.m16596a((String) this.$restoreCompletedKey.element), C8529b.m46723a(this.$allRestored.element));
                return C8457t.f34900a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: f.c.p.a.d$x */
    /* compiled from: VideoDataSource.kt */
    public static final class C4789x implements FileFilter {
        C4789x() {
        }

        public boolean accept(File file) {
            if (file != null && file.length() > 0 && !file.isHidden() && !TextUtils.equals(".nomedia", file.getName())) {
                return true;
            }
            return false;
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$scanVideo$1", mo30600f = "VideoDataSource.kt", mo30601l = {115, 179, 236, 246, 262, 267}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$y */
    /* compiled from: VideoDataSource.kt */
    static final class C4790y extends C8539k implements C8574p<C0654a0<Exception>, C8508d<? super C8457t>, Object> {
        int I$0;
        int I$1;
        int I$10;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        int I$8;
        int I$9;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4790y(C4752d dVar, C8508d<? super C4790y> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            C4790y yVar = new C4790y(this.this$0, dVar);
            yVar.L$0 = obj;
            return yVar;
        }

        public final Object invoke(C0654a0<Exception> a0Var, C8508d<? super C8457t> dVar) {
            return ((C4790y) create(a0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: java.util.LinkedHashMap} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: androidx.lifecycle.a0} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x03a9, code lost:
            if (r5 == false) goto L_0x03ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x03ab, code lost:
            r42 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x03ae, code lost:
            r42 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x03b0, code lost:
            r1 = r52;
            r1.element = new com.coocent.videostore.p067po.Video(r14, r24, r13, r4, r0, r1, r29, r31, r33, r34, r35, r36, r38, r40, r41, r42);
            r0 = p159f.p166c.p231p.p232a.C4752d.m20326c(r48).mo10390F();
            r4 = r1.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x03cf, code lost:
            r6 = r58;
            r5 = r46;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
            r5.L$0 = r6;
            r9 = r20;
            r5.L$1 = r9;
            r10 = r48;
            r5.L$2 = r10;
            r5.L$3 = r2;
            r11 = r51;
            r5.L$4 = r11;
            r5.L$5 = r1;
            r13 = r44;
            r5.I$0 = r13;
            r14 = r45;
            r5.I$1 = r14;
            r15 = r18;
            r5.I$2 = r15;
            r18 = r2;
            r2 = r50;
            r5.I$3 = r2;
            r5.I$4 = r8;
            r5.I$5 = r7;
            r20 = r7;
            r7 = r53;
            r5.I$6 = r7;
            r53 = r7;
            r7 = r43;
            r5.I$7 = r7;
            r5.I$8 = r12;
            r5.I$9 = r3;
            r21 = r3;
            r3 = r49;
            r5.I$10 = r3;
            r49 = r3;
            r5.label = 2;
            r0 = r0.mo10403d(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x041a, code lost:
            r4 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x041c, code lost:
            if (r0 != r4) goto L_0x041f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x041e, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x041f, code lost:
            r0 = r2;
            r2 = r10;
            r10 = r15;
            r15 = r5;
            r5 = r7;
            r7 = r20;
            r55 = r14;
            r14 = r1;
            r1 = r11;
            r11 = r55;
            r56 = r13;
            r13 = r4;
            r4 = r12;
            r12 = r56;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            p159f.p166c.p231p.p232a.C4752d.m20324a(r2, r14.element);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0439, code lost:
            r19 = r4;
            r20 = r9;
            r14 = r13;
            r4 = r21;
            r3 = r49;
            r9 = r0;
            r13 = r12;
            r12 = r11;
            r11 = r10;
            r10 = r2;
            r2 = r18;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x044c, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x044f, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0450, code lost:
            r4 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0453, code lost:
            r6 = r58;
            r4 = r19;
            r5 = r46;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0460, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0461, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0463, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0464, code lost:
            r6 = r58;
            r4 = r19;
            r5 = r46;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x046a, code lost:
            r13 = r4;
            r15 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x046e, code lost:
            r1 = r3;
            r53 = r6;
            r38 = r10;
            r54 = r19;
            r9 = r20;
            r3 = r44;
            r21 = r47;
            r10 = r48;
            r11 = r51;
            r6 = r58;
            r47 = r5;
            r20 = r7;
            r19 = r12;
            r7 = r18;
            r12 = r45;
            r5 = r46;
            r18 = r2;
            r2 = r50;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
            r11.remove(p369i.p379w.p381j.p382a.C8529b.m46725c(r14));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x04a4, code lost:
            if (android.text.TextUtils.equals(r1.element.mo10561t(), r13) != false) goto L_0x04ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
            r1.element.mo10533W(r13);
            r13 = new java.io.File(r13).getParentFile();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x04b6, code lost:
            if (r13 != null) goto L_0x04b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x04c9, code lost:
            if (android.text.TextUtils.equals(r13.getPath(), r1.element.mo10551j()) != false) goto L_0x04e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x04cb, code lost:
            r1.element.mo10523L(r13.getPath());
            r1.element.mo10522J(r13.getName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x04e1, code lost:
            r13 = p369i.C8457t.f34900a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x04e3, code lost:
            r13 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x04e5, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x04e6, code lost:
            r15 = r5;
            r2 = r6;
            r13 = r54;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x04ec, code lost:
            r13 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x04f9, code lost:
            if (android.text.TextUtils.equals(r1.element.mo10546f(), r4) != false) goto L_0x0504;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
            r1.element.mo10519F(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0502, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0504, code lost:
            r15 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x0511, code lost:
            if (android.text.TextUtils.equals(r1.element.mo10565w(), r0) != false) goto L_0x051b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
            r1.element.mo10538a0(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x051a, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0525, code lost:
            if (r1.element.mo10542d() == r38) goto L_0x0531;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:?, code lost:
            r1.element.mo10517C(r38);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0530, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0539, code lost:
            r4 = r7;
            r0 = r8;
            r7 = r29;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x053f, code lost:
            if (r1.element.mo10563u() == r7) goto L_0x0549;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
            r1.element.mo10535Y(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0548, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0555, code lost:
            if (r1.element.mo10559r() == Long.MIN_VALUE) goto L_0x056f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x055f, code lost:
            if (r1.element.mo10569z() == false) goto L_0x056f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x0561, code lost:
            r1.element.mo10534X(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x0569, code lost:
            r50 = r2;
            r44 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x056d, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x057b, code lost:
            if (r1.element.mo10559r() != Long.MIN_VALUE) goto L_0x05ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
            r7 = java.lang.System.currentTimeMillis();
            r50 = r2;
            r44 = r3;
            r58 = r15;
            r13 = java.lang.System.currentTimeMillis() - ((long) 604800000);
            r2 = r1.element.mo10544e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x059a, code lost:
            if (r13 > r2) goto L_0x05a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x059e, code lost:
            if (r2 > r7) goto L_0x05a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x05a0, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x05a2, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x05ab, code lost:
            if (r15 == r1.element.mo10569z()) goto L_0x05c0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x05ad, code lost:
            r2 = r1.element;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:192:0x05b1, code lost:
            if (r15 == false) goto L_0x05b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x05b3, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:194:0x05b5, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x05b6, code lost:
            r2.mo10534X(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x05ba, code lost:
            r50 = r2;
            r44 = r3;
            r58 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:197:0x05c0, code lost:
            r15 = r58;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x05ca, code lost:
            if (r1.element.mo10554m() != null) goto L_0x05da;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:?, code lost:
            r1.element.mo10526O(p369i.p379w.p381j.p382a.C8529b.m46723a(false));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:203:0x05d8, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:205:0x05db, code lost:
            if (r15 == false) goto L_0x0654;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
            r5.L$0 = r6;
            r5.L$1 = r9;
            r5.L$2 = r10;
            r8 = r18;
            r5.L$3 = r8;
            r5.L$4 = r11;
            r5.L$5 = r1;
            r13 = r44;
            r5.I$0 = r13;
            r5.I$1 = r12;
            r5.I$2 = r4;
            r14 = r50;
            r5.I$3 = r14;
            r5.I$4 = r0;
            r15 = r20;
            r5.I$5 = r15;
            r3 = r53;
            r5.I$6 = r3;
            r18 = r0;
            r0 = r43;
            r5.I$7 = r0;
            r43 = r0;
            r0 = r19;
            r5.I$8 = r0;
            r19 = r0;
            r0 = r21;
            r5.I$9 = r0;
            r21 = r0;
            r0 = r49;
            r5.I$10 = r0;
            r49 = r0;
            r5.label = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:208:0x062e, code lost:
            r7 = r54;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x0630, code lost:
            if (p159f.p166c.p231p.p232a.C4752d.m20326c(r10).mo10390F().mo10416q(r1.element, r5) != r7) goto L_0x0633;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:210:0x0632, code lost:
            return r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0633, code lost:
            r2 = r6;
            r20 = r10;
            r17 = r11;
            r11 = r12;
            r12 = r13;
            r6 = r3;
            r10 = r4;
            r13 = r7;
            r7 = r15;
            r4 = r19;
            r3 = r21;
            r15 = r5;
            r5 = r43;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x0645, code lost:
            r19 = r4;
            r4 = r3;
            r3 = r1;
            r1 = r17;
            r17 = r9;
            r9 = r14;
            r14 = r12;
            r12 = r11;
            r11 = r10;
            r10 = r20;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0654, code lost:
            r8 = r18;
            r18 = r0;
            r2 = r6;
            r17 = r9;
            r9 = r50;
            r6 = r53;
            r14 = r44;
            r3 = r1;
            r13 = r54;
            r1 = r11;
            r7 = r20;
            r11 = r4;
            r15 = r5;
            r4 = r21;
            r5 = r43;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
            p159f.p166c.p231p.p232a.C4752d.m20324a(r10, r3.element);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x067a, code lost:
            r53 = r6;
            r20 = r17;
            r3 = r49;
            r6 = r2;
            r2 = r8;
            r8 = r18;
            r55 = r14;
            r14 = r13;
            r13 = r55;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x068a, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:218:0x068d, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x068e, code lost:
            r7 = r54;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0692, code lost:
            r49 = r3;
            r3 = r6;
            r15 = r7;
            r14 = r9;
            r4 = r10;
            r7 = r19;
            r9 = r20;
            r13 = r44;
            r12 = r45;
            r5 = r46;
            r21 = r47;
            r6 = r58;
            r10 = r0;
            r19 = r11;
            r47 = r18;
            r11 = r1;
            r18 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x06b1, code lost:
            r53 = r3;
            r2 = r8;
            r20 = r9;
            r1 = r11;
            r9 = r14;
            r8 = r18;
            r3 = r49;
            r11 = r4;
            r14 = r7;
            r7 = r15;
            r4 = r21;
            r15 = r5;
            r5 = r43;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:0x06c8, code lost:
            if (r2.moveToNext() != false) goto L_0x0749;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:226:0x06d2, code lost:
            if ((!r1.isEmpty()) == false) goto L_0x0741;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:228:0x06dc, code lost:
            r3 = r2;
            r4 = r10;
            r13 = r14;
            r5 = r20;
            r2 = r1.values().iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x06e6, code lost:
            if (r2.hasNext() == false) goto L_0x073b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:232:0x06e8, code lost:
            r0 = (com.coocent.videostore.p067po.Video) r2.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x06f2, code lost:
            if (r0.mo10554m() == null) goto L_0x0739;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x06fc, code lost:
            if (r0.mo10554m().booleanValue() != false) goto L_0x0739;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x06fe, code lost:
            r1 = p159f.p166c.p231p.p232a.C4752d.m20326c(r4).mo10390F();
            r15.L$0 = r6;
            r15.L$1 = r5;
            r15.L$2 = r4;
            r15.L$3 = r3;
            r15.L$4 = r2;
            r15.L$5 = r0;
            r15.label = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:237:0x0719, code lost:
            if (r1.mo10402c(r0, r15) != r13) goto L_0x071c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x071b, code lost:
            return r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:240:0x0724, code lost:
            if (android.text.TextUtils.isEmpty(r0.mo10564v()) != false) goto L_0x06e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:241:0x0726, code lost:
            r1 = new java.io.File(r0.mo10564v());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:242:0x0733, code lost:
            if (r1.exists() == false) goto L_0x06e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:243:0x0735, code lost:
            r1.delete();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:245:0x073b, code lost:
            r0 = r4;
            r2 = r6;
            r1 = r15;
            r15 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:246:0x0741, code lost:
            r0 = r10;
            r13 = r14;
            r1 = r15;
            r5 = r20;
            r15 = r2;
            r2 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:247:0x0749, code lost:
            r58 = r6;
            r0 = r10;
            r10 = r11;
            r11 = r19;
            r18 = r47;
            r6 = r53;
            r19 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:248:0x0759, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:249:0x075a, code lost:
            r2 = r6;
            r13 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x075e, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:251:0x075f, code lost:
            r6 = r58;
            r7 = r19;
            r5 = r46;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:252:0x0766, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:253:0x0767, code lost:
            r6 = r58;
            r7 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:254:0x076b, code lost:
            r15 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x076d, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:256:0x076e, code lost:
            r6 = r58;
            r5 = r15;
            r7 = r19;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x0773, code lost:
            r2 = r6;
            r13 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:258:0x0776, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:259:0x0777, code lost:
            r22 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:265:?, code lost:
            r15.close();
            p159f.p166c.p231p.p232a.C4752d.m20329f(r0);
            p159f.p166c.p231p.p232a.C4752d.m20332i(r0);
            p159f.p166c.p231p.p232a.C4752d.m20330g(r0);
            r1.L$0 = r2;
            r1.L$1 = r5;
            r1.L$2 = null;
            r1.L$3 = null;
            r1.L$4 = null;
            r1.L$5 = null;
            r1.label = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:266:0x07ab, code lost:
            if (r2.emit(null, r1) != r13) goto L_0x07ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:267:0x07ad, code lost:
            return r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:272:0x07cd, code lost:
            return r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            r0 = ((java.lang.Iterable) r0).iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x022c, code lost:
            if (r0.hasNext() == false) goto L_0x0251;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x022e, code lost:
            r21 = r0.next();
            r58 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0240, code lost:
            r22 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            r1.put(p369i.p379w.p381j.p382a.C8529b.m46725c(((com.coocent.videostore.p067po.Video) r21).mo10553l()), (com.coocent.videostore.p067po.Video) r21);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0249, code lost:
            r0 = r58;
            r2 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x024e, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0251, code lost:
            r22 = r2;
            r58 = r14;
            r0 = r19;
            r2 = r20;
            r19 = r22;
            r20 = r15;
            r15 = r57;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            r14 = r2.getString(r5);
            r43 = r5;
            p369i.p387z.p389d.C8594l.m46770d(r14, "mimeType");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x026e, code lost:
            if (p159f.p166c.p231p.p232a.C4752d.m20327d(r0, r14) == false) goto L_0x028b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0270, code lost:
            r49 = r3;
            r21 = r4;
            r3 = r6;
            r14 = r9;
            r4 = r10;
            r5 = r15;
            r47 = r18;
            r9 = r20;
            r6 = r58;
            r10 = r0;
            r15 = r7;
            r18 = r8;
            r7 = r19;
            r8 = r2;
            r19 = r11;
            r11 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x028b, code lost:
            r35 = r14;
            r5 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            r14 = r2.getLong(r13);
            r44 = r13;
            r13 = r2.getString(r12);
            r45 = r12;
            r12 = android.content.ContentUris.withAppendedId(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x02a0, code lost:
            r46 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            p369i.p387z.p389d.C8594l.m46770d(r12, "withAppendedId(\n        …                        )");
            r47 = r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x02b3, code lost:
            if (p159f.p166c.p231p.p233b.C4798b.f13591a.mo15536a(p159f.p166c.p231p.p232a.C4752d.m20325b(r0), r12) == false) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b9, code lost:
            if (android.text.TextUtils.isEmpty(r13) == false) goto L_0x02bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x02bd, code lost:
            r4 = r2.getString(r10);
            p369i.p387z.p389d.C8594l.m46770d(r4, "displayName");
            r48 = r0;
            r21 = r12;
            r5 = r18;
            r18 = r10;
            r0 = p369i.p376f0.C8437p.m46562k0(r4, r5, (java.lang.String) null, 2, (java.lang.Object) null);
            r12 = r11;
            r10 = r2.getLong(r3);
            r22 = r2.getLong(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x02e1, code lost:
            if (r22 > 0) goto L_0x02f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x02e3, code lost:
            r49 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
            r22 = new java.io.File(r13).length();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x02ef, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x02f0, code lost:
            r2 = r58;
            r13 = r19;
            r15 = r46;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x02f8, code lost:
            r49 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02fa, code lost:
            r29 = r22;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            r3 = new p369i.p387z.p389d.C8602t();
            r50 = r9;
            r9 = r1.get(p369i.p379w.p381j.p382a.C8529b.m46725c(r14));
            r3.element = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x030d, code lost:
            r51 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x030f, code lost:
            if (r9 != null) goto L_0x046e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            r9 = new java.io.File(r13).getParentFile();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x031a, code lost:
            if (r9 != null) goto L_0x033e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x031c, code lost:
            r3 = r6;
            r15 = r7;
            r4 = r18;
            r7 = r19;
            r9 = r20;
            r13 = r44;
            r21 = r47;
            r10 = r48;
            r14 = r50;
            r11 = r51;
            r6 = r58;
            r47 = r5;
            r18 = r8;
            r19 = r12;
            r12 = r45;
            r5 = r46;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x033b, code lost:
            r8 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x033e, code lost:
            r52 = r3;
            r38 = r10;
            r10 = p369i.p376f0.C8437p.m46556e0(r4, r5, (java.lang.String) null, 2, (java.lang.Object) null);
            r1 = java.util.Locale.US;
            p369i.p387z.p389d.C8594l.m46770d(r1, "US");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x034f, code lost:
            if (r10 == null) goto L_0x0453;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0351, code lost:
            r1 = r10.toLowerCase(r1);
            p369i.p387z.p389d.C8594l.m46770d(r1, "(this as java.lang.String).toLowerCase(locale)");
            r31 = r2.getLong(r8);
            r33 = r2.getInt(r7);
            r34 = r2.getInt(r6);
            r10 = r2.getLong(r12);
            r3 = r47;
            r26 = r2.getLong(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0372, code lost:
            if (r10 <= 0) goto L_0x0377;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:91:0x0374, code lost:
            r36 = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0377, code lost:
            r36 = r26 * ((long) 1000);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x037e, code lost:
            r10 = java.lang.System.currentTimeMillis();
            r47 = r5;
            r53 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0392, code lost:
            if ((java.lang.System.currentTimeMillis() - ((long) 604800000)) > r36) goto L_0x039a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0396, code lost:
            if (r36 > r10) goto L_0x039a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0398, code lost:
            r5 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x039a, code lost:
            r5 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x039b, code lost:
            r24 = r21.toString();
            r40 = r9.getName();
            r41 = r9.getPath();
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:272:0x07cd A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r58) {
            /*
                r57 = this;
                r1 = r57
                java.lang.String r0 = "."
                java.lang.String r2 = "date_modified"
                java.lang.String r3 = "date_added"
                java.lang.String r4 = "mime_type"
                java.lang.String r5 = "height"
                java.lang.String r6 = "width"
                java.lang.String r7 = "_size"
                java.lang.String r8 = "_display_name"
                java.lang.String r9 = "_data"
                java.lang.String r10 = "_id"
                java.lang.String r11 = "datetaken"
                java.lang.String r12 = "duration"
                java.lang.Object r13 = p369i.p379w.p380i.C8527d.m46722d()
                int r14 = r1.label
                switch(r14) {
                    case 0: goto L_0x014a;
                    case 1: goto L_0x00fe;
                    case 2: goto L_0x00ad;
                    case 3: goto L_0x0062;
                    case 4: goto L_0x003e;
                    case 5: goto L_0x0030;
                    case 6: goto L_0x002b;
                    default: goto L_0x0023;
                }
            L_0x0023:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x002b:
                p369i.C8450m.m46575b(r58)
                goto L_0x07ce
            L_0x0030:
                java.lang.Object r0 = r1.L$1
                android.database.Cursor r0 = (android.database.Cursor) r0
                java.lang.Object r0 = r1.L$0
                r2 = r0
                androidx.lifecycle.a0 r2 = (androidx.lifecycle.C0654a0) r2
                p369i.C8450m.m46575b(r58)     // Catch:{ Exception -> 0x0146 }
                goto L_0x07ce
            L_0x003e:
                java.lang.Object r0 = r1.L$5
                com.coocent.videostore.po.Video r0 = (com.coocent.videostore.p067po.Video) r0
                java.lang.Object r2 = r1.L$4
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r1.L$3
                android.database.Cursor r3 = (android.database.Cursor) r3
                java.lang.Object r4 = r1.L$2
                f.c.p.a.d r4 = (p159f.p166c.p231p.p232a.C4752d) r4
                java.lang.Object r5 = r1.L$1
                android.database.Cursor r5 = (android.database.Cursor) r5
                java.lang.Object r6 = r1.L$0
                androidx.lifecycle.a0 r6 = (androidx.lifecycle.C0654a0) r6
                p369i.C8450m.m46575b(r58)     // Catch:{ Exception -> 0x005d }
                r15 = r1
                r7 = 4
                goto L_0x071c
            L_0x005d:
                r0 = move-exception
                r15 = r1
            L_0x005f:
                r2 = r6
                goto L_0x07b4
            L_0x0062:
                int r2 = r1.I$10
                int r3 = r1.I$9
                int r4 = r1.I$8
                int r5 = r1.I$7
                int r6 = r1.I$6
                int r7 = r1.I$5
                int r8 = r1.I$4
                int r9 = r1.I$3
                int r10 = r1.I$2
                int r11 = r1.I$1
                int r12 = r1.I$0
                java.lang.Object r14 = r1.L$5
                i.z.d.t r14 = (p369i.p387z.p389d.C8602t) r14
                java.lang.Object r15 = r1.L$4
                java.util.Map r15 = (java.util.Map) r15
                r18 = r2
                java.lang.Object r2 = r1.L$3
                android.database.Cursor r2 = (android.database.Cursor) r2
                r19 = r2
                java.lang.Object r2 = r1.L$2
                f.c.p.a.d r2 = (p159f.p166c.p231p.p232a.C4752d) r2
                r20 = r2
                java.lang.Object r2 = r1.L$1
                android.database.Cursor r2 = (android.database.Cursor) r2
                r21 = r2
                java.lang.Object r2 = r1.L$0
                androidx.lifecycle.a0 r2 = (androidx.lifecycle.C0654a0) r2
                p369i.C8450m.m46575b(r58)     // Catch:{ Exception -> 0x0146 }
                r47 = r0
                r17 = r15
                r49 = r18
                r0 = 3
                r15 = r1
                r18 = r8
                r1 = r14
                r8 = r19
                r14 = r9
                r9 = r21
                goto L_0x0645
            L_0x00ad:
                int r2 = r1.I$10
                int r3 = r1.I$9
                int r4 = r1.I$8
                int r5 = r1.I$7
                int r6 = r1.I$6
                int r7 = r1.I$5
                int r8 = r1.I$4
                int r9 = r1.I$3
                int r10 = r1.I$2
                int r11 = r1.I$1
                int r12 = r1.I$0
                java.lang.Object r14 = r1.L$5
                i.z.d.t r14 = (p369i.p387z.p389d.C8602t) r14
                java.lang.Object r15 = r1.L$4
                java.util.Map r15 = (java.util.Map) r15
                r18 = r2
                java.lang.Object r2 = r1.L$3
                android.database.Cursor r2 = (android.database.Cursor) r2
                r19 = r2
                java.lang.Object r2 = r1.L$2
                f.c.p.a.d r2 = (p159f.p166c.p231p.p232a.C4752d) r2
                r20 = r2
                java.lang.Object r2 = r1.L$1
                android.database.Cursor r2 = (android.database.Cursor) r2
                r21 = r2
                java.lang.Object r2 = r1.L$0
                androidx.lifecycle.a0 r2 = (androidx.lifecycle.C0654a0) r2
                p369i.C8450m.m46575b(r58)     // Catch:{ Exception -> 0x0146 }
                r47 = r0
                r53 = r6
                r0 = r9
                r49 = r18
                r18 = r19
                r9 = r21
                r6 = r2
                r21 = r3
                r2 = r20
                r3 = 2
                r55 = r15
                r15 = r1
                r1 = r55
                goto L_0x0432
            L_0x00fe:
                int r2 = r1.I$10
                int r3 = r1.I$9
                int r4 = r1.I$8
                int r5 = r1.I$7
                int r6 = r1.I$6
                int r7 = r1.I$5
                int r8 = r1.I$4
                int r9 = r1.I$3
                int r10 = r1.I$2
                int r11 = r1.I$1
                int r12 = r1.I$0
                java.lang.Object r14 = r1.L$4
                java.util.Map r14 = (java.util.Map) r14
                java.lang.Object r15 = r1.L$3
                android.database.Cursor r15 = (android.database.Cursor) r15
                r18 = r2
                java.lang.Object r2 = r1.L$2
                f.c.p.a.d r2 = (p159f.p166c.p231p.p232a.C4752d) r2
                r19 = r2
                java.lang.Object r2 = r1.L$1
                android.database.Cursor r2 = (android.database.Cursor) r2
                r20 = r2
                java.lang.Object r2 = r1.L$0
                androidx.lifecycle.a0 r2 = (androidx.lifecycle.C0654a0) r2
                p369i.C8450m.m46575b(r58)     // Catch:{ Exception -> 0x0146 }
                r1 = r14
                r14 = r2
                r2 = r13
                r13 = r12
                r12 = r11
                r11 = r4
                r4 = r3
                r3 = r18
                r18 = r0
                r0 = r58
                r55 = r20
                r20 = r15
                r15 = r55
                goto L_0x0222
            L_0x0146:
                r0 = move-exception
                r15 = r1
                goto L_0x07b4
            L_0x014a:
                p369i.C8450m.m46575b(r58)
                java.lang.Object r14 = r1.L$0
                androidx.lifecycle.a0 r14 = (androidx.lifecycle.C0654a0) r14
                int r15 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x07ae }
                r18 = r0
                r0 = 29
                f.c.p.a.d r0 = r1.this$0     // Catch:{ Exception -> 0x07ae }
                android.app.Application r0 = r0.f13569a     // Catch:{ Exception -> 0x07ae }
                android.content.ContentResolver r19 = r0.getContentResolver()     // Catch:{ Exception -> 0x07ae }
                android.net.Uri r20 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x07ae }
                r0 = 11
                java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x07ae }
                r15 = 0
                r0[r15] = r10     // Catch:{ Exception -> 0x07ae }
                r15 = 1
                r0[r15] = r9     // Catch:{ Exception -> 0x07ae }
                r15 = 2
                r0[r15] = r8     // Catch:{ Exception -> 0x07ae }
                r15 = 3
                r0[r15] = r7     // Catch:{ Exception -> 0x07ae }
                r15 = 4
                r0[r15] = r12     // Catch:{ Exception -> 0x07ae }
                r15 = 5
                r0[r15] = r6     // Catch:{ Exception -> 0x07ae }
                r15 = 6
                r0[r15] = r5     // Catch:{ Exception -> 0x07ae }
                r15 = 7
                r0[r15] = r4     // Catch:{ Exception -> 0x07ae }
                r15 = 8
                r0[r15] = r11     // Catch:{ Exception -> 0x07ae }
                r15 = 9
                r0[r15] = r3     // Catch:{ Exception -> 0x07ae }
                r15 = 10
                r0[r15] = r2     // Catch:{ Exception -> 0x07ae }
                r22 = 0
                r23 = 0
                java.lang.String r24 = "title"
                r21 = r0
                android.database.Cursor r15 = r19.query(r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x07ae }
                if (r15 != 0) goto L_0x019b
                goto L_0x07ce
            L_0x019b:
                f.c.p.a.d r0 = r1.this$0     // Catch:{ Exception -> 0x07ae }
                int r10 = r15.getColumnIndex(r10)     // Catch:{ Exception -> 0x07ae }
                int r9 = r15.getColumnIndex(r9)     // Catch:{ Exception -> 0x07ae }
                int r8 = r15.getColumnIndex(r8)     // Catch:{ Exception -> 0x07ae }
                int r7 = r15.getColumnIndex(r7)     // Catch:{ Exception -> 0x07ae }
                int r12 = r15.getColumnIndex(r12)     // Catch:{ Exception -> 0x07ae }
                int r6 = r15.getColumnIndex(r6)     // Catch:{ Exception -> 0x07ae }
                int r5 = r15.getColumnIndex(r5)     // Catch:{ Exception -> 0x07ae }
                int r4 = r15.getColumnIndex(r4)     // Catch:{ Exception -> 0x07ae }
                int r11 = r15.getColumnIndex(r11)     // Catch:{ Exception -> 0x07ae }
                int r3 = r15.getColumnIndex(r3)     // Catch:{ Exception -> 0x07ae }
                int r2 = r15.getColumnIndex(r2)     // Catch:{ Exception -> 0x07ae }
                boolean r19 = r15.moveToFirst()     // Catch:{ Exception -> 0x07ae }
                if (r19 == 0) goto L_0x0783
                r19 = r13
                java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x077f }
                r13.<init>()     // Catch:{ Exception -> 0x077f }
                com.coocent.videostore.db.VideoStoreDatabase r20 = r0.f13570b     // Catch:{ Exception -> 0x077f }
                r58 = r2
                com.coocent.videostore.db.c r2 = r20.mo10390F()     // Catch:{ Exception -> 0x077f }
                r1.L$0 = r14     // Catch:{ Exception -> 0x077f }
                r1.L$1 = r15     // Catch:{ Exception -> 0x077f }
                r1.L$2 = r0     // Catch:{ Exception -> 0x077f }
                r1.L$3 = r15     // Catch:{ Exception -> 0x077f }
                r1.L$4 = r13     // Catch:{ Exception -> 0x077f }
                r1.I$0 = r10     // Catch:{ Exception -> 0x077f }
                r1.I$1 = r9     // Catch:{ Exception -> 0x077f }
                r1.I$2 = r8     // Catch:{ Exception -> 0x077f }
                r1.I$3 = r7     // Catch:{ Exception -> 0x077f }
                r1.I$4 = r12     // Catch:{ Exception -> 0x077f }
                r1.I$5 = r6     // Catch:{ Exception -> 0x077f }
                r1.I$6 = r5     // Catch:{ Exception -> 0x077f }
                r1.I$7 = r4     // Catch:{ Exception -> 0x077f }
                r1.I$8 = r11     // Catch:{ Exception -> 0x077f }
                r1.I$9 = r3     // Catch:{ Exception -> 0x077f }
                r20 = r0
                r0 = r58
                r1.I$10 = r0     // Catch:{ Exception -> 0x077f }
                r58 = r0
                r0 = 1
                r1.label = r0     // Catch:{ Exception -> 0x077f }
                java.lang.Object r0 = r2.mo10400a(r1)     // Catch:{ Exception -> 0x077f }
                r2 = r19
                if (r0 != r2) goto L_0x0212
                return r2
            L_0x0212:
                r1 = r13
                r19 = r20
                r13 = r10
                r20 = r15
                r10 = r8
                r8 = r12
                r12 = r9
                r9 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r58
            L_0x0222:
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x0776 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0776 }
            L_0x0228:
                boolean r21 = r0.hasNext()     // Catch:{ Exception -> 0x0776 }
                if (r21 == 0) goto L_0x0251
                java.lang.Object r21 = r0.next()     // Catch:{ Exception -> 0x0776 }
                r22 = r21
                com.coocent.videostore.po.Video r22 = (com.coocent.videostore.p067po.Video) r22     // Catch:{ Exception -> 0x0776 }
                long r22 = r22.mo10553l()     // Catch:{ Exception -> 0x0776 }
                r58 = r0
                java.lang.Long r0 = p369i.p379w.p381j.p382a.C8529b.m46725c(r22)     // Catch:{ Exception -> 0x0776 }
                r22 = r2
                r2 = r21
                com.coocent.videostore.po.Video r2 = (com.coocent.videostore.p067po.Video) r2     // Catch:{ Exception -> 0x024e }
                r1.put(r0, r2)     // Catch:{ Exception -> 0x024e }
                r0 = r58
                r2 = r22
                goto L_0x0228
            L_0x024e:
                r0 = move-exception
                goto L_0x0779
            L_0x0251:
                r22 = r2
                r58 = r14
                r0 = r19
                r2 = r20
                r19 = r22
                r20 = r15
                r15 = r57
            L_0x025f:
                java.lang.String r14 = r2.getString(r5)     // Catch:{ Exception -> 0x076d }
                r43 = r5
                java.lang.String r5 = "mimeType"
                p369i.p387z.p389d.C8594l.m46770d(r14, r5)     // Catch:{ Exception -> 0x076d }
                boolean r5 = r0.m20336w(r14)     // Catch:{ Exception -> 0x076d }
                if (r5 == 0) goto L_0x028b
                r49 = r3
                r21 = r4
                r3 = r6
                r14 = r9
                r4 = r10
                r5 = r15
                r47 = r18
                r9 = r20
                r6 = r58
                r10 = r0
                r15 = r7
                r18 = r8
                r7 = r19
                r0 = 3
                r8 = r2
                r19 = r11
                r11 = r1
                goto L_0x06b1
            L_0x028b:
                r35 = r14
                r5 = r15
                long r14 = r2.getLong(r13)     // Catch:{ Exception -> 0x0766 }
                r44 = r13
                java.lang.String r13 = r2.getString(r12)     // Catch:{ Exception -> 0x0766 }
                r45 = r12
                android.net.Uri r12 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x0766 }
                android.net.Uri r12 = android.content.ContentUris.withAppendedId(r12, r14)     // Catch:{ Exception -> 0x0766 }
                r46 = r5
                java.lang.String r5 = "withAppendedId(\n        …                        )"
                p369i.p387z.p389d.C8594l.m46770d(r12, r5)     // Catch:{ Exception -> 0x075e }
                f.c.p.b.b r5 = p159f.p166c.p231p.p233b.C4798b.f13591a     // Catch:{ Exception -> 0x075e }
                r47 = r4
                android.app.Application r4 = r0.f13569a     // Catch:{ Exception -> 0x075e }
                boolean r4 = r5.mo15536a(r4, r12)     // Catch:{ Exception -> 0x075e }
                if (r4 == 0) goto L_0x0692
                boolean r4 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x075e }
                if (r4 == 0) goto L_0x02bd
                goto L_0x0692
            L_0x02bd:
                java.lang.String r4 = r2.getString(r10)     // Catch:{ Exception -> 0x075e }
                java.lang.String r5 = "displayName"
                p369i.p387z.p389d.C8594l.m46770d(r4, r5)     // Catch:{ Exception -> 0x075e }
                r48 = r0
                r21 = r12
                r5 = r18
                r12 = 0
                r18 = r10
                r10 = 2
                java.lang.String r0 = p369i.p376f0.C8437p.m46562k0(r4, r5, r12, r10, r12)     // Catch:{ Exception -> 0x075e }
                r12 = r11
                long r10 = r2.getLong(r3)     // Catch:{ Exception -> 0x075e }
                long r22 = r2.getLong(r9)     // Catch:{ Exception -> 0x075e }
                r24 = 0
                int r26 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
                if (r26 > 0) goto L_0x02f8
                r49 = r3
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x02ef }
                r3.<init>(r13)     // Catch:{ Exception -> 0x02ef }
                long r22 = r3.length()     // Catch:{ Exception -> 0x02ef }
                goto L_0x02fa
            L_0x02ef:
                r0 = move-exception
                r2 = r58
                r13 = r19
                r15 = r46
                goto L_0x07b4
            L_0x02f8:
                r49 = r3
            L_0x02fa:
                r29 = r22
                i.z.d.t r3 = new i.z.d.t     // Catch:{ Exception -> 0x075e }
                r3.<init>()     // Catch:{ Exception -> 0x075e }
                r50 = r9
                java.lang.Long r9 = p369i.p379w.p381j.p382a.C8529b.m46725c(r14)     // Catch:{ Exception -> 0x075e }
                java.lang.Object r9 = r1.get(r9)     // Catch:{ Exception -> 0x075e }
                r3.element = r9     // Catch:{ Exception -> 0x075e }
                r51 = r1
                if (r9 != 0) goto L_0x046e
                java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x0463 }
                r9.<init>(r13)     // Catch:{ Exception -> 0x0463 }
                java.io.File r9 = r9.getParentFile()     // Catch:{ Exception -> 0x0463 }
                if (r9 != 0) goto L_0x033e
                r3 = r6
                r15 = r7
                r4 = r18
                r7 = r19
                r9 = r20
                r13 = r44
                r21 = r47
                r10 = r48
                r14 = r50
                r11 = r51
                r0 = 3
                r6 = r58
                r47 = r5
                r18 = r8
                r19 = r12
                r12 = r45
                r5 = r46
            L_0x033b:
                r8 = r2
                goto L_0x06b1
            L_0x033e:
                r52 = r3
                r38 = r10
                r1 = 2
                r3 = 0
                java.lang.String r10 = p369i.p376f0.C8437p.m46556e0(r4, r5, r3, r1, r3)     // Catch:{ Exception -> 0x0463 }
                java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x0463 }
                java.lang.String r3 = "US"
                p369i.p387z.p389d.C8594l.m46770d(r1, r3)     // Catch:{ Exception -> 0x0463 }
                if (r10 == 0) goto L_0x0453
                java.lang.String r1 = r10.toLowerCase(r1)     // Catch:{ Exception -> 0x0463 }
                java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
                p369i.p387z.p389d.C8594l.m46770d(r1, r3)     // Catch:{ Exception -> 0x0463 }
                long r31 = r2.getLong(r8)     // Catch:{ Exception -> 0x0463 }
                int r33 = r2.getInt(r7)     // Catch:{ Exception -> 0x0463 }
                int r34 = r2.getInt(r6)     // Catch:{ Exception -> 0x0463 }
                long r10 = r2.getLong(r12)     // Catch:{ Exception -> 0x0463 }
                r3 = r47
                long r26 = r2.getLong(r3)     // Catch:{ Exception -> 0x0463 }
                int r23 = (r10 > r24 ? 1 : (r10 == r24 ? 0 : -1))
                if (r23 <= 0) goto L_0x0377
                r36 = r10
                goto L_0x037e
            L_0x0377:
                r10 = 1000(0x3e8, float:1.401E-42)
                long r10 = (long) r10     // Catch:{ Exception -> 0x0463 }
                long r26 = r26 * r10
                r36 = r26
            L_0x037e:
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0463 }
                long r23 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0463 }
                r47 = r5
                r53 = r6
                r5 = 604800000(0x240c8400, float:3.046947E-17)
                long r5 = (long) r5     // Catch:{ Exception -> 0x0463 }
                long r23 = r23 - r5
                int r5 = (r23 > r36 ? 1 : (r23 == r36 ? 0 : -1))
                if (r5 > 0) goto L_0x039a
                int r5 = (r36 > r10 ? 1 : (r36 == r10 ? 0 : -1))
                if (r5 > 0) goto L_0x039a
                r5 = 1
                goto L_0x039b
            L_0x039a:
                r5 = 0
            L_0x039b:
                com.coocent.videostore.po.Video r6 = new com.coocent.videostore.po.Video     // Catch:{ Exception -> 0x0463 }
                java.lang.String r24 = r21.toString()     // Catch:{ Exception -> 0x0463 }
                java.lang.String r40 = r9.getName()     // Catch:{ Exception -> 0x0463 }
                java.lang.String r41 = r9.getPath()     // Catch:{ Exception -> 0x0463 }
                if (r5 == 0) goto L_0x03ae
                r42 = 1
                goto L_0x03b0
            L_0x03ae:
                r42 = 0
            L_0x03b0:
                r21 = r6
                r22 = r14
                r25 = r13
                r26 = r4
                r27 = r0
                r28 = r1
                r21.<init>(r22, r24, r25, r26, r27, r28, r29, r31, r33, r34, r35, r36, r38, r40, r41, r42)     // Catch:{ Exception -> 0x0463 }
                r1 = r52
                r1.element = r6     // Catch:{ Exception -> 0x0463 }
                com.coocent.videostore.db.VideoStoreDatabase r0 = r48.f13570b     // Catch:{ Exception -> 0x0463 }
                com.coocent.videostore.db.c r0 = r0.mo10390F()     // Catch:{ Exception -> 0x0463 }
                T r4 = r1.element     // Catch:{ Exception -> 0x0463 }
                com.coocent.videostore.po.Video r4 = (com.coocent.videostore.p067po.Video) r4     // Catch:{ Exception -> 0x0463 }
                r6 = r58
                r5 = r46
                r5.L$0 = r6     // Catch:{ Exception -> 0x044f }
                r9 = r20
                r5.L$1 = r9     // Catch:{ Exception -> 0x044f }
                r10 = r48
                r5.L$2 = r10     // Catch:{ Exception -> 0x044f }
                r5.L$3 = r2     // Catch:{ Exception -> 0x044f }
                r11 = r51
                r5.L$4 = r11     // Catch:{ Exception -> 0x044f }
                r5.L$5 = r1     // Catch:{ Exception -> 0x044f }
                r13 = r44
                r5.I$0 = r13     // Catch:{ Exception -> 0x044f }
                r14 = r45
                r5.I$1 = r14     // Catch:{ Exception -> 0x044f }
                r15 = r18
                r5.I$2 = r15     // Catch:{ Exception -> 0x044f }
                r18 = r2
                r2 = r50
                r5.I$3 = r2     // Catch:{ Exception -> 0x044f }
                r5.I$4 = r8     // Catch:{ Exception -> 0x044f }
                r5.I$5 = r7     // Catch:{ Exception -> 0x044f }
                r20 = r7
                r7 = r53
                r5.I$6 = r7     // Catch:{ Exception -> 0x044f }
                r53 = r7
                r7 = r43
                r5.I$7 = r7     // Catch:{ Exception -> 0x044f }
                r5.I$8 = r12     // Catch:{ Exception -> 0x044f }
                r5.I$9 = r3     // Catch:{ Exception -> 0x044f }
                r21 = r3
                r3 = r49
                r5.I$10 = r3     // Catch:{ Exception -> 0x044f }
                r49 = r3
                r3 = 2
                r5.label = r3     // Catch:{ Exception -> 0x044f }
                java.lang.Object r0 = r0.mo10403d(r4, r5)     // Catch:{ Exception -> 0x044f }
                r4 = r19
                if (r0 != r4) goto L_0x041f
                return r4
            L_0x041f:
                r0 = r2
                r2 = r10
                r10 = r15
                r15 = r5
                r5 = r7
                r7 = r20
                r55 = r14
                r14 = r1
                r1 = r11
                r11 = r55
                r56 = r13
                r13 = r4
                r4 = r12
                r12 = r56
            L_0x0432:
                T r14 = r14.element     // Catch:{ Exception -> 0x044c }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x044c }
                r2.m20335o(r14)     // Catch:{ Exception -> 0x044c }
                r19 = r4
                r20 = r9
                r14 = r13
                r4 = r21
                r3 = r49
                r9 = r0
                r13 = r12
                r0 = 3
                r12 = r11
                r11 = r10
                r10 = r2
                r2 = r18
                goto L_0x06c4
            L_0x044c:
                r0 = move-exception
                goto L_0x005f
            L_0x044f:
                r0 = move-exception
                r4 = r19
                goto L_0x046a
            L_0x0453:
                r6 = r58
                r4 = r19
                r5 = r46
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0461 }
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)     // Catch:{ Exception -> 0x0461 }
                throw r0     // Catch:{ Exception -> 0x0461 }
            L_0x0461:
                r0 = move-exception
                goto L_0x046a
            L_0x0463:
                r0 = move-exception
                r6 = r58
                r4 = r19
                r5 = r46
            L_0x046a:
                r13 = r4
                r15 = r5
                goto L_0x005f
            L_0x046e:
                r1 = r3
                r53 = r6
                r38 = r10
                r54 = r19
                r9 = r20
                r3 = r44
                r21 = r47
                r10 = r48
                r11 = r51
                r6 = r58
                r47 = r5
                r20 = r7
                r19 = r12
                r7 = r18
                r12 = r45
                r5 = r46
                r18 = r2
                r2 = r50
                java.lang.Long r14 = p369i.p379w.p381j.p382a.C8529b.m46725c(r14)     // Catch:{ Exception -> 0x068d }
                r11.remove(r14)     // Catch:{ Exception -> 0x068d }
                T r14 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x068d }
                java.lang.String r14 = r14.mo10561t()     // Catch:{ Exception -> 0x068d }
                boolean r14 = android.text.TextUtils.equals(r14, r13)     // Catch:{ Exception -> 0x068d }
                if (r14 != 0) goto L_0x04ec
                T r14 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x04e5 }
                r14.mo10533W(r13)     // Catch:{ Exception -> 0x04e5 }
                java.io.File r14 = new java.io.File     // Catch:{ Exception -> 0x04e5 }
                r14.<init>(r13)     // Catch:{ Exception -> 0x04e5 }
                java.io.File r13 = r14.getParentFile()     // Catch:{ Exception -> 0x04e5 }
                if (r13 != 0) goto L_0x04b9
                goto L_0x04e3
            L_0x04b9:
                java.lang.String r14 = r13.getPath()     // Catch:{ Exception -> 0x04e5 }
                T r15 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r15 = (com.coocent.videostore.p067po.Video) r15     // Catch:{ Exception -> 0x04e5 }
                java.lang.String r15 = r15.mo10551j()     // Catch:{ Exception -> 0x04e5 }
                boolean r14 = android.text.TextUtils.equals(r14, r15)     // Catch:{ Exception -> 0x04e5 }
                if (r14 != 0) goto L_0x04e1
                T r14 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x04e5 }
                java.lang.String r15 = r13.getPath()     // Catch:{ Exception -> 0x04e5 }
                r14.mo10523L(r15)     // Catch:{ Exception -> 0x04e5 }
                T r14 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x04e5 }
                java.lang.String r13 = r13.getName()     // Catch:{ Exception -> 0x04e5 }
                r14.mo10522J(r13)     // Catch:{ Exception -> 0x04e5 }
            L_0x04e1:
                i.t r13 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x04e5 }
            L_0x04e3:
                r13 = 1
                goto L_0x04ed
            L_0x04e5:
                r0 = move-exception
                r15 = r5
                r2 = r6
                r13 = r54
                goto L_0x07b4
            L_0x04ec:
                r13 = 0
            L_0x04ed:
                T r14 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x068d }
                java.lang.String r14 = r14.mo10546f()     // Catch:{ Exception -> 0x068d }
                boolean r14 = android.text.TextUtils.equals(r14, r4)     // Catch:{ Exception -> 0x068d }
                if (r14 != 0) goto L_0x0504
                T r13 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r13 = (com.coocent.videostore.p067po.Video) r13     // Catch:{ Exception -> 0x04e5 }
                r13.mo10519F(r4)     // Catch:{ Exception -> 0x04e5 }
                r15 = 1
                goto L_0x0505
            L_0x0504:
                r15 = r13
            L_0x0505:
                T r4 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r4 = (com.coocent.videostore.p067po.Video) r4     // Catch:{ Exception -> 0x068d }
                java.lang.String r4 = r4.mo10565w()     // Catch:{ Exception -> 0x068d }
                boolean r4 = android.text.TextUtils.equals(r4, r0)     // Catch:{ Exception -> 0x068d }
                if (r4 != 0) goto L_0x051b
                T r4 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r4 = (com.coocent.videostore.p067po.Video) r4     // Catch:{ Exception -> 0x04e5 }
                r4.mo10538a0(r0)     // Catch:{ Exception -> 0x04e5 }
                r15 = 1
            L_0x051b:
                T r0 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r0 = (com.coocent.videostore.p067po.Video) r0     // Catch:{ Exception -> 0x068d }
                long r13 = r0.mo10542d()     // Catch:{ Exception -> 0x068d }
                int r0 = (r13 > r38 ? 1 : (r13 == r38 ? 0 : -1))
                if (r0 == 0) goto L_0x0531
                T r0 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r0 = (com.coocent.videostore.p067po.Video) r0     // Catch:{ Exception -> 0x04e5 }
                r13 = r38
                r0.mo10517C(r13)     // Catch:{ Exception -> 0x04e5 }
                r15 = 1
            L_0x0531:
                T r0 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r0 = (com.coocent.videostore.p067po.Video) r0     // Catch:{ Exception -> 0x068d }
                long r13 = r0.mo10563u()     // Catch:{ Exception -> 0x068d }
                r4 = r7
                r0 = r8
                r7 = r29
                int r23 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
                if (r23 == 0) goto L_0x0549
                T r13 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r13 = (com.coocent.videostore.p067po.Video) r13     // Catch:{ Exception -> 0x04e5 }
                r13.mo10535Y(r7)     // Catch:{ Exception -> 0x04e5 }
                r15 = 1
            L_0x0549:
                T r7 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x068d }
                long r7 = r7.mo10559r()     // Catch:{ Exception -> 0x068d }
                r13 = -9223372036854775808
                int r23 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r23 == 0) goto L_0x056f
                T r7 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x04e5 }
                boolean r7 = r7.mo10569z()     // Catch:{ Exception -> 0x04e5 }
                if (r7 == 0) goto L_0x056f
                T r7 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x04e5 }
                r8 = 0
                r7.mo10534X(r8)     // Catch:{ Exception -> 0x04e5 }
                r50 = r2
                r44 = r3
            L_0x056d:
                r15 = 1
                goto L_0x05c2
            L_0x056f:
                T r7 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x068d }
                long r7 = r7.mo10559r()     // Catch:{ Exception -> 0x068d }
                r13 = -9223372036854775808
                int r23 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r23 != 0) goto L_0x05ba
                long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04e5 }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x04e5 }
                r50 = r2
                r44 = r3
                r58 = r15
                r15 = 604800000(0x240c8400, float:3.046947E-17)
                long r2 = (long) r15     // Catch:{ Exception -> 0x04e5 }
                long r13 = r13 - r2
                T r2 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r2 = (com.coocent.videostore.p067po.Video) r2     // Catch:{ Exception -> 0x04e5 }
                long r2 = r2.mo10544e()     // Catch:{ Exception -> 0x04e5 }
                int r15 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
                if (r15 > 0) goto L_0x05a2
                int r13 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r13 > 0) goto L_0x05a2
                r15 = 1
                goto L_0x05a3
            L_0x05a2:
                r15 = 0
            L_0x05a3:
                T r2 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r2 = (com.coocent.videostore.p067po.Video) r2     // Catch:{ Exception -> 0x04e5 }
                boolean r2 = r2.mo10569z()     // Catch:{ Exception -> 0x04e5 }
                if (r15 == r2) goto L_0x05c0
                T r2 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r2 = (com.coocent.videostore.p067po.Video) r2     // Catch:{ Exception -> 0x04e5 }
                if (r15 == 0) goto L_0x05b5
                r15 = 1
                goto L_0x05b6
            L_0x05b5:
                r15 = 0
            L_0x05b6:
                r2.mo10534X(r15)     // Catch:{ Exception -> 0x04e5 }
                goto L_0x056d
            L_0x05ba:
                r50 = r2
                r44 = r3
                r58 = r15
            L_0x05c0:
                r15 = r58
            L_0x05c2:
                T r2 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r2 = (com.coocent.videostore.p067po.Video) r2     // Catch:{ Exception -> 0x068d }
                java.lang.Boolean r2 = r2.mo10554m()     // Catch:{ Exception -> 0x068d }
                if (r2 != 0) goto L_0x05da
                T r2 = r1.element     // Catch:{ Exception -> 0x04e5 }
                com.coocent.videostore.po.Video r2 = (com.coocent.videostore.p067po.Video) r2     // Catch:{ Exception -> 0x04e5 }
                r3 = 0
                java.lang.Boolean r7 = p369i.p379w.p381j.p382a.C8529b.m46723a(r3)     // Catch:{ Exception -> 0x04e5 }
                r2.mo10526O(r7)     // Catch:{ Exception -> 0x04e5 }
                r15 = 1
                goto L_0x05db
            L_0x05da:
                r3 = 0
            L_0x05db:
                if (r15 == 0) goto L_0x0654
                com.coocent.videostore.db.VideoStoreDatabase r2 = r10.f13570b     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.db.c r2 = r2.mo10390F()     // Catch:{ Exception -> 0x068d }
                T r7 = r1.element     // Catch:{ Exception -> 0x068d }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x068d }
                r5.L$0 = r6     // Catch:{ Exception -> 0x068d }
                r5.L$1 = r9     // Catch:{ Exception -> 0x068d }
                r5.L$2 = r10     // Catch:{ Exception -> 0x068d }
                r8 = r18
                r5.L$3 = r8     // Catch:{ Exception -> 0x068d }
                r5.L$4 = r11     // Catch:{ Exception -> 0x068d }
                r5.L$5 = r1     // Catch:{ Exception -> 0x068d }
                r13 = r44
                r5.I$0 = r13     // Catch:{ Exception -> 0x068d }
                r5.I$1 = r12     // Catch:{ Exception -> 0x068d }
                r5.I$2 = r4     // Catch:{ Exception -> 0x068d }
                r14 = r50
                r5.I$3 = r14     // Catch:{ Exception -> 0x068d }
                r5.I$4 = r0     // Catch:{ Exception -> 0x068d }
                r15 = r20
                r5.I$5 = r15     // Catch:{ Exception -> 0x068d }
                r3 = r53
                r5.I$6 = r3     // Catch:{ Exception -> 0x068d }
                r18 = r0
                r0 = r43
                r5.I$7 = r0     // Catch:{ Exception -> 0x068d }
                r43 = r0
                r0 = r19
                r5.I$8 = r0     // Catch:{ Exception -> 0x068d }
                r19 = r0
                r0 = r21
                r5.I$9 = r0     // Catch:{ Exception -> 0x068d }
                r21 = r0
                r0 = r49
                r5.I$10 = r0     // Catch:{ Exception -> 0x068d }
                r49 = r0
                r0 = 3
                r5.label = r0     // Catch:{ Exception -> 0x068d }
                java.lang.Object r2 = r2.mo10416q(r7, r5)     // Catch:{ Exception -> 0x068d }
                r7 = r54
                if (r2 != r7) goto L_0x0633
                return r7
            L_0x0633:
                r2 = r6
                r20 = r10
                r17 = r11
                r11 = r12
                r12 = r13
                r6 = r3
                r10 = r4
                r13 = r7
                r7 = r15
                r4 = r19
                r3 = r21
                r15 = r5
                r5 = r43
            L_0x0645:
                r19 = r4
                r4 = r3
                r3 = r1
                r1 = r17
                r17 = r9
                r9 = r14
                r14 = r12
                r12 = r11
                r11 = r10
                r10 = r20
                goto L_0x0673
            L_0x0654:
                r8 = r18
                r15 = r20
                r13 = r44
                r14 = r50
                r3 = r53
                r7 = r54
                r18 = r0
                r0 = 3
                r2 = r6
                r17 = r9
                r9 = r14
                r6 = r3
                r14 = r13
                r3 = r1
                r13 = r7
                r1 = r11
                r7 = r15
                r11 = r4
                r15 = r5
                r4 = r21
                r5 = r43
            L_0x0673:
                T r3 = r3.element     // Catch:{ Exception -> 0x068a }
                com.coocent.videostore.po.Video r3 = (com.coocent.videostore.p067po.Video) r3     // Catch:{ Exception -> 0x068a }
                r10.m20335o(r3)     // Catch:{ Exception -> 0x068a }
                r53 = r6
                r20 = r17
                r3 = r49
                r6 = r2
                r2 = r8
                r8 = r18
                r55 = r14
                r14 = r13
                r13 = r55
                goto L_0x06c4
            L_0x068a:
                r0 = move-exception
                goto L_0x07b4
            L_0x068d:
                r0 = move-exception
                r7 = r54
                goto L_0x076b
            L_0x0692:
                r49 = r3
                r3 = r6
                r15 = r7
                r14 = r9
                r4 = r10
                r7 = r19
                r9 = r20
                r13 = r44
                r12 = r45
                r5 = r46
                r21 = r47
                r6 = r58
                r10 = r0
                r19 = r11
                r47 = r18
                r0 = 3
                r11 = r1
                r18 = r8
                goto L_0x033b
            L_0x06b1:
                r53 = r3
                r2 = r8
                r20 = r9
                r1 = r11
                r9 = r14
                r8 = r18
                r3 = r49
                r11 = r4
                r14 = r7
                r7 = r15
                r4 = r21
                r15 = r5
                r5 = r43
            L_0x06c4:
                boolean r17 = r2.moveToNext()     // Catch:{ Exception -> 0x0759 }
                if (r17 != 0) goto L_0x0749
                boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0759 }
                r17 = 1
                r0 = r0 ^ 1
                if (r0 == 0) goto L_0x0741
                java.util.Collection r0 = r1.values()     // Catch:{ Exception -> 0x0759 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0759 }
                r3 = r2
                r4 = r10
                r13 = r14
                r5 = r20
                r2 = r0
            L_0x06e2:
                boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x044c }
                if (r0 == 0) goto L_0x073b
                java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x044c }
                com.coocent.videostore.po.Video r0 = (com.coocent.videostore.p067po.Video) r0     // Catch:{ Exception -> 0x044c }
                java.lang.Boolean r1 = r0.mo10554m()     // Catch:{ Exception -> 0x044c }
                if (r1 == 0) goto L_0x0739
                java.lang.Boolean r1 = r0.mo10554m()     // Catch:{ Exception -> 0x044c }
                boolean r1 = r1.booleanValue()     // Catch:{ Exception -> 0x044c }
                if (r1 != 0) goto L_0x0739
                com.coocent.videostore.db.VideoStoreDatabase r1 = r4.f13570b     // Catch:{ Exception -> 0x044c }
                com.coocent.videostore.db.c r1 = r1.mo10390F()     // Catch:{ Exception -> 0x044c }
                r15.L$0 = r6     // Catch:{ Exception -> 0x044c }
                r15.L$1 = r5     // Catch:{ Exception -> 0x044c }
                r15.L$2 = r4     // Catch:{ Exception -> 0x044c }
                r15.L$3 = r3     // Catch:{ Exception -> 0x044c }
                r15.L$4 = r2     // Catch:{ Exception -> 0x044c }
                r15.L$5 = r0     // Catch:{ Exception -> 0x044c }
                r7 = 4
                r15.label = r7     // Catch:{ Exception -> 0x044c }
                java.lang.Object r1 = r1.mo10402c(r0, r15)     // Catch:{ Exception -> 0x044c }
                if (r1 != r13) goto L_0x071c
                return r13
            L_0x071c:
                java.lang.String r1 = r0.mo10564v()     // Catch:{ Exception -> 0x044c }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x044c }
                if (r1 != 0) goto L_0x06e2
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x044c }
                java.lang.String r0 = r0.mo10564v()     // Catch:{ Exception -> 0x044c }
                r1.<init>(r0)     // Catch:{ Exception -> 0x044c }
                boolean r0 = r1.exists()     // Catch:{ Exception -> 0x044c }
                if (r0 == 0) goto L_0x06e2
                r1.delete()     // Catch:{ Exception -> 0x044c }
                goto L_0x06e2
            L_0x0739:
                r7 = 4
                goto L_0x06e2
            L_0x073b:
                r0 = r4
                r2 = r6
                r1 = r15
                r15 = r3
                goto L_0x078b
            L_0x0741:
                r0 = r10
                r13 = r14
                r1 = r15
                r5 = r20
                r15 = r2
                r2 = r6
                goto L_0x078b
            L_0x0749:
                r16 = 4
                r58 = r6
                r0 = r10
                r10 = r11
                r11 = r19
                r18 = r47
                r6 = r53
                r19 = r14
                goto L_0x025f
            L_0x0759:
                r0 = move-exception
                r2 = r6
                r13 = r14
                goto L_0x07b4
            L_0x075e:
                r0 = move-exception
                r6 = r58
                r7 = r19
                r5 = r46
                goto L_0x076b
            L_0x0766:
                r0 = move-exception
                r6 = r58
                r7 = r19
            L_0x076b:
                r15 = r5
                goto L_0x0773
            L_0x076d:
                r0 = move-exception
                r6 = r58
                r5 = r15
                r7 = r19
            L_0x0773:
                r2 = r6
                r13 = r7
                goto L_0x07b4
            L_0x0776:
                r0 = move-exception
                r22 = r2
            L_0x0779:
                r15 = r57
                r2 = r14
                r13 = r22
                goto L_0x07b4
            L_0x077f:
                r0 = move-exception
                r22 = r19
                goto L_0x0779
            L_0x0783:
                r20 = r0
                r22 = r13
                r1 = r57
                r2 = r14
                r5 = r15
            L_0x078b:
                r15.close()     // Catch:{ Exception -> 0x0146 }
                r0.m20315D()     // Catch:{ Exception -> 0x0146 }
                r0.m20320I()     // Catch:{ Exception -> 0x0146 }
                r0.m20316E()     // Catch:{ Exception -> 0x0146 }
                r1.L$0 = r2     // Catch:{ Exception -> 0x0146 }
                r1.L$1 = r5     // Catch:{ Exception -> 0x0146 }
                r3 = 0
                r1.L$2 = r3     // Catch:{ Exception -> 0x0146 }
                r1.L$3 = r3     // Catch:{ Exception -> 0x0146 }
                r1.L$4 = r3     // Catch:{ Exception -> 0x0146 }
                r1.L$5 = r3     // Catch:{ Exception -> 0x0146 }
                r0 = 5
                r1.label = r0     // Catch:{ Exception -> 0x0146 }
                java.lang.Object r0 = r2.emit(r3, r1)     // Catch:{ Exception -> 0x0146 }
                if (r0 != r13) goto L_0x07ce
                return r13
            L_0x07ae:
                r0 = move-exception
                r22 = r13
                r15 = r57
                r2 = r14
            L_0x07b4:
                r0.printStackTrace()
                r1 = 0
                r15.L$0 = r1
                r15.L$1 = r1
                r15.L$2 = r1
                r15.L$3 = r1
                r15.L$4 = r1
                r15.L$5 = r1
                r1 = 6
                r15.label = r1
                java.lang.Object r0 = r2.emit(r0, r15)
                if (r0 != r13) goto L_0x07ce
                return r13
            L_0x07ce:
                i.t r0 = p369i.C8457t.f34900a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4790y.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C8533f(mo30599c = "com.coocent.videostore.repository.VideoDataSource$scanVideo$2", mo30600f = "VideoDataSource.kt", mo30601l = {320, 380, 431}, mo30602m = "invokeSuspend")
    /* renamed from: f.c.p.a.d$z */
    /* compiled from: VideoDataSource.kt */
    static final class C4791z extends C8539k implements C8574p<C8902r0, C8508d<? super C8457t>, Object> {
        final /* synthetic */ Uri $scanUri;
        int I$0;
        int I$1;
        int I$10;
        int I$11;
        int I$2;
        int I$3;
        int I$4;
        int I$5;
        int I$6;
        int I$7;
        int I$8;
        int I$9;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ C4752d this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4791z(C4752d dVar, Uri uri, C8508d<? super C4791z> dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$scanUri = uri;
        }

        public final C8508d<C8457t> create(Object obj, C8508d<?> dVar) {
            return new C4791z(this.this$0, this.$scanUri, dVar);
        }

        public final Object invoke(C8902r0 r0Var, C8508d<? super C8457t> dVar) {
            return ((C4791z) create(r0Var, dVar)).invokeSuspend(C8457t.f34900a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:111:0x04f4 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:125:0x0530 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x0584 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0604 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x0607 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0224 A[Catch:{ Exception -> 0x00f5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x023d A[Catch:{ Exception -> 0x00f5 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r62) {
            /*
                r61 = this;
                r1 = r61
                java.lang.String r0 = "date_modified"
                java.lang.String r2 = "date_added"
                java.lang.String r3 = "mime_type"
                java.lang.String r4 = "height"
                java.lang.String r5 = "width"
                java.lang.String r6 = "_size"
                java.lang.String r7 = "title"
                java.lang.String r8 = "_display_name"
                java.lang.String r9 = "_data"
                java.lang.String r10 = "_id"
                java.lang.String r11 = "datetaken"
                java.lang.String r12 = "duration"
                java.lang.Object r13 = p369i.p379w.p380i.C8527d.m46722d()
                int r14 = r1.label
                r15 = 1
                if (r14 == 0) goto L_0x00f8
                if (r14 == r15) goto L_0x00b7
                r0 = 2
                if (r14 == r0) goto L_0x0075
                r0 = 3
                if (r14 != r0) goto L_0x006d
                int r0 = r1.I$11
                int r2 = r1.I$10
                int r3 = r1.I$9
                int r4 = r1.I$8
                int r5 = r1.I$7
                int r6 = r1.I$6
                int r7 = r1.I$5
                int r8 = r1.I$4
                int r9 = r1.I$3
                int r10 = r1.I$2
                int r11 = r1.I$1
                int r12 = r1.I$0
                java.lang.Object r14 = r1.L$4
                i.z.d.t r14 = (p369i.p387z.p389d.C8602t) r14
                java.lang.Object r15 = r1.L$3
                java.util.Map r15 = (java.util.Map) r15
                r20 = r0
                java.lang.Object r0 = r1.L$2
                android.database.Cursor r0 = (android.database.Cursor) r0
                r21 = r0
                java.lang.Object r0 = r1.L$1
                f.c.p.a.d r0 = (p159f.p166c.p231p.p232a.C4752d) r0
                r22 = r0
                java.lang.Object r0 = r1.L$0
                android.database.Cursor r0 = (android.database.Cursor) r0
                p369i.C8450m.m46575b(r62)     // Catch:{ Exception -> 0x00f5 }
                r16 = r1
                r44 = r4
                r1 = r14
                r50 = r20
                r14 = r22
                r4 = r0
                r0 = 3
                goto L_0x0594
            L_0x006d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x0075:
                int r0 = r1.I$11
                int r2 = r1.I$10
                int r3 = r1.I$9
                int r4 = r1.I$8
                int r5 = r1.I$7
                int r6 = r1.I$6
                int r7 = r1.I$5
                int r8 = r1.I$4
                int r9 = r1.I$3
                int r10 = r1.I$2
                int r11 = r1.I$1
                int r12 = r1.I$0
                java.lang.Object r14 = r1.L$4
                i.z.d.t r14 = (p369i.p387z.p389d.C8602t) r14
                java.lang.Object r15 = r1.L$3
                java.util.Map r15 = (java.util.Map) r15
                r20 = r0
                java.lang.Object r0 = r1.L$2
                android.database.Cursor r0 = (android.database.Cursor) r0
                r21 = r0
                java.lang.Object r0 = r1.L$1
                f.c.p.a.d r0 = (p159f.p166c.p231p.p232a.C4752d) r0
                r22 = r0
                java.lang.Object r0 = r1.L$0
                android.database.Cursor r0 = (android.database.Cursor) r0
                p369i.C8450m.m46575b(r62)     // Catch:{ Exception -> 0x00f5 }
                r17 = r1
                r44 = r4
                r1 = r6
                r50 = r20
                r6 = 2
                r4 = r0
                r0 = r22
                goto L_0x03dd
            L_0x00b7:
                int r0 = r1.I$11
                int r2 = r1.I$10
                int r3 = r1.I$9
                int r4 = r1.I$8
                int r5 = r1.I$7
                int r6 = r1.I$6
                int r7 = r1.I$5
                int r8 = r1.I$4
                int r9 = r1.I$3
                int r10 = r1.I$2
                int r11 = r1.I$1
                int r12 = r1.I$0
                java.lang.Object r14 = r1.L$3
                java.util.Map r14 = (java.util.Map) r14
                java.lang.Object r15 = r1.L$2
                android.database.Cursor r15 = (android.database.Cursor) r15
                r20 = r0
                java.lang.Object r0 = r1.L$1
                f.c.p.a.d r0 = (p159f.p166c.p231p.p232a.C4752d) r0
                r21 = r0
                java.lang.Object r0 = r1.L$0
                android.database.Cursor r0 = (android.database.Cursor) r0
                p369i.C8450m.m46575b(r62)     // Catch:{ Exception -> 0x00f5 }
                r22 = r15
                r15 = r0
                r0 = r62
                r58 = r21
                r21 = r2
                r2 = r13
                r13 = r14
                r14 = r58
                goto L_0x01dd
            L_0x00f5:
                r0 = move-exception
                goto L_0x0615
            L_0x00f8:
                p369i.C8450m.m46575b(r62)
                int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00f5 }
                r15 = 29
                f.c.p.a.d r14 = r1.this$0     // Catch:{ Exception -> 0x00f5 }
                android.app.Application r14 = r14.f13569a     // Catch:{ Exception -> 0x00f5 }
                android.content.ContentResolver r20 = r14.getContentResolver()     // Catch:{ Exception -> 0x00f5 }
                android.net.Uri r14 = r1.$scanUri     // Catch:{ Exception -> 0x00f5 }
                r15 = 12
                java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ Exception -> 0x00f5 }
                r18 = 0
                r15[r18] = r10     // Catch:{ Exception -> 0x00f5 }
                r19 = 1
                r15[r19] = r9     // Catch:{ Exception -> 0x00f5 }
                r17 = 2
                r15[r17] = r8     // Catch:{ Exception -> 0x00f5 }
                r16 = 3
                r15[r16] = r7     // Catch:{ Exception -> 0x00f5 }
                r21 = 4
                r15[r21] = r6     // Catch:{ Exception -> 0x00f5 }
                r21 = 5
                r15[r21] = r12     // Catch:{ Exception -> 0x00f5 }
                r21 = 6
                r15[r21] = r5     // Catch:{ Exception -> 0x00f5 }
                r21 = 7
                r15[r21] = r4     // Catch:{ Exception -> 0x00f5 }
                r21 = 8
                r15[r21] = r3     // Catch:{ Exception -> 0x00f5 }
                r21 = 9
                r15[r21] = r11     // Catch:{ Exception -> 0x00f5 }
                r21 = 10
                r15[r21] = r2     // Catch:{ Exception -> 0x00f5 }
                r21 = 11
                r15[r21] = r0     // Catch:{ Exception -> 0x00f5 }
                r23 = 0
                r24 = 0
                java.lang.String r25 = "title"
                r21 = r14
                r22 = r15
                android.database.Cursor r15 = r20.query(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x00f5 }
                if (r15 != 0) goto L_0x0151
                goto L_0x0618
            L_0x0151:
                f.c.p.a.d r14 = r1.this$0     // Catch:{ Exception -> 0x00f5 }
                int r10 = r15.getColumnIndex(r10)     // Catch:{ Exception -> 0x00f5 }
                int r9 = r15.getColumnIndex(r9)     // Catch:{ Exception -> 0x00f5 }
                int r8 = r15.getColumnIndex(r8)     // Catch:{ Exception -> 0x00f5 }
                int r7 = r15.getColumnIndex(r7)     // Catch:{ Exception -> 0x00f5 }
                int r6 = r15.getColumnIndex(r6)     // Catch:{ Exception -> 0x00f5 }
                int r12 = r15.getColumnIndex(r12)     // Catch:{ Exception -> 0x00f5 }
                int r5 = r15.getColumnIndex(r5)     // Catch:{ Exception -> 0x00f5 }
                int r4 = r15.getColumnIndex(r4)     // Catch:{ Exception -> 0x00f5 }
                int r3 = r15.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f5 }
                int r11 = r15.getColumnIndex(r11)     // Catch:{ Exception -> 0x00f5 }
                int r2 = r15.getColumnIndex(r2)     // Catch:{ Exception -> 0x00f5 }
                int r0 = r15.getColumnIndex(r0)     // Catch:{ Exception -> 0x00f5 }
                boolean r20 = r15.moveToFirst()     // Catch:{ Exception -> 0x00f5 }
                if (r20 == 0) goto L_0x0611
                r20 = r13
                java.util.LinkedHashMap r13 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00f5 }
                r13.<init>()     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.db.VideoStoreDatabase r21 = r14.f13570b     // Catch:{ Exception -> 0x00f5 }
                r62 = r0
                com.coocent.videostore.db.c r0 = r21.mo10390F()     // Catch:{ Exception -> 0x00f5 }
                r1.L$0 = r15     // Catch:{ Exception -> 0x00f5 }
                r1.L$1 = r14     // Catch:{ Exception -> 0x00f5 }
                r1.L$2 = r15     // Catch:{ Exception -> 0x00f5 }
                r1.L$3 = r13     // Catch:{ Exception -> 0x00f5 }
                r1.I$0 = r10     // Catch:{ Exception -> 0x00f5 }
                r1.I$1 = r9     // Catch:{ Exception -> 0x00f5 }
                r1.I$2 = r8     // Catch:{ Exception -> 0x00f5 }
                r1.I$3 = r7     // Catch:{ Exception -> 0x00f5 }
                r1.I$4 = r6     // Catch:{ Exception -> 0x00f5 }
                r1.I$5 = r12     // Catch:{ Exception -> 0x00f5 }
                r1.I$6 = r5     // Catch:{ Exception -> 0x00f5 }
                r1.I$7 = r4     // Catch:{ Exception -> 0x00f5 }
                r1.I$8 = r3     // Catch:{ Exception -> 0x00f5 }
                r1.I$9 = r11     // Catch:{ Exception -> 0x00f5 }
                r1.I$10 = r2     // Catch:{ Exception -> 0x00f5 }
                r21 = r2
                r2 = r62
                r1.I$11 = r2     // Catch:{ Exception -> 0x00f5 }
                r62 = r2
                r2 = 1
                r1.label = r2     // Catch:{ Exception -> 0x00f5 }
                java.lang.Object r0 = r0.mo10400a(r1)     // Catch:{ Exception -> 0x00f5 }
                r2 = r20
                if (r0 != r2) goto L_0x01cc
                return r2
            L_0x01cc:
                r20 = r62
                r22 = r15
                r58 = r4
                r4 = r3
                r3 = r11
                r11 = r9
                r9 = r7
                r7 = r12
                r12 = r10
                r10 = r8
                r8 = r6
                r6 = r5
                r5 = r58
            L_0x01dd:
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x00f5 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00f5 }
            L_0x01e3:
                boolean r23 = r0.hasNext()     // Catch:{ Exception -> 0x00f5 }
                if (r23 == 0) goto L_0x0207
                java.lang.Object r23 = r0.next()     // Catch:{ Exception -> 0x00f5 }
                r24 = r23
                com.coocent.videostore.po.Video r24 = (com.coocent.videostore.p067po.Video) r24     // Catch:{ Exception -> 0x00f5 }
                long r24 = r24.mo10553l()     // Catch:{ Exception -> 0x00f5 }
                r62 = r0
                java.lang.Long r0 = p369i.p379w.p381j.p382a.C8529b.m46725c(r24)     // Catch:{ Exception -> 0x00f5 }
                r1 = r23
                com.coocent.videostore.po.Video r1 = (com.coocent.videostore.p067po.Video) r1     // Catch:{ Exception -> 0x00f5 }
                r13.put(r0, r1)     // Catch:{ Exception -> 0x00f5 }
                r1 = r61
                r0 = r62
                goto L_0x01e3
            L_0x0207:
                r62 = r61
                r1 = r20
                r0 = r22
                r20 = r2
                r2 = r21
                r21 = r15
            L_0x0213:
                java.lang.String r15 = r0.getString(r4)     // Catch:{ Exception -> 0x00f5 }
                r44 = r4
                java.lang.String r4 = "mimeType"
                p369i.p387z.p389d.C8594l.m46770d(r15, r4)     // Catch:{ Exception -> 0x00f5 }
                boolean r4 = r14.m20336w(r15)     // Catch:{ Exception -> 0x00f5 }
                if (r4 == 0) goto L_0x023d
                r50 = r1
                r55 = r2
                r45 = r3
                r15 = r5
                r3 = r9
                r2 = r11
                r11 = r12
                r4 = r21
                r5 = r62
                r21 = r0
                r12 = r6
                r9 = r8
                r6 = r10
                r8 = r20
                r0 = 3
                r10 = r7
                goto L_0x05e9
            L_0x023d:
                r4 = r2
                r45 = r3
                long r2 = r0.getLong(r12)     // Catch:{ Exception -> 0x00f5 }
                r46 = r12
                java.lang.String r12 = r0.getString(r11)     // Catch:{ Exception -> 0x00f5 }
                r47 = r11
                android.net.Uri r11 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch:{ Exception -> 0x00f5 }
                android.net.Uri r11 = android.content.ContentUris.withAppendedId(r11, r2)     // Catch:{ Exception -> 0x00f5 }
                r36 = r15
                java.lang.String r15 = "withAppendedId(\n        …                        )"
                p369i.p387z.p389d.C8594l.m46770d(r11, r15)     // Catch:{ Exception -> 0x00f5 }
                android.app.Application r15 = r14.f13569a     // Catch:{ Exception -> 0x00f5 }
                boolean r15 = p159f.p166c.p231p.p233b.C4796a.m20381f(r15, r11)     // Catch:{ Exception -> 0x00f5 }
                if (r15 == 0) goto L_0x05d1
                boolean r15 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Exception -> 0x00f5 }
                if (r15 == 0) goto L_0x026b
                goto L_0x05d1
            L_0x026b:
                java.lang.String r15 = r0.getString(r10)     // Catch:{ Exception -> 0x00f5 }
                r48 = r10
                java.lang.String r10 = r0.getString(r9)     // Catch:{ Exception -> 0x00f5 }
                r49 = r9
                r28 = r10
                long r9 = r0.getLong(r1)     // Catch:{ Exception -> 0x00f5 }
                long r22 = r0.getLong(r8)     // Catch:{ Exception -> 0x00f5 }
                r24 = 0
                int r26 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
                if (r26 > 0) goto L_0x0293
                r50 = r1
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00f5 }
                r1.<init>(r12)     // Catch:{ Exception -> 0x00f5 }
                long r22 = r1.length()     // Catch:{ Exception -> 0x00f5 }
                goto L_0x0295
            L_0x0293:
                r50 = r1
            L_0x0295:
                r30 = r22
                i.z.d.t r1 = new i.z.d.t     // Catch:{ Exception -> 0x00f5 }
                r1.<init>()     // Catch:{ Exception -> 0x00f5 }
                r51 = r8
                java.lang.Long r8 = p369i.p379w.p381j.p382a.C8529b.m46725c(r2)     // Catch:{ Exception -> 0x00f5 }
                java.lang.Object r8 = r13.get(r8)     // Catch:{ Exception -> 0x00f5 }
                r1.element = r8     // Catch:{ Exception -> 0x00f5 }
                r52 = r13
                if (r8 != 0) goto L_0x03fe
                java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00f5 }
                r8.<init>(r12)     // Catch:{ Exception -> 0x00f5 }
                java.io.File r8 = r8.getParentFile()     // Catch:{ Exception -> 0x00f5 }
                if (r8 != 0) goto L_0x02d3
                r55 = r4
                r15 = r5
                r12 = r6
                r10 = r7
                r8 = r20
                r4 = r21
                r11 = r46
                r2 = r47
                r6 = r48
                r3 = r49
                r9 = r51
                r13 = r52
                r5 = r62
                r21 = r0
            L_0x02d0:
                r0 = 3
                goto L_0x05e9
            L_0x02d3:
                java.lang.String r13 = "displayName"
                p369i.p387z.p389d.C8594l.m46770d(r15, r13)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r13 = "."
                r53 = r14
                r14 = 0
                r54 = r1
                r1 = 2
                java.lang.String r13 = p369i.p376f0.C8437p.m46556e0(r15, r13, r14, r1, r14)     // Catch:{ Exception -> 0x00f5 }
                java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r14 = "US"
                p369i.p387z.p389d.C8594l.m46770d(r1, r14)     // Catch:{ Exception -> 0x00f5 }
                if (r13 == 0) goto L_0x03f6
                java.lang.String r1 = r13.toLowerCase(r1)     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r13 = "(this as java.lang.String).toLowerCase(locale)"
                p369i.p387z.p389d.C8594l.m46770d(r1, r13)     // Catch:{ Exception -> 0x00f5 }
                long r32 = r0.getLong(r7)     // Catch:{ Exception -> 0x00f5 }
                int r34 = r0.getInt(r6)     // Catch:{ Exception -> 0x00f5 }
                int r35 = r0.getInt(r5)     // Catch:{ Exception -> 0x00f5 }
                r13 = r45
                long r26 = r0.getLong(r13)     // Catch:{ Exception -> 0x00f5 }
                long r37 = r0.getLong(r4)     // Catch:{ Exception -> 0x00f5 }
                int r14 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
                if (r14 <= 0) goto L_0x031a
                r14 = 1000(0x3e8, float:1.401E-42)
                r45 = r13
                long r13 = (long) r14     // Catch:{ Exception -> 0x00f5 }
                long r26 = r26 / r13
                r37 = r26
                goto L_0x031c
            L_0x031a:
                r45 = r13
            L_0x031c:
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
                long r23 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
                r55 = r4
                r56 = r5
                r4 = 604800000(0x240c8400, float:3.046947E-17)
                long r4 = (long) r4     // Catch:{ Exception -> 0x00f5 }
                long r23 = r23 - r4
                int r4 = (r23 > r37 ? 1 : (r23 == r37 ? 0 : -1))
                if (r4 > 0) goto L_0x0338
                int r4 = (r37 > r13 ? 1 : (r37 == r13 ? 0 : -1))
                if (r4 > 0) goto L_0x0338
                r4 = 1
                goto L_0x0339
            L_0x0338:
                r4 = 0
            L_0x0339:
                com.coocent.videostore.po.Video r5 = new com.coocent.videostore.po.Video     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r25 = r11.toString()     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r41 = r8.getName()     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r42 = r8.getPath()     // Catch:{ Exception -> 0x00f5 }
                if (r4 == 0) goto L_0x034c
                r43 = 1
                goto L_0x034e
            L_0x034c:
                r43 = 0
            L_0x034e:
                r22 = r5
                r23 = r2
                r26 = r12
                r27 = r15
                r29 = r1
                r39 = r9
                r22.<init>(r23, r25, r26, r27, r28, r29, r30, r32, r34, r35, r36, r37, r39, r41, r42, r43)     // Catch:{ Exception -> 0x00f5 }
                r1 = r54
                r1.element = r5     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.db.VideoStoreDatabase r2 = r53.f13570b     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.db.c r2 = r2.mo10390F()     // Catch:{ Exception -> 0x00f5 }
                T r3 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r3 = (com.coocent.videostore.p067po.Video) r3     // Catch:{ Exception -> 0x00f5 }
                r5 = r62
                r4 = r21
                r5.L$0 = r4     // Catch:{ Exception -> 0x00f5 }
                r14 = r53
                r5.L$1 = r14     // Catch:{ Exception -> 0x00f5 }
                r5.L$2 = r0     // Catch:{ Exception -> 0x00f5 }
                r13 = r52
                r5.L$3 = r13     // Catch:{ Exception -> 0x00f5 }
                r5.L$4 = r1     // Catch:{ Exception -> 0x00f5 }
                r11 = r46
                r5.I$0 = r11     // Catch:{ Exception -> 0x00f5 }
                r8 = r47
                r5.I$1 = r8     // Catch:{ Exception -> 0x00f5 }
                r9 = r48
                r5.I$2 = r9     // Catch:{ Exception -> 0x00f5 }
                r10 = r49
                r5.I$3 = r10     // Catch:{ Exception -> 0x00f5 }
                r12 = r51
                r5.I$4 = r12     // Catch:{ Exception -> 0x00f5 }
                r5.I$5 = r7     // Catch:{ Exception -> 0x00f5 }
                r5.I$6 = r6     // Catch:{ Exception -> 0x00f5 }
                r15 = r56
                r5.I$7 = r15     // Catch:{ Exception -> 0x00f5 }
                r21 = r6
                r6 = r44
                r5.I$8 = r6     // Catch:{ Exception -> 0x00f5 }
                r44 = r6
                r6 = r45
                r5.I$9 = r6     // Catch:{ Exception -> 0x00f5 }
                r45 = r6
                r6 = r55
                r5.I$10 = r6     // Catch:{ Exception -> 0x00f5 }
                r55 = r6
                r6 = r50
                r5.I$11 = r6     // Catch:{ Exception -> 0x00f5 }
                r50 = r6
                r6 = 2
                r5.label = r6     // Catch:{ Exception -> 0x00f5 }
                java.lang.Object r2 = r2.mo10403d(r3, r5)     // Catch:{ Exception -> 0x00f5 }
                r3 = r20
                if (r2 != r3) goto L_0x03c1
                return r3
            L_0x03c1:
                r17 = r5
                r5 = r15
                r2 = r55
                r15 = r13
                r13 = r3
                r3 = r45
                r58 = r21
                r21 = r0
                r0 = r14
                r14 = r1
                r1 = r58
                r59 = r11
                r11 = r8
                r8 = r12
                r12 = r59
                r60 = r10
                r10 = r9
                r9 = r60
            L_0x03dd:
                T r14 = r14.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r14 = (com.coocent.videostore.p067po.Video) r14     // Catch:{ Exception -> 0x00f5 }
                r0.m20335o(r14)     // Catch:{ Exception -> 0x00f5 }
                r14 = r0
                r6 = r1
                r16 = r4
                r20 = r17
                r4 = r44
                r1 = r50
                r0 = 3
                r58 = r15
                r15 = r13
                r13 = r58
                goto L_0x05fe
            L_0x03f6:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)     // Catch:{ Exception -> 0x00f5 }
                throw r0     // Catch:{ Exception -> 0x00f5 }
            L_0x03fe:
                r55 = r4
                r57 = r5
                r23 = r7
                r4 = r21
                r11 = r46
                r2 = r47
                r3 = r49
                r7 = r51
                r13 = r52
                r5 = r62
                r21 = r6
                r6 = r48
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r8 = r8.mo10561t()     // Catch:{ Exception -> 0x00f5 }
                boolean r8 = android.text.TextUtils.equals(r8, r12)     // Catch:{ Exception -> 0x00f5 }
                if (r8 != 0) goto L_0x0465
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                r8.mo10533W(r12)     // Catch:{ Exception -> 0x00f5 }
                java.io.File r8 = new java.io.File     // Catch:{ Exception -> 0x00f5 }
                r8.<init>(r12)     // Catch:{ Exception -> 0x00f5 }
                java.io.File r8 = r8.getParentFile()     // Catch:{ Exception -> 0x00f5 }
                if (r8 != 0) goto L_0x0437
                r51 = r7
                goto L_0x0463
            L_0x0437:
                java.lang.String r12 = r8.getPath()     // Catch:{ Exception -> 0x00f5 }
                r51 = r7
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r7 = r7.mo10551j()     // Catch:{ Exception -> 0x00f5 }
                boolean r7 = android.text.TextUtils.equals(r12, r7)     // Catch:{ Exception -> 0x00f5 }
                if (r7 != 0) goto L_0x0461
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r12 = r8.getPath()     // Catch:{ Exception -> 0x00f5 }
                r7.mo10523L(r12)     // Catch:{ Exception -> 0x00f5 }
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r8 = r8.getName()     // Catch:{ Exception -> 0x00f5 }
                r7.mo10522J(r8)     // Catch:{ Exception -> 0x00f5 }
            L_0x0461:
                i.t r7 = p369i.C8457t.f34900a     // Catch:{ Exception -> 0x00f5 }
            L_0x0463:
                r7 = 1
                goto L_0x0468
            L_0x0465:
                r51 = r7
                r7 = 0
            L_0x0468:
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r8 = r8.mo10546f()     // Catch:{ Exception -> 0x00f5 }
                boolean r8 = android.text.TextUtils.equals(r8, r15)     // Catch:{ Exception -> 0x00f5 }
                if (r8 != 0) goto L_0x047e
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                r7.mo10519F(r15)     // Catch:{ Exception -> 0x00f5 }
                r7 = 1
            L_0x047e:
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                java.lang.String r8 = r8.mo10565w()     // Catch:{ Exception -> 0x00f5 }
                r12 = r28
                boolean r8 = android.text.TextUtils.equals(r8, r12)     // Catch:{ Exception -> 0x00f5 }
                if (r8 != 0) goto L_0x0496
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                r7.mo10538a0(r12)     // Catch:{ Exception -> 0x00f5 }
                r7 = 1
            L_0x0496:
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                long r24 = r8.mo10563u()     // Catch:{ Exception -> 0x00f5 }
                r62 = r7
                r7 = r30
                int r12 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
                if (r12 == 0) goto L_0x04af
                T r12 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r12 = (com.coocent.videostore.p067po.Video) r12     // Catch:{ Exception -> 0x00f5 }
                r12.mo10535Y(r7)     // Catch:{ Exception -> 0x00f5 }
                r7 = 1
                goto L_0x04b1
            L_0x04af:
                r7 = r62
            L_0x04b1:
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                long r24 = r8.mo10542d()     // Catch:{ Exception -> 0x00f5 }
                int r8 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
                if (r8 == 0) goto L_0x04c5
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                r7.mo10517C(r9)     // Catch:{ Exception -> 0x00f5 }
                r7 = 1
            L_0x04c5:
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                long r8 = r8.mo10559r()     // Catch:{ Exception -> 0x00f5 }
                r24 = -9223372036854775808
                int r10 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
                if (r10 == 0) goto L_0x04e7
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                boolean r8 = r8.mo10569z()     // Catch:{ Exception -> 0x00f5 }
                if (r8 == 0) goto L_0x04e7
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                r8 = 0
                r7.mo10534X(r8)     // Catch:{ Exception -> 0x00f5 }
            L_0x04e5:
                r7 = 1
                goto L_0x052e
            L_0x04e7:
                r8 = 0
                T r9 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r9 = (com.coocent.videostore.p067po.Video) r9     // Catch:{ Exception -> 0x00f5 }
                long r9 = r9.mo10559r()     // Catch:{ Exception -> 0x00f5 }
                int r12 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
                if (r12 != 0) goto L_0x052e
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
                long r24 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f5 }
                r26 = r9
                r12 = 604800000(0x240c8400, float:3.046947E-17)
                long r8 = (long) r12     // Catch:{ Exception -> 0x00f5 }
                long r24 = r24 - r8
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                long r8 = r8.mo10544e()     // Catch:{ Exception -> 0x00f5 }
                int r10 = (r24 > r8 ? 1 : (r24 == r8 ? 0 : -1))
                if (r10 > 0) goto L_0x0516
                int r10 = (r8 > r26 ? 1 : (r8 == r26 ? 0 : -1))
                if (r10 > 0) goto L_0x0516
                r8 = 1
                goto L_0x0517
            L_0x0516:
                r8 = 0
            L_0x0517:
                T r9 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r9 = (com.coocent.videostore.p067po.Video) r9     // Catch:{ Exception -> 0x00f5 }
                boolean r9 = r9.mo10569z()     // Catch:{ Exception -> 0x00f5 }
                if (r8 == r9) goto L_0x052e
                T r7 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r7 = (com.coocent.videostore.p067po.Video) r7     // Catch:{ Exception -> 0x00f5 }
                if (r8 == 0) goto L_0x0529
                r8 = 1
                goto L_0x052a
            L_0x0529:
                r8 = 0
            L_0x052a:
                r7.mo10534X(r8)     // Catch:{ Exception -> 0x00f5 }
                goto L_0x04e5
            L_0x052e:
                if (r7 == 0) goto L_0x05a1
                com.coocent.videostore.db.VideoStoreDatabase r7 = r14.f13570b     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.db.c r7 = r7.mo10390F()     // Catch:{ Exception -> 0x00f5 }
                T r8 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r8 = (com.coocent.videostore.p067po.Video) r8     // Catch:{ Exception -> 0x00f5 }
                r5.L$0 = r4     // Catch:{ Exception -> 0x00f5 }
                r5.L$1 = r14     // Catch:{ Exception -> 0x00f5 }
                r5.L$2 = r0     // Catch:{ Exception -> 0x00f5 }
                r5.L$3 = r13     // Catch:{ Exception -> 0x00f5 }
                r5.L$4 = r1     // Catch:{ Exception -> 0x00f5 }
                r5.I$0 = r11     // Catch:{ Exception -> 0x00f5 }
                r5.I$1 = r2     // Catch:{ Exception -> 0x00f5 }
                r5.I$2 = r6     // Catch:{ Exception -> 0x00f5 }
                r5.I$3 = r3     // Catch:{ Exception -> 0x00f5 }
                r9 = r51
                r5.I$4 = r9     // Catch:{ Exception -> 0x00f5 }
                r10 = r23
                r5.I$5 = r10     // Catch:{ Exception -> 0x00f5 }
                r12 = r21
                r5.I$6 = r12     // Catch:{ Exception -> 0x00f5 }
                r15 = r57
                r5.I$7 = r15     // Catch:{ Exception -> 0x00f5 }
                r21 = r0
                r0 = r44
                r5.I$8 = r0     // Catch:{ Exception -> 0x00f5 }
                r44 = r0
                r0 = r45
                r5.I$9 = r0     // Catch:{ Exception -> 0x00f5 }
                r45 = r0
                r0 = r55
                r5.I$10 = r0     // Catch:{ Exception -> 0x00f5 }
                r55 = r0
                r0 = r50
                r5.I$11 = r0     // Catch:{ Exception -> 0x00f5 }
                r50 = r0
                r0 = 3
                r5.label = r0     // Catch:{ Exception -> 0x00f5 }
                java.lang.Object r7 = r7.mo10416q(r8, r5)     // Catch:{ Exception -> 0x00f5 }
                r8 = r20
                if (r7 != r8) goto L_0x0584
                return r8
            L_0x0584:
                r16 = r5
                r7 = r10
                r5 = r15
                r10 = r6
                r6 = r12
                r15 = r13
                r13 = r8
                r8 = r9
                r12 = r11
                r11 = r2
                r9 = r3
                r3 = r45
                r2 = r55
            L_0x0594:
                r20 = r16
                r16 = r4
                r4 = r44
                r58 = r14
                r14 = r13
                r13 = r15
                r15 = r58
                goto L_0x05c2
            L_0x05a1:
                r8 = r20
                r12 = r21
                r10 = r23
                r9 = r51
                r15 = r57
                r21 = r0
                r0 = 3
                r16 = r4
                r20 = r5
                r7 = r10
                r5 = r15
                r4 = r44
                r10 = r6
                r6 = r12
                r15 = r14
                r14 = r8
                r8 = r9
                r12 = r11
                r11 = r2
                r9 = r3
                r3 = r45
                r2 = r55
            L_0x05c2:
                T r1 = r1.element     // Catch:{ Exception -> 0x00f5 }
                com.coocent.videostore.po.Video r1 = (com.coocent.videostore.p067po.Video) r1     // Catch:{ Exception -> 0x00f5 }
                r15.m20335o(r1)     // Catch:{ Exception -> 0x00f5 }
                r1 = r50
                r58 = r15
                r15 = r14
                r14 = r58
                goto L_0x05fe
            L_0x05d1:
                r50 = r1
                r55 = r4
                r15 = r5
                r12 = r6
                r3 = r9
                r6 = r10
                r4 = r21
                r11 = r46
                r2 = r47
                r5 = r62
                r21 = r0
                r10 = r7
                r9 = r8
                r8 = r20
                goto L_0x02d0
            L_0x05e9:
                r16 = r4
                r20 = r5
                r7 = r10
                r5 = r15
                r4 = r44
                r1 = r50
                r10 = r6
                r15 = r8
                r8 = r9
                r6 = r12
                r9 = r3
                r12 = r11
                r3 = r45
                r11 = r2
                r2 = r55
            L_0x05fe:
                boolean r22 = r21.moveToNext()     // Catch:{ Exception -> 0x00f5 }
                if (r22 != 0) goto L_0x0607
                r15 = r21
                goto L_0x0611
            L_0x0607:
                r62 = r20
                r0 = r21
                r20 = r15
                r21 = r16
                goto L_0x0213
            L_0x0611:
                r15.close()     // Catch:{ Exception -> 0x00f5 }
                goto L_0x0618
            L_0x0615:
                r0.printStackTrace()
            L_0x0618:
                i.t r0 = p369i.C8457t.f34900a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.C4791z.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C4752d(Application application) {
        C8594l.m46771e(application, "mApplication");
        this.f13569a = application;
        this.f13570b = (VideoStoreDatabase) VideoStoreDatabase.f9515n.mo15566a(application);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final Map<String, String> m20314A(File file) {
        File file2 = new File(file, ".config");
        if (!file2.exists()) {
            return null;
        }
        C7781s.C7782a aVar = new C7781s.C7782a();
        aVar.mo29033a(C4816a.f13628c.mo15564a(Map.class, new HashMap()));
        return aVar.mo29034b().mo29029d(Map.class).mo28953b(C8645n.m46985b(C8645n.m46989f(new FileInputStream(file2))));
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m20315D() {
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47302b(), (C8910t0) null, new C4764i(this, (C8508d<? super C4764i>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m20316E() {
        this.f13570b.mo5572B(new C4751c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m20317F(C4752d dVar) {
        C8594l.m46771e(dVar, "this$0");
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47302b(), (C8910t0) null, new C4765j(dVar, (C8508d<? super C4765j>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ba A[Catch:{ Exception -> 0x025a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8 A[Catch:{ Exception -> 0x025a }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0200 A[Catch:{ Exception -> 0x025a }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x020e A[Catch:{ Exception -> 0x025a }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: G */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m20318G(java.io.File r18, java.util.Map<java.lang.String, java.lang.String> r19, p369i.p379w.C8508d<? super p369i.C8457t> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            boolean r2 = r0 instanceof p159f.p166c.p231p.p232a.C4752d.C4772m
            if (r2 == 0) goto L_0x0017
            r2 = r0
            f.c.p.a.d$m r2 = (p159f.p166c.p231p.p232a.C4752d.C4772m) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            f.c.p.a.d$m r2 = new f.c.p.a.d$m
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = p369i.p379w.p380i.C8527d.m46722d()
            int r4 = r2.label
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L_0x0087
            if (r4 == r8) goto L_0x0072
            if (r4 == r7) goto L_0x0061
            if (r4 == r6) goto L_0x0043
            if (r4 != r5) goto L_0x003b
            java.lang.Object r2 = r2.L$0
            java.io.File r2 = (java.io.File) r2
            p369i.C8450m.m46575b(r0)     // Catch:{ Exception -> 0x025a }
            goto L_0x0256
        L_0x003b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0043:
            java.lang.Object r4 = r2.L$5
            android.net.Uri r4 = (android.net.Uri) r4
            java.lang.Object r7 = r2.L$4
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r9 = r2.L$3
            java.util.HashSet r9 = (java.util.HashSet) r9
            java.lang.Object r10 = r2.L$2
            java.util.Map r10 = (java.util.Map) r10
            java.lang.Object r11 = r2.L$1
            java.io.File r11 = (java.io.File) r11
            java.lang.Object r12 = r2.L$0
            f.c.p.a.d r12 = (p159f.p166c.p231p.p232a.C4752d) r12
            p369i.C8450m.m46575b(r0)     // Catch:{ Exception -> 0x025a }
            r8 = 3
            goto L_0x01c8
        L_0x0061:
            java.lang.Object r4 = r2.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r7 = r2.L$1
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r9 = r2.L$0
            f.c.p.a.d r9 = (p159f.p166c.p231p.p232a.C4752d) r9
            p369i.C8450m.m46575b(r0)     // Catch:{ Exception -> 0x025a }
            goto L_0x00de
        L_0x0072:
            java.lang.Object r4 = r2.L$2
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r9 = r2.L$1
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r2.L$0
            f.c.p.a.d r10 = (p159f.p166c.p231p.p232a.C4752d) r10
            p369i.C8450m.m46575b(r0)     // Catch:{ Exception -> 0x025a }
            r16 = r9
            r9 = r0
            r0 = r16
            goto L_0x00b2
        L_0x0087:
            p369i.C8450m.m46575b(r0)
            android.app.Application r0 = r1.f13569a     // Catch:{ Exception -> 0x025a }
            e.k.b.f r0 = p159f.p166c.p231p.p232a.C4792e.m20358b(r0)     // Catch:{ Exception -> 0x025a }
            kotlinx.coroutines.f3.b r0 = r0.mo13321b()     // Catch:{ Exception -> 0x025a }
            f.c.p.a.d$k r4 = new f.c.p.a.d$k     // Catch:{ Exception -> 0x025a }
            r4.<init>(r0)     // Catch:{ Exception -> 0x025a }
            r2.L$0 = r1     // Catch:{ Exception -> 0x025a }
            r0 = r18
            r2.L$1 = r0     // Catch:{ Exception -> 0x025a }
            r9 = r19
            r2.L$2 = r9     // Catch:{ Exception -> 0x025a }
            r2.label = r8     // Catch:{ Exception -> 0x025a }
            java.lang.Object r4 = kotlinx.coroutines.p397f3.C8731d.m47259d(r4, r2)     // Catch:{ Exception -> 0x025a }
            if (r4 != r3) goto L_0x00ac
            return r3
        L_0x00ac:
            r10 = r1
            r16 = r9
            r9 = r4
            r4 = r16
        L_0x00b2:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ Exception -> 0x025a }
            boolean r9 = r9.booleanValue()     // Catch:{ Exception -> 0x025a }
            if (r9 != 0) goto L_0x025e
            android.app.Application r9 = r10.f13569a     // Catch:{ Exception -> 0x025a }
            e.k.b.f r9 = p159f.p166c.p231p.p232a.C4792e.m20358b(r9)     // Catch:{ Exception -> 0x025a }
            kotlinx.coroutines.f3.b r9 = r9.mo13321b()     // Catch:{ Exception -> 0x025a }
            f.c.p.a.d$l r11 = new f.c.p.a.d$l     // Catch:{ Exception -> 0x025a }
            r11.<init>(r9)     // Catch:{ Exception -> 0x025a }
            r2.L$0 = r10     // Catch:{ Exception -> 0x025a }
            r2.L$1 = r0     // Catch:{ Exception -> 0x025a }
            r2.L$2 = r4     // Catch:{ Exception -> 0x025a }
            r2.label = r7     // Catch:{ Exception -> 0x025a }
            java.lang.Object r7 = kotlinx.coroutines.p397f3.C8731d.m47259d(r11, r2)     // Catch:{ Exception -> 0x025a }
            if (r7 != r3) goto L_0x00d8
            return r3
        L_0x00d8:
            r9 = r10
            r16 = r7
            r7 = r0
            r0 = r16
        L_0x00de:
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x025a }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ Exception -> 0x025a }
            r10.<init>(r0)     // Catch:{ Exception -> 0x025a }
            java.util.Set r0 = r4.entrySet()     // Catch:{ Exception -> 0x025a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x025a }
            r12 = r9
            r9 = r10
            r10 = r4
            r4 = r0
        L_0x00f1:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x025a }
            r13 = 0
            if (r0 == 0) goto L_0x0200
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x025a }
            r14 = r0
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ Exception -> 0x025a }
            java.lang.Object r0 = r14.getValue()     // Catch:{ Exception -> 0x025a }
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x025a }
            if (r0 == 0) goto L_0x010c
        L_0x0109:
            r8 = 3
            goto L_0x01cd
        L_0x010c:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x025a }
            r15 = 29
            if (r0 < r15) goto L_0x0143
            java.lang.Object r0 = r14.getValue()     // Catch:{ Exception -> 0x025a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x025a }
            java.lang.String r5 = "%2F"
            java.lang.String r11 = ""
            java.lang.String r5 = p369i.p376f0.C8437p.m46554c0(r0, r5, r11)     // Catch:{ Exception -> 0x025a }
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x025a }
            if (r0 == 0) goto L_0x0132
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x025a }
            java.lang.Object r5 = r14.getValue()     // Catch:{ Exception -> 0x025a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x025a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x025a }
            goto L_0x014e
        L_0x0132:
            java.lang.String r0 = "UTF-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r0)     // Catch:{ Exception -> 0x0139 }
            goto L_0x013d
        L_0x0139:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x025a }
        L_0x013d:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x025a }
            r0.<init>(r7, r5)     // Catch:{ Exception -> 0x025a }
            goto L_0x014e
        L_0x0143:
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x025a }
            java.lang.Object r5 = r14.getValue()     // Catch:{ Exception -> 0x025a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x025a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x025a }
        L_0x014e:
            boolean r5 = r0.exists()     // Catch:{ Exception -> 0x025a }
            if (r5 != 0) goto L_0x0155
            goto L_0x0109
        L_0x0155:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x025a }
            java.lang.Object r11 = r14.getKey()     // Catch:{ Exception -> 0x025a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x025a }
            r5.<init>(r11)     // Catch:{ Exception -> 0x025a }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x025a }
            if (r11 < r15) goto L_0x01d2
            boolean r11 = android.os.Environment.isExternalStorageLegacy()     // Catch:{ Exception -> 0x025a }
            if (r11 == 0) goto L_0x0109
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ Exception -> 0x025a }
            r11.<init>()     // Catch:{ Exception -> 0x025a }
            java.lang.String r15 = "_display_name"
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x025a }
            r11.put(r15, r5)     // Catch:{ Exception -> 0x025a }
            f.c.p.b.c r5 = p159f.p166c.p231p.p233b.C4799c.f13592a     // Catch:{ Exception -> 0x025a }
            android.app.Application r15 = r12.f13569a     // Catch:{ Exception -> 0x025a }
            android.content.ContentResolver r15 = r15.getContentResolver()     // Catch:{ Exception -> 0x025a }
            java.lang.String r8 = "mApplication.contentResolver"
            p369i.p387z.p389d.C8594l.m46770d(r15, r8)     // Catch:{ Exception -> 0x025a }
            java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x025a }
            java.lang.String r8 = "videoPrivateFile.path"
            p369i.p387z.p389d.C8594l.m46770d(r0, r8)     // Catch:{ Exception -> 0x025a }
            java.lang.String r8 = android.os.Environment.DIRECTORY_MOVIES     // Catch:{ Exception -> 0x025a }
            java.lang.String r6 = "DIRECTORY_MOVIES"
            p369i.p387z.p389d.C8594l.m46770d(r8, r6)     // Catch:{ Exception -> 0x025a }
            android.net.Uri r0 = r5.mo15537b(r15, r0, r8, r11)     // Catch:{ Exception -> 0x025a }
            if (r0 != 0) goto L_0x019d
            goto L_0x0109
        L_0x019d:
            java.lang.Object r5 = r14.getValue()     // Catch:{ Exception -> 0x025a }
            r9.add(r5)     // Catch:{ Exception -> 0x025a }
            android.app.Application r5 = r12.f13569a     // Catch:{ Exception -> 0x025a }
            e.k.b.f r5 = p159f.p166c.p231p.p232a.C4792e.m20358b(r5)     // Catch:{ Exception -> 0x025a }
            f.c.p.a.d$n r6 = new f.c.p.a.d$n     // Catch:{ Exception -> 0x025a }
            r6.<init>(r9, r13)     // Catch:{ Exception -> 0x025a }
            r2.L$0 = r12     // Catch:{ Exception -> 0x025a }
            r2.L$1 = r7     // Catch:{ Exception -> 0x025a }
            r2.L$2 = r10     // Catch:{ Exception -> 0x025a }
            r2.L$3 = r9     // Catch:{ Exception -> 0x025a }
            r2.L$4 = r4     // Catch:{ Exception -> 0x025a }
            r2.L$5 = r0     // Catch:{ Exception -> 0x025a }
            r8 = 3
            r2.label = r8     // Catch:{ Exception -> 0x025a }
            java.lang.Object r5 = p082e.p126k.p129c.p130i.C3889g.m16603a(r5, r6, r2)     // Catch:{ Exception -> 0x025a }
            if (r5 != r3) goto L_0x01c5
            return r3
        L_0x01c5:
            r11 = r7
            r7 = r4
            r4 = r0
        L_0x01c8:
            r12.m20323M(r4)     // Catch:{ Exception -> 0x025a }
            r4 = r7
            r7 = r11
        L_0x01cd:
            r5 = 4
            r6 = 3
            r8 = 1
            goto L_0x00f1
        L_0x01d2:
            r8 = 3
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x025a }
            r6.<init>(r0)     // Catch:{ Exception -> 0x025a }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x025a }
            r0.<init>(r5)     // Catch:{ Exception -> 0x025a }
            f.c.p.b.c r11 = p159f.p166c.p231p.p233b.C4799c.f13592a     // Catch:{ Exception -> 0x025a }
            boolean r0 = r11.mo15538c(r6, r0)     // Catch:{ Exception -> 0x025a }
            if (r0 == 0) goto L_0x01cd
            android.app.Application r0 = r12.f13569a     // Catch:{ Exception -> 0x025a }
            r6 = 1
            java.lang.String[] r11 = new java.lang.String[r6]     // Catch:{ Exception -> 0x025a }
            java.lang.String r5 = r5.getPath()     // Catch:{ Exception -> 0x025a }
            r6 = 0
            r11[r6] = r5     // Catch:{ Exception -> 0x025a }
            java.lang.String r5 = "video/*"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch:{ Exception -> 0x025a }
            f.c.p.a.a r6 = new f.c.p.a.a     // Catch:{ Exception -> 0x025a }
            r6.<init>(r9, r14, r12)     // Catch:{ Exception -> 0x025a }
            android.media.MediaScannerConnection.scanFile(r0, r11, r5, r6)     // Catch:{ Exception -> 0x025a }
            goto L_0x01cd
        L_0x0200:
            int r0 = r9.size()     // Catch:{ Exception -> 0x025a }
            java.util.Collection r4 = r10.values()     // Catch:{ Exception -> 0x025a }
            int r4 = r4.size()     // Catch:{ Exception -> 0x025a }
            if (r0 != r4) goto L_0x025e
            i.z.d.r r0 = new i.z.d.r     // Catch:{ Exception -> 0x025a }
            r0.<init>()     // Catch:{ Exception -> 0x025a }
            r4 = 1
            r0.element = r4     // Catch:{ Exception -> 0x025a }
            java.util.Collection r4 = r10.values()     // Catch:{ Exception -> 0x025a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x025a }
        L_0x021e:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x025a }
            if (r5 == 0) goto L_0x0234
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x025a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x025a }
            boolean r5 = r9.contains(r5)     // Catch:{ Exception -> 0x025a }
            if (r5 != 0) goto L_0x021e
            r5 = 0
            r0.element = r5     // Catch:{ Exception -> 0x025a }
            goto L_0x021e
        L_0x0234:
            android.app.Application r4 = r12.f13569a     // Catch:{ Exception -> 0x025a }
            e.k.b.f r4 = p159f.p166c.p231p.p232a.C4792e.m20358b(r4)     // Catch:{ Exception -> 0x025a }
            f.c.p.a.d$p r5 = new f.c.p.a.d$p     // Catch:{ Exception -> 0x025a }
            r5.<init>(r0, r13)     // Catch:{ Exception -> 0x025a }
            r2.L$0 = r7     // Catch:{ Exception -> 0x025a }
            r2.L$1 = r13     // Catch:{ Exception -> 0x025a }
            r2.L$2 = r13     // Catch:{ Exception -> 0x025a }
            r2.L$3 = r13     // Catch:{ Exception -> 0x025a }
            r2.L$4 = r13     // Catch:{ Exception -> 0x025a }
            r2.L$5 = r13     // Catch:{ Exception -> 0x025a }
            r6 = 4
            r2.label = r6     // Catch:{ Exception -> 0x025a }
            java.lang.Object r0 = p082e.p126k.p129c.p130i.C3889g.m16603a(r4, r5, r2)     // Catch:{ Exception -> 0x025a }
            if (r0 != r3) goto L_0x0255
            return r3
        L_0x0255:
            r2 = r7
        L_0x0256:
            r2.delete()     // Catch:{ Exception -> 0x025a }
            goto L_0x025e
        L_0x025a:
            r0 = move-exception
            r0.printStackTrace()
        L_0x025e:
            i.t r0 = p369i.C8457t.f34900a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.m20318G(java.io.File, java.util.Map, i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m20319H(HashSet hashSet, Map.Entry entry, C4752d dVar, String str, Uri uri) {
        C8594l.m46771e(hashSet, "$restoreSet");
        C8594l.m46771e(entry, "$entry");
        C8594l.m46771e(dVar, "this$0");
        C8665a2 unused = C8875m.m47725b(C8906s0.m47808a(C8768g1.m47302b()), (C8513g) null, (C8910t0) null, new C4774o(hashSet, entry, dVar, uri, str, (C8508d<? super C4774o>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public final void m20320I() {
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47302b(), (C8910t0) null, new C4777q(this, (C8508d<? super C4777q>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m20321J(java.io.File r21, boolean r22, p369i.p379w.C8508d<? super p369i.C8457t> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof p159f.p166c.p231p.p232a.C4752d.C4784t
            if (r3 == 0) goto L_0x0019
            r3 = r2
            f.c.p.a.d$t r3 = (p159f.p166c.p231p.p232a.C4752d.C4784t) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001e
        L_0x0019:
            f.c.p.a.d$t r3 = new f.c.p.a.d$t
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = p369i.p379w.p380i.C8527d.m46722d()
            int r5 = r3.label
            java.lang.String r6 = "videoFileArray"
            r7 = 4
            r8 = 3
            r9 = 2
            r11 = 1
            if (r5 == 0) goto L_0x00ad
            if (r5 == r11) goto L_0x0092
            if (r5 == r9) goto L_0x0077
            if (r5 == r8) goto L_0x0047
            if (r5 != r7) goto L_0x003f
            java.lang.Object r1 = r3.L$0
            java.io.File r1 = (java.io.File) r1
            p369i.C8450m.m46575b(r2)
            goto L_0x02eb
        L_0x003f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0047:
            int r1 = r3.I$1
            int r5 = r3.I$0
            boolean r9 = r3.Z$0
            java.lang.Object r12 = r3.L$7
            android.net.Uri r12 = (android.net.Uri) r12
            java.lang.Object r13 = r3.L$6
            java.io.File[] r13 = (java.io.File[]) r13
            java.lang.Object r14 = r3.L$5
            java.util.HashSet r14 = (java.util.HashSet) r14
            java.lang.Object r15 = r3.L$4
            java.io.File[] r15 = (java.io.File[]) r15
            java.lang.Object r7 = r3.L$3
            i.z.d.t r7 = (p369i.p387z.p389d.C8602t) r7
            java.lang.Object r10 = r3.L$2
            i.z.d.t r10 = (p369i.p387z.p389d.C8602t) r10
            java.lang.Object r8 = r3.L$1
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r11 = r3.L$0
            f.c.p.a.d r11 = (p159f.p166c.p231p.p232a.C4752d) r11
            p369i.C8450m.m46575b(r2)
            r16 = r6
            r2 = r9
            r9 = r8
            r8 = 3
            goto L_0x0234
        L_0x0077:
            boolean r1 = r3.Z$0
            java.lang.Object r5 = r3.L$4
            java.io.File[] r5 = (java.io.File[]) r5
            java.lang.Object r7 = r3.L$3
            i.z.d.t r7 = (p369i.p387z.p389d.C8602t) r7
            java.lang.Object r8 = r3.L$2
            i.z.d.t r8 = (p369i.p387z.p389d.C8602t) r8
            java.lang.Object r9 = r3.L$1
            java.io.File r9 = (java.io.File) r9
            java.lang.Object r10 = r3.L$0
            f.c.p.a.d r10 = (p159f.p166c.p231p.p232a.C4752d) r10
            p369i.C8450m.m46575b(r2)
            goto L_0x0148
        L_0x0092:
            boolean r1 = r3.Z$0
            java.lang.Object r5 = r3.L$3
            i.z.d.t r5 = (p369i.p387z.p389d.C8602t) r5
            java.lang.Object r7 = r3.L$2
            i.z.d.t r7 = (p369i.p387z.p389d.C8602t) r7
            java.lang.Object r8 = r3.L$1
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r10 = r3.L$0
            f.c.p.a.d r10 = (p159f.p166c.p231p.p232a.C4752d) r10
            p369i.C8450m.m46575b(r2)
            r19 = r8
            r8 = r7
            r7 = r19
            goto L_0x0100
        L_0x00ad:
            p369i.C8450m.m46575b(r2)
            boolean r2 = r21.exists()
            if (r2 != 0) goto L_0x00b9
            i.t r1 = p369i.C8457t.f34900a
            return r1
        L_0x00b9:
            i.z.d.t r2 = new i.z.d.t
            r2.<init>()
            java.lang.String r5 = "private_restore_completed"
            r2.element = r5
            i.z.d.t r5 = new i.z.d.t
            r5.<init>()
            java.lang.String r7 = "private_restore_list"
            r5.element = r7
            if (r1 == 0) goto L_0x00d5
            java.lang.String r7 = "recycle_bin_restore_completed"
            r2.element = r7
            java.lang.String r7 = "recycle_bin_restore_list"
            r5.element = r7
        L_0x00d5:
            android.app.Application r7 = r0.f13569a
            e.k.b.f r7 = p159f.p166c.p231p.p232a.C4792e.m20358b(r7)
            kotlinx.coroutines.f3.b r7 = r7.mo13321b()
            f.c.p.a.d$r r8 = new f.c.p.a.d$r
            r8.<init>(r7, r2)
            r3.L$0 = r0
            r7 = r21
            r3.L$1 = r7
            r3.L$2 = r2
            r3.L$3 = r5
            r3.Z$0 = r1
            r10 = 1
            r3.label = r10
            java.lang.Object r8 = kotlinx.coroutines.p397f3.C8731d.m47259d(r8, r3)
            if (r8 != r4) goto L_0x00fa
            return r4
        L_0x00fa:
            r10 = r0
            r19 = r8
            r8 = r2
            r2 = r19
        L_0x0100:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x02ee
            f.c.p.a.d$x r2 = new f.c.p.a.d$x
            r2.<init>()
            java.io.File[] r2 = r7.listFiles(r2)
            if (r2 == 0) goto L_0x02ee
            int r11 = r2.length
            if (r11 != 0) goto L_0x0118
            r11 = 1
            goto L_0x0119
        L_0x0118:
            r11 = 0
        L_0x0119:
            r12 = 1
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x02ee
            android.app.Application r11 = r10.f13569a
            e.k.b.f r11 = p159f.p166c.p231p.p232a.C4792e.m20358b(r11)
            kotlinx.coroutines.f3.b r11 = r11.mo13321b()
            f.c.p.a.d$s r12 = new f.c.p.a.d$s
            r12.<init>(r11, r5)
            r3.L$0 = r10
            r3.L$1 = r7
            r3.L$2 = r8
            r3.L$3 = r5
            r3.L$4 = r2
            r3.Z$0 = r1
            r3.label = r9
            java.lang.Object r9 = kotlinx.coroutines.p397f3.C8731d.m47259d(r12, r3)
            if (r9 != r4) goto L_0x0141
            return r4
        L_0x0141:
            r19 = r5
            r5 = r2
            r2 = r9
            r9 = r7
            r7 = r19
        L_0x0148:
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r2)
            p369i.p387z.p389d.C8594l.m46770d(r5, r6)
            int r2 = r5.length
            r13 = r5
            r15 = r13
            r14 = r11
            r5 = 0
            r11 = r10
            r10 = r8
            r19 = r2
            r2 = r1
            r1 = r19
        L_0x015e:
            if (r5 >= r1) goto L_0x0296
            r12 = r13[r5]
            int r5 = r5 + 1
            boolean r16 = r12.exists()
            if (r16 != 0) goto L_0x0171
        L_0x016a:
            r21 = r2
            r16 = r6
            r6 = r1
            goto L_0x0290
        L_0x0171:
            java.lang.String r8 = r12.getPath()
            boolean r8 = r14.contains(r8)
            if (r8 == 0) goto L_0x017c
            goto L_0x016a
        L_0x017c:
            i.z.d.t r8 = new i.z.d.t
            r8.<init>()
            r8.element = r12
            java.lang.String r0 = "videoFile.path"
            if (r2 != 0) goto L_0x01b2
            r16 = r6
            java.lang.String r6 = r12.getPath()
            p369i.p387z.p389d.C8594l.m46770d(r6, r0)
            r22 = r4
            java.lang.String r4 = "_"
            r17 = r1
            java.lang.String r1 = ""
            java.lang.String r1 = p369i.p376f0.C8437p.m46561j0(r6, r4, r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x01aa
            r4 = r22
            r21 = r2
            r6 = r17
            goto L_0x0290
        L_0x01aa:
            java.io.File r4 = new java.io.File
            r4.<init>(r1)
            r8.element = r4
            goto L_0x01b8
        L_0x01b2:
            r17 = r1
            r22 = r4
            r16 = r6
        L_0x01b8:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r1 < r4) goto L_0x024b
            boolean r1 = android.os.Environment.isExternalStorageLegacy()
            if (r1 == 0) goto L_0x0244
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>()
            T r4 = r8.element
            java.io.File r4 = (java.io.File) r4
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "_display_name"
            r1.put(r6, r4)
            f.c.p.b.c r4 = p159f.p166c.p231p.p233b.C4799c.f13592a
            android.app.Application r6 = r11.f13569a
            android.content.ContentResolver r6 = r6.getContentResolver()
            java.lang.String r8 = "mApplication.contentResolver"
            p369i.p387z.p389d.C8594l.m46770d(r6, r8)
            java.lang.String r8 = r12.getPath()
            p369i.p387z.p389d.C8594l.m46770d(r8, r0)
            java.lang.String r0 = android.os.Environment.DIRECTORY_MOVIES
            r18 = r5
            java.lang.String r5 = "DIRECTORY_MOVIES"
            p369i.p387z.p389d.C8594l.m46770d(r0, r5)
            android.net.Uri r0 = r4.mo15537b(r6, r8, r0, r1)
            if (r0 == 0) goto L_0x023d
            java.lang.String r1 = r12.getPath()
            r14.add(r1)
            android.app.Application r1 = r11.f13569a
            e.k.b.f r1 = p159f.p166c.p231p.p232a.C4792e.m20358b(r1)
            f.c.p.a.d$u r4 = new f.c.p.a.d$u
            r5 = 0
            r4.<init>(r7, r14, r5)
            r3.L$0 = r11
            r3.L$1 = r9
            r3.L$2 = r10
            r3.L$3 = r7
            r3.L$4 = r15
            r3.L$5 = r14
            r3.L$6 = r13
            r3.L$7 = r0
            r3.Z$0 = r2
            r5 = r18
            r3.I$0 = r5
            r6 = r17
            r3.I$1 = r6
            r8 = 3
            r3.label = r8
            java.lang.Object r1 = p082e.p126k.p129c.p130i.C3889g.m16603a(r1, r4, r3)
            r4 = r22
            if (r1 != r4) goto L_0x0232
            return r4
        L_0x0232:
            r12 = r0
            r1 = r6
        L_0x0234:
            r11.m20323M(r12)
            r0 = r20
        L_0x0239:
            r6 = r16
            goto L_0x015e
        L_0x023d:
            r4 = r22
            r6 = r17
            r5 = r18
            goto L_0x0248
        L_0x0244:
            r4 = r22
            r6 = r17
        L_0x0248:
            r21 = r2
            goto L_0x0290
        L_0x024b:
            r4 = r22
            r6 = r17
            r0 = 3
            java.lang.String r1 = "videoFile"
            p369i.p387z.p389d.C8594l.m46770d(r12, r1)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r12)
            T r0 = r8.element
            r21 = r2
            java.lang.String r2 = "restoreVideoFile"
            p369i.p387z.p389d.C8594l.m46770d(r0, r2)
            java.io.File r0 = (java.io.File) r0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            f.c.p.b.c r0 = p159f.p166c.p231p.p233b.C4799c.f13592a
            boolean r0 = r0.mo15538c(r1, r2)
            if (r0 == 0) goto L_0x0290
            android.app.Application r0 = r11.f13569a
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            T r1 = r8.element
            java.io.File r1 = (java.io.File) r1
            java.lang.String r1 = r1.getPath()
            r8 = 0
            r2[r8] = r1
            java.lang.String r1 = "video/*"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            f.c.p.a.b r8 = new f.c.p.a.b
            r8.<init>(r14, r12, r11)
            android.media.MediaScannerConnection.scanFile(r0, r2, r1, r8)
        L_0x0290:
            r0 = r20
            r2 = r21
            r1 = r6
            goto L_0x0239
        L_0x0296:
            r16 = r6
            int r0 = r14.size()
            int r1 = r15.length
            if (r0 != r1) goto L_0x02ee
            i.z.d.r r0 = new i.z.d.r
            r0.<init>()
            r1 = 1
            r0.element = r1
            r1 = r16
            p369i.p387z.p389d.C8594l.m46770d(r15, r1)
            int r1 = r15.length
            r8 = 0
        L_0x02ae:
            if (r8 >= r1) goto L_0x02c4
            r2 = r15[r8]
            java.lang.String r2 = r2.getPath()
            boolean r2 = r14.contains(r2)
            if (r2 != 0) goto L_0x02c0
            r2 = 0
            r0.element = r2
            goto L_0x02c1
        L_0x02c0:
            r2 = 0
        L_0x02c1:
            int r8 = r8 + 1
            goto L_0x02ae
        L_0x02c4:
            android.app.Application r1 = r11.f13569a
            e.k.b.f r1 = p159f.p166c.p231p.p232a.C4792e.m20358b(r1)
            f.c.p.a.d$w r2 = new f.c.p.a.d$w
            r5 = 0
            r2.<init>(r10, r0, r5)
            r3.L$0 = r9
            r3.L$1 = r5
            r3.L$2 = r5
            r3.L$3 = r5
            r3.L$4 = r5
            r3.L$5 = r5
            r3.L$6 = r5
            r3.L$7 = r5
            r0 = 4
            r3.label = r0
            java.lang.Object r0 = p082e.p126k.p129c.p130i.C3889g.m16603a(r1, r2, r3)
            if (r0 != r4) goto L_0x02ea
            return r4
        L_0x02ea:
            r1 = r9
        L_0x02eb:
            r1.delete()
        L_0x02ee:
            i.t r0 = p369i.C8457t.f34900a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p231p.p232a.C4752d.m20321J(java.io.File, boolean, i.w.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final void m20322K(HashSet hashSet, File file, C4752d dVar, String str, Uri uri) {
        C8594l.m46771e(hashSet, "$restoreSet");
        C8594l.m46771e(dVar, "this$0");
        C8665a2 unused = C8875m.m47725b(C8906s0.m47808a(C8768g1.m47302b()), (C8513g) null, (C8910t0) null, new C4786v(hashSet, file, dVar, uri, str, (C8508d<? super C4786v>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m20323M(Uri uri) {
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47302b(), (C8910t0) null, new C4791z(this, uri, (C8508d<? super C4791z>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m20335o(Video video) {
        C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, this.f13571c, (C8910t0) null, new C4760e(video, this, (C8508d<? super C4760e>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final boolean m20336w(String str) {
        String[] strArr = this.f13572d;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            if (TextUtils.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    public final void mo15476B(List<Video> list) {
        C8594l.m46771e(list, "videoList");
        if (!list.isEmpty()) {
            C8665a2 unused = C8875m.m47725b(C8912t1.f35302g, C8768g1.m47302b(), (C8910t0) null, new C4762g(list, this, (C8508d<? super C4762g>) null), 2, (Object) null);
        }
    }

    /* renamed from: C */
    public final LiveData<Exception> mo15477C(Video video, String str) {
        C8594l.m46771e(video, "video");
        C8594l.m46771e(str, "title");
        return C0671f.m4212b(C8768g1.m47302b(), 0, new C4763h(str, video, this, (C8508d<? super C4763h>) null), 2, (Object) null);
    }

    /* renamed from: L */
    public final LiveData<Exception> mo15478L() {
        return C0671f.m4212b(C8768g1.m47302b(), 0, new C4790y(this, (C8508d<? super C4790y>) null), 2, (Object) null);
    }

    /* renamed from: N */
    public final LiveData<List<Video>> mo15479N(String str, String str2, boolean z, boolean z2) {
        C8594l.m46771e(str, "query");
        C8594l.m46771e(str2, "order");
        String str3 = z ? "ASC" : "DESC";
        String str4 = z2 ? "1" : "0";
        return this.f13570b.mo10390F().mo10411l(new C4213a("SELECT * FROM video WHERE title LIKE " + DatabaseUtils.sqlEscapeString('%' + str + '%') + " and is_private_video = " + str4 + " ORDER BY " + str2 + ' ' + str3));
    }

    /* renamed from: O */
    public final void mo15480O(Video video, Uri uri) {
        C8594l.m46771e(video, "video");
        if (uri != null) {
            mo15476B(C8482l.m46668i(video));
            m20323M(uri);
        }
    }

    /* renamed from: P */
    public final void mo15481P(List<Video> list, String str) {
        C8594l.m46771e(list, "videoList");
        C8594l.m46771e(str, "path");
        if (!list.isEmpty()) {
            C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new C4755a0(list, str, this, (C8508d<? super C4755a0>) null), 2, (Object) null);
        }
    }

    /* renamed from: Q */
    public final void mo15482Q(long j, String str, String str2, String str3) {
        C8594l.m46771e(str, "title");
        C8594l.m46771e(str2, "displayName");
        String str4 = str3;
        C8594l.m46771e(str4, "path");
        C8665a2 unused = C8875m.m47725b(C8906s0.m47809b(), C8768g1.m47302b(), (C8910t0) null, new C4757b0(this, j, str, str2, str4, (C8508d<? super C4757b0>) null), 2, (Object) null);
    }

    /* renamed from: l */
    public final LiveData<Object> mo15483l(List<? extends Video> list) {
        C8594l.m46771e(list, "videoList");
        return C0671f.m4212b(C8768g1.m47302b(), 0, new C4756b(list, this, (C8508d<? super C4756b>) null), 2, (Object) null);
    }

    /* renamed from: m */
    public final LiveData<Object> mo15484m(List<String> list) {
        C8594l.m46771e(list, "folderPathList");
        return C0671f.m4212b(C8768g1.m47302b(), 0, new C4758c(list, this, (C8508d<? super C4758c>) null), 2, (Object) null);
    }

    /* renamed from: n */
    public final LiveData<Object> mo15485n(List<? extends Video> list, String str) {
        C8594l.m46771e(list, "videos");
        C8594l.m46771e(str, "path");
        return C0671f.m4212b(C8768g1.m47302b(), 0, new C4759d(list, this, str, (C8508d<? super C4759d>) null), 2, (Object) null);
    }

    /* renamed from: p */
    public final LiveData<List<Video>> mo15486p(String str, boolean z, boolean z2) {
        C8594l.m46771e(str, "order");
        String str2 = z ? "ASC" : "DESC";
        String str3 = z2 ? "1" : "0";
        return this.f13570b.mo10390F().mo10401b(new C4213a("SELECT * FROM video WHERE is_private_video = " + str3 + " ORDER BY " + str + ' ' + str2));
    }

    /* renamed from: q */
    public final LiveData<List<Video>> mo15487q(String str, boolean z, String str2, boolean z2, boolean z3) {
        C8594l.m46771e(str, "folderOrder");
        C8594l.m46771e(str2, "videoOrder");
        String str3 = "ASC";
        String str4 = z ? str3 : "DESC";
        if (z2) {
            str3 = "DESC";
        }
        String str5 = z3 ? "1" : "0";
        return this.f13570b.mo10390F().mo10405f(new C4213a("SELECT folder_path, folder_name, thumbnail, date_modified, COUNT(*) AS video_count, SUM(recent_added) AS video_recent_added_count FROM (SELECT * FROM video WHERE is_private_video = " + str5 + " ORDER BY " + str2 + ' ' + str3 + ") GROUP BY folder_path ORDER BY " + str + ' ' + str4));
    }

    /* renamed from: r */
    public final Video mo15488r(boolean z) {
        return this.f13570b.mo10390F().mo10406g(z ? 1 : 0);
    }

    /* renamed from: s */
    public final LiveData<Video> mo15489s(Uri uri) {
        C8594l.m46771e(uri, "uri");
        C2799c F = this.f13570b.mo10390F();
        String uri2 = uri.toString();
        C8594l.m46770d(uri2, "uri.toString()");
        return F.mo10415p(uri2);
    }

    /* renamed from: t */
    public final LiveData<Video> mo15490t(long j) {
        return this.f13570b.mo10390F().mo10412m(j);
    }

    /* renamed from: u */
    public final LiveData<List<Video>> mo15491u(List<String> list) {
        C8594l.m46771e(list, "folderPathList");
        return C0671f.m4212b(C8768g1.m47302b(), 0, new C4761f(list, this, (C8508d<? super C4761f>) null), 2, (Object) null);
    }

    /* renamed from: v */
    public final LiveData<List<Video>> mo15492v(String str, String str2, boolean z, boolean z2) {
        C8594l.m46771e(str, "folderPath");
        C8594l.m46771e(str2, "order");
        String str3 = z ? "ASC" : "DESC";
        String str4 = z2 ? "1" : "0";
        return this.f13570b.mo10390F().mo10417r(new C4213a("SELECT * FROM video WHERE folder_path = " + DatabaseUtils.sqlEscapeString(str) + " and is_private_video = " + str4 + " ORDER BY " + str2 + ' ' + str3));
    }
}
