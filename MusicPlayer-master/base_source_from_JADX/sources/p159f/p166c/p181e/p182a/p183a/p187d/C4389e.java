package p159f.p166c.p181e.p182a.p183a.p187d;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.RecoverableSecurityException;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.coocent.video.videoplayercore.service.AudioPlayService;
import java.util.HashMap;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p184a.C4363c;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8602t;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.d.e */
/* compiled from: MusicInfoKit.kt */
public final class C4389e {

    /* renamed from: a */
    private static final Uri f12976a = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: b */
    private static HashMap<Long, Boolean> f12977b;

    /* renamed from: c */
    private static final ContentValues f12978c;

    /* renamed from: d */
    private static final ContentValues f12979d;

    /* renamed from: e */
    private static C4391b f12980e;

    /* renamed from: f */
    public static final C4389e f12981f = new C4389e();

    /* renamed from: f.c.e.a.a.d.e$a */
    /* compiled from: MusicInfoKit.kt */
    public interface C4390a {
        /* renamed from: a */
        void mo14950a(long j, String str, String str2, String str3);
    }

    /* renamed from: f.c.e.a.a.d.e$b */
    /* compiled from: MusicInfoKit.kt */
    public interface C4391b {
        /* renamed from: a */
        void mo14951a(Intent intent);

        /* renamed from: b */
        void mo14952b();
    }

    /* renamed from: f.c.e.a.a.d.e$c */
    /* compiled from: MusicInfoKit.kt */
    public static final class C4392c implements C4391b {

        /* renamed from: a */
        final /* synthetic */ ContentValues f12982a;

        /* renamed from: b */
        final /* synthetic */ C8602t f12983b;

        /* renamed from: c */
        final /* synthetic */ long f12984c;

        /* renamed from: d */
        final /* synthetic */ String f12985d;

        /* renamed from: e */
        final /* synthetic */ C4363c f12986e;

        /* renamed from: f */
        final /* synthetic */ C4390a f12987f;

        /* renamed from: g */
        final /* synthetic */ Object f12988g;

        C4392c(ContentValues contentValues, C8602t tVar, long j, String str, C4363c cVar, C4390a aVar, int i, Object obj) {
            this.f12982a = contentValues;
            this.f12983b = tVar;
            this.f12984c = j;
            this.f12985d = str;
            this.f12986e = cVar;
            this.f12987f = aVar;
            this.f12988g = obj;
        }

        /* renamed from: a */
        public void mo14951a(Intent intent) {
            try {
                C4389e.m19278k((Context) this.f12983b.element, this.f12984c, this.f12985d, this.f12982a, this.f12986e, 1);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        /* renamed from: b */
        public void mo14952b() {
        }
    }

    /* renamed from: f.c.e.a.a.d.e$d */
    /* compiled from: MusicInfoKit.kt */
    public static final class C4393d implements C4390a {

        /* renamed from: a */
        final /* synthetic */ Object f12989a;

        /* renamed from: b */
        final /* synthetic */ long f12990b;

        /* renamed from: c */
        final /* synthetic */ C8602t f12991c;

        C4393d(Object obj, long j, String str, ContentValues contentValues, C4363c cVar, C8602t tVar, int i) {
            this.f12989a = obj;
            this.f12990b = j;
            this.f12991c = tVar;
        }

        /* renamed from: a */
        public void mo14950a(long j, String str, String str2, String str3) {
            C4441e.m19454n((Context) this.f12991c.element).mo15105I(this.f12990b, str, str2, str3);
            C4441e n = C4441e.m19454n((Context) this.f12991c.element);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String p = n.mo15122p();
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(',');
            String sb2 = sb.toString();
            boolean z = false;
            if (!TextUtils.isEmpty(p)) {
                C8594l.m46770d(p, "modifyAllIds");
                Object[] array = C8437p.m46547V(p, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                String valueOf = String.valueOf(j);
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (C8594l.m46767a(strArr[i], valueOf)) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(p);
                if (z) {
                    sb2 = BuildConfig.FLAVOR;
                }
                sb3.append(sb2);
                sb2 = sb3.toString();
            }
            if (!z) {
                C4441e n2 = C4441e.m19454n((Context) this.f12991c.element);
                C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
                n2.mo15104H(sb2);
            }
        }
    }

    static {
        ContentValues contentValues = new ContentValues();
        f12978c = contentValues;
        ContentValues contentValues2 = new ContentValues();
        f12979d = contentValues2;
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", 1);
            contentValues2.put("is_pending", 0);
        }
    }

    private C4389e() {
    }

    /* renamed from: b */
    public static final String[] m19271b(Context context, long j) {
        C8594l.m46771e(context, "context");
        if (!m19272d(j)) {
            return null;
        }
        String q = C4441e.m19454n(context).mo15123q(j);
        if (TextUtils.isEmpty(q)) {
            return null;
        }
        C8594l.m46770d(q, "musicLocalInfo");
        Object[] array = C8437p.m46547V(q, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        String[] strArr = (String[]) array;
        if (strArr.length < 3) {
            return null;
        }
        return strArr;
    }

    /* renamed from: d */
    public static final boolean m19272d(long j) {
        if (f12977b == null) {
            f12977b = new HashMap<>();
        }
        HashMap<Long, Boolean> hashMap = f12977b;
        C8594l.m46769c(hashMap);
        return hashMap.get(Long.valueOf(j)) != null;
    }

    /* renamed from: e */
    public static final boolean m19273e(Context context) {
        C8594l.m46771e(context, "context");
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m19274f(Object obj, long j, String str, ContentValues contentValues, C4363c cVar, C4390a aVar, int i) {
        Object obj2 = obj;
        String str2 = str;
        ContentValues contentValues2 = contentValues;
        C8594l.m46771e(obj2, "any");
        C8594l.m46771e(str2, "oldTitle");
        C8594l.m46771e(cVar, "changeMusicInfoListener");
        C8594l.m46771e(aVar, "recordCallback");
        C8602t tVar = new C8602t();
        tVar.element = null;
        if (obj2 instanceof Activity) {
            tVar.element = ((Activity) obj2).getApplicationContext();
        } else if (obj2 instanceof Fragment) {
            tVar.element = ((Fragment) obj2).mo3708v2();
        } else if (obj2 instanceof Context) {
            tVar.element = ((Context) obj2).getApplicationContext();
        }
        T t = tVar.element;
        if (((Context) t) == null || contentValues2 == null || !m19273e((Context) t)) {
            return false;
        }
        Uri withAppendedId = ContentUris.withAppendedId(f12976a, j);
        C8594l.m46770d(withAppendedId, "ContentUris.withAppended…(BASE_AUDIO_URI, audioId)");
        ContentResolver contentResolver = ((Context) tVar.element).getContentResolver();
        if (contentResolver != null) {
            try {
                return m19279l((Context) tVar.element, j, str, contentValues, cVar, aVar, withAppendedId, contentResolver);
            } catch (RecoverableSecurityException e) {
                if (i == 0) {
                    f12980e = new C4392c(contentValues, tVar, j, str, cVar, aVar, i, obj);
                    try {
                        if (obj2 instanceof Activity) {
                            RemoteAction userAction = e.getUserAction();
                            C8594l.m46770d(userAction, "rse.userAction");
                            PendingIntent actionIntent = userAction.getActionIntent();
                            C8594l.m46770d(actionIntent, "rse.userAction.actionIntent");
                            ((Activity) obj2).startIntentSenderForResult(actionIntent.getIntentSender(), 1023, (Intent) null, 0, 0, 0);
                        } else if (obj2 instanceof Fragment) {
                            RemoteAction userAction2 = e.getUserAction();
                            C8594l.m46770d(userAction2, "rse.userAction");
                            PendingIntent actionIntent2 = userAction2.getActionIntent();
                            C8594l.m46770d(actionIntent2, "rse.userAction.actionIntent");
                            ((Fragment) obj2).mo3641V2(actionIntent2.getIntentSender(), 1023, (Intent) null, 0, 0, 0, (Bundle) null);
                        }
                    } catch (IntentSender.SendIntentException e2) {
                        e2.printStackTrace();
                    }
                }
            } catch (IllegalArgumentException unused) {
                String asString = contentValues2.getAsString("title");
                String asString2 = contentValues2.getAsString("album");
                String asString3 = contentValues2.getAsString("artist");
                m19275g(j, asString, asString2, asString3, aVar);
                f12981f.m19276h(str2, asString);
                cVar.mo14801a(true, j, asString, asString2, asString3);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final void m19275g(long j, String str, String str2, String str3, C4390a aVar) {
        C8594l.m46771e(aVar, "recordModifyByFile");
        if (f12977b == null) {
            f12977b = new HashMap<>();
        }
        HashMap<Long, Boolean> hashMap = f12977b;
        C8594l.m46769c(hashMap);
        if (hashMap.get(Long.valueOf(j)) == null) {
            HashMap<Long, Boolean> hashMap2 = f12977b;
            C8594l.m46769c(hashMap2);
            hashMap2.put(Long.valueOf(j), Boolean.TRUE);
        }
        aVar.mo14950a(j, str, str2, str3);
    }

    /* renamed from: h */
    private final void m19276h(String str, String str2) {
        if (str2 != null) {
            boolean e = C4378c.f12969c.mo14935e(str, str2);
            Log.e(AudioPlayService.KEY_RENAME, "renameResult:" + e);
        }
    }

    /* renamed from: i */
    public static final void m19277i(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 29 && strArr != null) {
            if (!(strArr.length == 0)) {
                if (f12977b == null) {
                    f12977b = new HashMap<>();
                }
                for (String str : strArr) {
                    if (str.length() > 0) {
                        long parseLong = Long.parseLong(str);
                        HashMap<Long, Boolean> hashMap = f12977b;
                        C8594l.m46769c(hashMap);
                        if (hashMap.get(Long.valueOf(parseLong)) == null) {
                            HashMap<Long, Boolean> hashMap2 = f12977b;
                            C8594l.m46769c(hashMap2);
                            hashMap2.put(Long.valueOf(parseLong), Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static final void m19278k(Object obj, long j, String str, ContentValues contentValues, C4363c cVar, int i) {
        Object obj2 = obj;
        C8594l.m46771e(obj, "any");
        C8594l.m46771e(str, "oldTitle");
        C8594l.m46771e(cVar, "changeMusicInfoListener");
        C8602t tVar = new C8602t();
        tVar.element = null;
        if (obj2 instanceof Activity) {
            tVar.element = ((Activity) obj2).getApplicationContext();
        } else if (obj2 instanceof Fragment) {
            tVar.element = ((Fragment) obj2).mo3708v2();
        } else if (obj2 instanceof Context) {
            tVar.element = ((Context) obj2).getApplicationContext();
        }
        if (((Context) tVar.element) != null) {
            m19274f(obj, j, str, contentValues, cVar, new C4393d(obj, j, str, contentValues, cVar, tVar, i), i);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r2.put("is_pending", 1);
        r3 = r4.update(r3, r2, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        r3 = r4.update(r3, f12979d, (java.lang.String) null, (java.lang.String[]) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x004d */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m19279l(android.content.Context r16, long r17, java.lang.String r19, android.content.ContentValues r20, p159f.p166c.p181e.p182a.p183a.p184a.C4363c r21, p159f.p166c.p181e.p182a.p183a.p187d.C4389e.C4390a r22, android.net.Uri r23, android.content.ContentResolver r24) {
        /*
            r0 = r16
            r1 = r19
            r2 = r20
            r3 = r23
            r4 = r24
            java.lang.String r5 = "context"
            p369i.p387z.p389d.C8594l.m46771e(r0, r5)
            java.lang.String r5 = "oldTitle"
            p369i.p387z.p389d.C8594l.m46771e(r1, r5)
            java.lang.String r5 = "newContentValues"
            p369i.p387z.p389d.C8594l.m46771e(r2, r5)
            java.lang.String r5 = "changeMusicInfoListener"
            r6 = r21
            p369i.p387z.p389d.C8594l.m46771e(r6, r5)
            java.lang.String r5 = "recordCallback"
            r12 = r22
            p369i.p387z.p389d.C8594l.m46771e(r12, r5)
            java.lang.String r5 = "contentResolver"
            p369i.p387z.p389d.C8594l.m46771e(r4, r5)
            r5 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = "is_pending"
            r2.put(r8, r7)
            p369i.p387z.p389d.C8594l.m46769c(r23)
            r9 = 0
            int r10 = r4.update(r3, r2, r9, r9)
            r13 = 0
            if (r10 < r5) goto L_0x00cc
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            r2.put(r8, r10)
            int r3 = r4.update(r3, r2, r9, r9)     // Catch:{ all -> 0x004d }
            goto L_0x005b
        L_0x004d:
            r2.put(r8, r7)     // Catch:{ all -> 0x0055 }
            int r3 = r4.update(r3, r2, r9, r9)     // Catch:{ all -> 0x0055 }
            goto L_0x005b
        L_0x0055:
            android.content.ContentValues r7 = f12979d
            int r3 = r4.update(r3, r7, r9, r9)
        L_0x005b:
            if (r3 < r5) goto L_0x00dd
            java.lang.String r3 = "title"
            java.lang.String r3 = r2.getAsString(r3)
            java.lang.String r4 = "album"
            java.lang.String r4 = r2.getAsString(r4)
            java.lang.String r7 = "artist"
            java.lang.String r2 = r2.getAsString(r7)
            boolean r7 = m19272d(r17)
            if (r7 != 0) goto L_0x00af
            f.c.e.a.a.e.k r7 = p159f.p166c.p181e.p182a.p183a.p188e.C4423k.f13002a
            r14 = r17
            com.coocent.music.base.data.entity.Music r0 = r7.mo14992g(r0, r14)
            if (r3 == 0) goto L_0x008a
            java.lang.String r7 = r0.mo9218n()
            boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r3, r7)
            r7 = r7 ^ r5
            if (r7 != 0) goto L_0x00a4
        L_0x008a:
            if (r4 == 0) goto L_0x0097
            java.lang.String r7 = r0.mo9207e()
            boolean r7 = p369i.p387z.p389d.C8594l.m46767a(r4, r7)
            r7 = r7 ^ r5
            if (r7 != 0) goto L_0x00a4
        L_0x0097:
            if (r2 == 0) goto L_0x00bb
            java.lang.String r0 = r0.mo9210g()
            boolean r0 = p369i.p387z.p389d.C8594l.m46767a(r2, r0)
            r0 = r0 ^ r5
            if (r0 == 0) goto L_0x00bb
        L_0x00a4:
            r7 = r17
            r9 = r3
            r10 = r4
            r11 = r2
            r12 = r22
            m19275g(r7, r9, r10, r11, r12)
            goto L_0x00bb
        L_0x00af:
            r14 = r17
            r7 = r17
            r9 = r3
            r10 = r4
            r11 = r2
            r12 = r22
            m19275g(r7, r9, r10, r11, r12)
        L_0x00bb:
            f.c.e.a.a.d.e r0 = f12981f
            r0.m19276h(r1, r3)
            r7 = 1
            r6 = r21
            r8 = r17
            r10 = r3
            r11 = r4
            r12 = r2
            r6.mo14801a(r7, r8, r10, r11, r12)
            goto L_0x00dd
        L_0x00cc:
            r14 = r17
            r7 = 0
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            r6 = r21
            r8 = r17
            r6.mo14801a(r7, r8, r10, r11, r12)
            r5 = 0
        L_0x00dd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p187d.C4389e.m19279l(android.content.Context, long, java.lang.String, android.content.ContentValues, f.c.e.a.a.a.c, f.c.e.a.a.d.e$a, android.net.Uri, android.content.ContentResolver):boolean");
    }

    /* renamed from: a */
    public final void mo14947a(Context context, long j) {
        C8594l.m46771e(context, "context");
        if (m19272d(j)) {
            C4441e.m19454n(context).mo15127u(j);
            C4441e n = C4441e.m19454n(context);
            C8594l.m46770d(n, "MusicPreference.getInstance(context)");
            String p = n.mo15122p();
            Objects.requireNonNull(p, "null cannot be cast to non-null type kotlin.String");
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(',');
            String sb2 = sb.toString();
            boolean z = false;
            if (!TextUtils.isEmpty(p)) {
                Object[] array = C8437p.m46547V(p, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String valueOf = String.valueOf(j);
                String str = p;
                for (String a : (String[]) array) {
                    if (C8594l.m46767a(a, valueOf)) {
                        str = C8436o.m46523q(str, sb2, BuildConfig.FLAVOR, false, 4, (Object) null);
                        z = true;
                    }
                }
                p = str;
            }
            if (z) {
                C4441e n2 = C4441e.m19454n(context);
                C8594l.m46770d(n2, "MusicPreference.getInstance(context)");
                n2.mo15104H(p);
            }
        }
    }

    /* renamed from: c */
    public final C4391b mo14948c() {
        return f12980e;
    }

    /* renamed from: j */
    public final void mo14949j(C4391b bVar) {
        f12980e = bVar;
    }
}
