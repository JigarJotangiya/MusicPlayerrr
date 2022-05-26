package p159f.p166c.p181e.p182a.p183a.p188e;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.coocent.music.base.data.entity.Music;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p159f.p166c.p181e.p182a.p183a.p187d.C4377b;
import p159f.p166c.p181e.p182a.p183a.p189f.C4433b;
import p159f.p166c.p181e.p182a.p183a.p189f.C4441e;
import p369i.C8446k;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.c.e.a.a.e.k */
/* compiled from: MusicLoader.kt */
public final class C4423k {

    /* renamed from: a */
    public static final C4423k f13002a = new C4423k();

    /* renamed from: f.c.e.a.a.e.k$a */
    /* compiled from: MusicLoader.kt */
    static final class C4424a extends C8595m implements C8570l<Music, Boolean> {
        final /* synthetic */ boolean $includeAlbumAndArtist;
        final /* synthetic */ String $name;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4424a(boolean z, String str) {
            super(1);
            this.$includeAlbumAndArtist = z;
            this.$name = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Music) obj));
        }

        public final boolean invoke(Music music) {
            C8594l.m46771e(music, "it");
            if (this.$includeAlbumAndArtist) {
                String n = music.mo9218n();
                Locale locale = Locale.getDefault();
                C8594l.m46770d(locale, "Locale\n                        .getDefault()");
                Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = n.toLowerCase(locale);
                C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                String str = this.$name;
                Locale locale2 = Locale.getDefault();
                C8594l.m46770d(locale2, "Locale.getDefault()");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String lowerCase2 = str.toLowerCase(locale2);
                C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                if (!C8437p.m46566v(lowerCase, lowerCase2, false, 2, (Object) null)) {
                    String g = music.mo9210g();
                    Locale locale3 = Locale.getDefault();
                    C8594l.m46770d(locale3, "Locale.getDefault()");
                    Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase3 = g.toLowerCase(locale3);
                    C8594l.m46770d(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
                    String str2 = this.$name;
                    Locale locale4 = Locale.getDefault();
                    C8594l.m46770d(locale4, "Locale.getDefault()");
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                    String lowerCase4 = str2.toLowerCase(locale4);
                    C8594l.m46770d(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C8437p.m46566v(lowerCase3, lowerCase4, false, 2, (Object) null)) {
                        String e = music.mo9207e();
                        Locale locale5 = Locale.getDefault();
                        C8594l.m46770d(locale5, "Locale.getDefault()");
                        Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase5 = e.toLowerCase(locale5);
                        C8594l.m46770d(lowerCase5, "(this as java.lang.String).toLowerCase(locale)");
                        String str3 = this.$name;
                        Locale locale6 = Locale.getDefault();
                        C8594l.m46770d(locale6, "Locale.getDefault()");
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase6 = str3.toLowerCase(locale6);
                        C8594l.m46770d(lowerCase6, "(this as java.lang.String).toLowerCase(locale)");
                        if (C8437p.m46566v(lowerCase5, lowerCase6, false, 2, (Object) null)) {
                            return true;
                        }
                        return false;
                    }
                }
                return true;
            }
            String n2 = music.mo9218n();
            Locale locale7 = Locale.getDefault();
            C8594l.m46770d(locale7, "Locale\n                        .getDefault()");
            Objects.requireNonNull(n2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase7 = n2.toLowerCase(locale7);
            C8594l.m46770d(lowerCase7, "(this as java.lang.String).toLowerCase(locale)");
            String str4 = this.$name;
            Locale locale8 = Locale.getDefault();
            C8594l.m46770d(locale8, "Locale.getDefault()");
            Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
            String lowerCase8 = str4.toLowerCase(locale8);
            C8594l.m46770d(lowerCase8, "(this as java.lang.String).toLowerCase(locale)");
            return C8437p.m46566v(lowerCase7, lowerCase8, false, 2, (Object) null);
        }
    }

    /* renamed from: f.c.e.a.a.e.k$b */
    /* compiled from: Comparisons.kt */
    public static final class C4425b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String n = ((Music) t).mo9218n();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = n.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String n2 = ((Music) t2).mo9218n();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(n2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = n2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.k$c */
    /* compiled from: Comparisons.kt */
    public static final class C4426c<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String g = ((Music) t).mo9210g();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = g.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String g2 = ((Music) t2).mo9210g();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(g2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = g2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.k$d */
    /* compiled from: Comparisons.kt */
    public static final class C4427d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String e = ((Music) t).mo9207e();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(e, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = e.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String e2 = ((Music) t2).mo9207e();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(e2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = e2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    /* renamed from: f.c.e.a.a.e.k$e */
    /* compiled from: Comparisons.kt */
    public static final class C4428e<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            String n = ((Music) t2).mo9218n();
            Locale locale = Locale.getDefault();
            C8594l.m46770d(locale, "Locale.getDefault()");
            Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = n.toLowerCase(locale);
            C8594l.m46770d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String a = C4433b.m19363a(lowerCase);
            String n2 = ((Music) t).mo9218n();
            Locale locale2 = Locale.getDefault();
            C8594l.m46770d(locale2, "Locale.getDefault()");
            Objects.requireNonNull(n2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = n2.toLowerCase(locale2);
            C8594l.m46770d(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            return C8498b.m46698a(a, C4433b.m19363a(lowerCase2));
        }
    }

    private C4423k() {
    }

    /* renamed from: A */
    private final List<Music> m19324A(long[] jArr, List<Music> list) {
        T t;
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (long j : jArr) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((Music) t).mo9215k() == j) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            Music music = (Music) t;
            if (music != null) {
                arrayList.add(music);
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    private final long[] m19325B(long[] jArr, long[] jArr2) {
        Long l;
        ArrayList arrayList = new ArrayList();
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            long j = jArr[i];
            int length2 = jArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    l = null;
                    break;
                }
                long j2 = jArr2[i2];
                if (j2 == j) {
                    l = Long.valueOf(j2);
                    break;
                }
                i2++;
            }
            if (l != null) {
                arrayList.add(Long.valueOf(l.longValue()));
            }
        }
        return C8490t.m46676A(arrayList);
    }

    /* renamed from: C */
    public static final int m19326C(Context context, long j, ContentValues contentValues) {
        C8594l.m46771e(context, "context");
        try {
            return context.getContentResolver().update(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, contentValues, "_id=?", new String[]{String.valueOf(j)});
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    private final void m19327b(StringBuilder sb, long[] jArr) {
        sb.append("_id IN (");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i < jArr.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (r0 != false) goto L_0x00c1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ Exception -> 0x00ca, all -> 0x00c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076 A[SYNTHETIC, Splitter:B:23:0x0076] */
    @android.annotation.SuppressLint({"InlinedApi"})
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.coocent.music.base.data.entity.Music> m19328c(android.content.Context r19, android.database.Cursor r20, java.lang.String r21, p369i.p387z.p388c.C8570l<? super com.coocent.music.base.data.entity.Music, java.lang.Boolean> r22) {
        /*
            r18 = this;
            r1 = r20
            r2 = r21
            r3 = r22
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r1 == 0) goto L_0x00d6
            f.c.e.a.a.f.e r0 = p159f.p166c.p181e.p182a.p183a.p189f.C4441e.m19454n(r19)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r5 = "MusicPreference.getInstance(context)"
            p369i.p387z.p389d.C8594l.m46770d(r0, r5)     // Catch:{ Exception -> 0x00ca }
            java.util.List r5 = r0.mo15116h()     // Catch:{ Exception -> 0x00ca }
            boolean r0 = r20.moveToFirst()     // Catch:{ Exception -> 0x00ca }
            if (r0 == 0) goto L_0x00ce
        L_0x0020:
            f.c.e.a.a.d.b r0 = p159f.p166c.p181e.p182a.p183a.p187d.C4377b.f12966a     // Catch:{ Exception -> 0x00ca }
            r6 = r19
            com.coocent.music.base.data.entity.Music r7 = r0.mo14929b(r6, r1)     // Catch:{ Exception -> 0x00ca }
            if (r3 == 0) goto L_0x0036
            java.lang.Object r0 = r3.invoke(r7)     // Catch:{ Exception -> 0x00ca }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Exception -> 0x00ca }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x00ca }
            if (r0 == 0) goto L_0x00c1
        L_0x0036:
            r0 = 0
            r8 = 1
            if (r2 == 0) goto L_0x0043
            int r9 = r21.length()     // Catch:{ Exception -> 0x00ca }
            if (r9 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r9 = 0
            goto L_0x0044
        L_0x0043:
            r9 = 1
        L_0x0044:
            if (r9 != 0) goto L_0x006a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ca }
            r9.<init>()     // Catch:{ Exception -> 0x00ca }
            r9.append(r2)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r10 = java.io.File.separator     // Catch:{ Exception -> 0x00ca }
            r9.append(r10)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r10 = r7.mo9213i()     // Catch:{ Exception -> 0x00ca }
            r9.append(r10)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00ca }
            java.lang.String r10 = r7.mo9211h()     // Catch:{ Exception -> 0x00ca }
            boolean r9 = p369i.p387z.p389d.C8594l.m46767a(r9, r10)     // Catch:{ Exception -> 0x00ca }
            r9 = r9 ^ r8
            if (r9 == 0) goto L_0x006a
            goto L_0x00c1
        L_0x006a:
            java.lang.String r9 = "filterPaths"
            p369i.p387z.p389d.C8594l.m46770d(r5, r9)     // Catch:{ Exception -> 0x00ca }
            boolean r9 = r5.isEmpty()     // Catch:{ Exception -> 0x00ca }
            r9 = r9 ^ r8
            if (r9 == 0) goto L_0x00be
            java.lang.String r9 = r7.mo9211h()     // Catch:{ Exception -> 0x00ba }
            java.util.Iterator r16 = r5.iterator()     // Catch:{ Exception -> 0x00ba }
        L_0x007e:
            boolean r10 = r16.hasNext()     // Catch:{ Exception -> 0x00ba }
            if (r10 == 0) goto L_0x00b7
            java.lang.Object r10 = r16.next()     // Catch:{ Exception -> 0x00ba }
            r15 = r10
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = "/"
            r12 = 0
            r13 = 0
            r14 = 6
            r17 = 0
            r10 = r9
            r8 = r15
            r15 = r17
            int r10 = p369i.p376f0.C8437p.m46535J(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00ba }
            if (r9 == 0) goto L_0x00af
            java.lang.String r10 = r9.substring(r0, r10)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r11 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p369i.p387z.p389d.C8594l.m46770d(r10, r11)     // Catch:{ Exception -> 0x00ba }
            boolean r8 = p369i.p387z.p389d.C8594l.m46767a(r8, r10)     // Catch:{ Exception -> 0x00ba }
            if (r8 == 0) goto L_0x00ad
            r0 = 1
            goto L_0x00b7
        L_0x00ad:
            r8 = 1
            goto L_0x007e
        L_0x00af:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x00ba }
            java.lang.String r8 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r8)     // Catch:{ Exception -> 0x00ba }
            throw r0     // Catch:{ Exception -> 0x00ba }
        L_0x00b7:
            if (r0 == 0) goto L_0x00be
            goto L_0x00c1
        L_0x00ba:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x00ca }
        L_0x00be:
            r4.add(r7)     // Catch:{ Exception -> 0x00ca }
        L_0x00c1:
            boolean r0 = r20.moveToNext()     // Catch:{ Exception -> 0x00ca }
            if (r0 != 0) goto L_0x0020
            goto L_0x00ce
        L_0x00c8:
            r0 = move-exception
            goto L_0x00d2
        L_0x00ca:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x00c8 }
        L_0x00ce:
            r20.close()
            goto L_0x00d6
        L_0x00d2:
            r20.close()
            throw r0
        L_0x00d6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p188e.C4423k.m19328c(android.content.Context, android.database.Cursor, java.lang.String, i.z.c.l):java.util.List");
    }

    /* renamed from: d */
    static /* synthetic */ List m19329d(C4423k kVar, Context context, Cursor cursor, String str, C8570l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            str = BuildConfig.FLAVOR;
        }
        if ((i & 8) != 0) {
            lVar = null;
        }
        return kVar.m19328c(context, cursor, str, lVar);
    }

    /* renamed from: f */
    private final ArrayList<Long> m19330f(Cursor cursor) {
        ArrayList<Long> arrayList = new ArrayList<>();
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    do {
                        arrayList.add(Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id"))));
                    } while (cursor.moveToNext());
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r12 != false) goto L_0x0088;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long[] m19331i(android.content.Context r17, android.database.Cursor r18) {
        /*
            r16 = this;
            r1 = r18
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L_0x009d
            f.c.e.a.a.f.e r0 = p159f.p166c.p181e.p182a.p183a.p189f.C4441e.m19454n(r17)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r3 = "MusicPreference.getInstance(context)"
            p369i.p387z.p389d.C8594l.m46770d(r0, r3)     // Catch:{ Exception -> 0x0091 }
            java.util.List r3 = r0.mo15116h()     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r18.moveToFirst()     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x0095
        L_0x001c:
            java.lang.String r0 = "_id"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x0091 }
            long r4 = r1.getLong(r0)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r0 = "_data"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "it.getString(it.getColum…      .Audio.Media.DATA))"
            p369i.p387z.p389d.C8594l.m46770d(r0, r6)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r6 = "filterPaths"
            p369i.p387z.p389d.C8594l.m46770d(r3, r6)     // Catch:{ Exception -> 0x0091 }
            boolean r6 = r3.isEmpty()     // Catch:{ Exception -> 0x0091 }
            r12 = 1
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x0081
            java.util.Iterator r13 = r3.iterator()     // Catch:{ Exception -> 0x007d }
        L_0x0046:
            boolean r6 = r13.hasNext()     // Catch:{ Exception -> 0x007d }
            r14 = 0
            if (r6 == 0) goto L_0x0079
            java.lang.Object r6 = r13.next()     // Catch:{ Exception -> 0x007d }
            r15 = r6
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x007d }
            java.lang.String r7 = "/"
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r0
            int r6 = p369i.p376f0.C8437p.m46535J(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x007d }
            if (r0 == 0) goto L_0x0071
            java.lang.String r6 = r0.substring(r14, r6)     // Catch:{ Exception -> 0x007d }
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p369i.p387z.p389d.C8594l.m46770d(r6, r7)     // Catch:{ Exception -> 0x007d }
            boolean r6 = p369i.p387z.p389d.C8594l.m46767a(r15, r6)     // Catch:{ Exception -> 0x007d }
            if (r6 == 0) goto L_0x0046
            goto L_0x007a
        L_0x0071:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x007d }
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r6)     // Catch:{ Exception -> 0x007d }
            throw r0     // Catch:{ Exception -> 0x007d }
        L_0x0079:
            r12 = 0
        L_0x007a:
            if (r12 == 0) goto L_0x0081
            goto L_0x0088
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x0091 }
        L_0x0081:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0091 }
            r2.add(r0)     // Catch:{ Exception -> 0x0091 }
        L_0x0088:
            boolean r0 = r18.moveToNext()     // Catch:{ Exception -> 0x0091 }
            if (r0 != 0) goto L_0x001c
            goto L_0x0095
        L_0x008f:
            r0 = move-exception
            goto L_0x0099
        L_0x0091:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x008f }
        L_0x0095:
            r18.close()
            goto L_0x009d
        L_0x0099:
            r18.close()
            throw r0
        L_0x009d:
            long[] r0 = p369i.p377u.C8490t.m46676A(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p181e.p182a.p183a.p188e.C4423k.m19331i(android.content.Context, android.database.Cursor):long[]");
    }

    /* renamed from: k */
    public static final List<Music> m19332k(Context context, String str) {
        C8594l.m46771e(context, "context");
        return m19337q(f13002a, context, (String) null, (String[]) null, str, false, false, (String) null, 112, (Object) null);
    }

    /* renamed from: l */
    public static final List<Music> m19333l(Context context, String str, String str2, boolean z, boolean z2, String str3) {
        C8594l.m46771e(context, "context");
        return f13002a.m19334n(context, str, (String[]) null, str2, z, z2, str3);
    }

    /* renamed from: n */
    private final List<Music> m19334n(Context context, String str, String[] strArr, String str2, boolean z, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        if (z) {
            if (str != null) {
                sb.append(" AND ");
            }
            mo14990a(context, sb);
        }
        List<Music> d = m19329d(this, context, m19340y(context, sb.toString(), strArr, str2), str3, (C8570l) null, 8, (Object) null);
        m19341z(z2, str2, d);
        return d;
    }

    /* renamed from: o */
    public static /* synthetic */ List m19335o(Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return m19332k(context, str);
    }

    /* renamed from: p */
    public static /* synthetic */ List m19336p(Context context, String str, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            str3 = BuildConfig.FLAVOR;
        }
        return m19333l(context, str, str2, z, z2, str3);
    }

    /* renamed from: q */
    static /* synthetic */ List m19337q(C4423k kVar, Context context, String str, String[] strArr, String str2, boolean z, boolean z2, String str3, int i, Object obj) {
        return kVar.m19334n(context, str, (i & 4) != 0 ? null : strArr, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? BuildConfig.FLAVOR : str3);
    }

    /* renamed from: s */
    public static /* synthetic */ List m19338s(C4423k kVar, Context context, long[] jArr, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return kVar.mo14996r(context, jArr, str, z);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: w */
    private final List<C8446k<Long, String>> m19339w(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            try {
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(cursor.getColumnIndex("_id"));
                        String string = cursor.getString(cursor.getColumnIndex("_data"));
                        C8594l.m46770d(string, "it.getString(it.getColum…      .Audio.Media.DATA))");
                        arrayList.add(new C8446k(Long.valueOf(j), string));
                    } while (cursor.moveToNext());
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                cursor.close();
                throw th;
            }
            cursor.close();
        }
        return arrayList;
    }

    /* renamed from: y */
    private final Cursor m19340y(Context context, String str, String[] strArr, String str2) {
        String str3 = "is_music=1 AND title != ''";
        try {
            if (!TextUtils.isEmpty(str)) {
                str3 = str3 + " AND " + str;
            }
            return context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "artist", "album", "duration", "artist_id", "album_id", "_data", "_size", "year", "date_added", "_display_name"}, str3, strArr, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: z */
    private final void m19341z(boolean z, String str, List<Music> list) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2135424008:
                    if (str.equals("title_key") && list.size() > 1) {
                        C8486p.m46674o(list, new C4425b());
                        return;
                    }
                    return;
                case -1409097913:
                    if (str.equals("artist") && list.size() > 1) {
                        C8486p.m46674o(list, new C4426c());
                        return;
                    }
                    return;
                case -102326855:
                    if (str.equals("title_key DESC") && list.size() > 1) {
                        C8486p.m46674o(list, new C4428e());
                        return;
                    }
                    return;
                case 92896879:
                    if (str.equals("album") && list.size() > 1) {
                        C8486p.m46674o(list, new C4427d());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public final void mo14990a(Context context, StringBuilder sb) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(sb, "stringBuilder");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        int g = n.mo15115g();
        sb.append("duration >= " + (g * 1000));
    }

    /* renamed from: e */
    public final ArrayList<Long> mo14991e(Context context) {
        C8594l.m46771e(context, "context");
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String t = n.mo15126t();
        C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
        return m19330f(m19340y(context, (String) null, (String[]) null, t));
    }

    /* renamed from: g */
    public final Music mo14992g(Context context, long j) {
        C8594l.m46771e(context, "context");
        new ArrayList().add(Long.valueOf(j));
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String t = n.mo15126t();
        C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
        Cursor y = m19340y(context, "_id = ?", new String[]{String.valueOf(j)}, t);
        if (y != null) {
            try {
                if (y.moveToFirst()) {
                    Music b = C4377b.f12966a.mo14929b(context, y);
                    y.close();
                    return b;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                y.close();
                throw th;
            }
            y.close();
        }
        return new Music();
    }

    /* renamed from: h */
    public final long[] mo14993h(Context context, String str, String[] strArr, String str2) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str2, "sortOrder");
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(' ' + str + ' ');
            sb.append(" AND ");
        }
        mo14990a(context, sb);
        return m19331i(context, m19340y(context, sb.toString(), strArr, str2));
    }

    /* renamed from: j */
    public final long[] mo14994j(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        StringBuilder sb = new StringBuilder();
        m19327b(sb, jArr);
        sb.append(" AND ");
        mo14990a(context, sb);
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String t = n.mo15126t();
        C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
        return m19325B(jArr, m19331i(context, m19340y(context, sb.toString(), (String[]) null, t)));
    }

    /* renamed from: m */
    public final List<Music> mo14995m(Context context, String str, boolean z) {
        C8594l.m46771e(context, "context");
        return m19337q(this, context, (String) null, (String[]) null, str, false, z, (String) null, 80, (Object) null);
    }

    /* renamed from: r */
    public final List<Music> mo14996r(Context context, long[] jArr, String str, boolean z) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        StringBuilder sb = new StringBuilder();
        m19327b(sb, jArr);
        sb.append(" AND ");
        mo14990a(context, sb);
        List<Music> d = m19329d(this, context, m19340y(context, sb.toString(), (String[]) null, str), (String) null, (C8570l) null, 12, (Object) null);
        m19341z(z, str, d);
        return d;
    }

    /* renamed from: t */
    public final List<Music> mo14997t(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        return m19324A(jArr, m19338s(this, context, jArr, (String) null, false, 12, (Object) null));
    }

    /* renamed from: u */
    public final List<Music> mo14998u(Context context, String str, boolean z) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "name");
        StringBuilder sb = new StringBuilder();
        mo14990a(context, sb);
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String t = n.mo15126t();
        C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
        return m19329d(this, context, m19340y(context, sb.toString(), (String[]) null, t), (String) null, new C4424a(z, str), 4, (Object) null);
    }

    /* renamed from: v */
    public final List<C8446k<Long, String>> mo14999v(Context context, long[] jArr) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(jArr, "ids");
        StringBuilder sb = new StringBuilder();
        m19327b(sb, jArr);
        C4441e n = C4441e.m19454n(context);
        C8594l.m46770d(n, "MusicPreference.getInstance(context)");
        String t = n.mo15126t();
        C8594l.m46770d(t, "MusicPreference.getInsta…e(context).trackSortOrder");
        return m19339w(m19340y(context, sb.toString(), (String[]) null, t));
    }

    /* renamed from: x */
    public final List<Music> mo15000x(Context context, int i) {
        C8594l.m46771e(context, "context");
        return m19336p(context, "date_added>" + ((System.currentTimeMillis() / ((long) 1000)) - ((long) (((i * 3600) * 24) * 7))), (String) null, false, false, (String) null, 56, (Object) null);
    }
}
