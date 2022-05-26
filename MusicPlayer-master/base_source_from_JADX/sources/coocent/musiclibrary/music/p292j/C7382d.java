package coocent.musiclibrary.music.p292j;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.widget.Toast;
import com.coocent.music.base.data.entity.Music;
import coocent.musiclibrary.music.p281b.C7322a;
import coocent.musiclibrary.music.p281b.C7324c;
import coocent.musiclibrary.music.p284e.C7336f;
import coocent.musiclibrary.music.p284e.C7340g;
import java.io.File;
import p159f.p160a.p161a.C4264b;
import p159f.p160a.p161a.C4269f;
import p342g.p359b.C8353g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: coocent.musiclibrary.music.j.d */
/* compiled from: CoocentMusicUtils */
public class C7382d {

    /* renamed from: coocent.musiclibrary.music.j.d$a */
    /* compiled from: CoocentMusicUtils */
    class C7383a implements C7336f.C7338b {

        /* renamed from: a */
        final /* synthetic */ Music f32463a;

        /* renamed from: b */
        final /* synthetic */ C7336f f32464b;

        /* renamed from: c */
        final /* synthetic */ Context f32465c;

        /* renamed from: d */
        final /* synthetic */ int f32466d;

        /* renamed from: e */
        final /* synthetic */ int f32467e;

        /* renamed from: f */
        final /* synthetic */ int f32468f;

        /* renamed from: g */
        final /* synthetic */ boolean f32469g;

        /* renamed from: h */
        final /* synthetic */ C7340g.C7342b f32470h;

        C7383a(Music music, C7336f fVar, Context context, int i, int i2, int i3, boolean z, C7340g.C7342b bVar) {
            this.f32463a = music;
            this.f32464b = fVar;
            this.f32465c = context;
            this.f32466d = i;
            this.f32467e = i2;
            this.f32468f = i3;
            this.f32469g = z;
            this.f32470h = bVar;
        }

        /* renamed from: a */
        public void mo28077a() {
            this.f32464b.dismiss();
        }

        /* renamed from: b */
        public void mo28078b() {
            if (this.f32463a.mo9261a() == 0) {
                this.f32464b.dismiss();
                C7340g gVar = new C7340g(this.f32465c, this.f32463a.mo9218n(), this.f32463a.mo9210g(), this.f32463a.mo9207e(), this.f32466d, this.f32467e, this.f32468f, this.f32469g);
                gVar.requestWindowFeature(1);
                gVar.show();
                gVar.mo28081c(this.f32470h);
                return;
            }
            Toast.makeText(this.f32465c, C8353g.video_style_can_not_option, 0).show();
        }
    }

    /* renamed from: coocent.musiclibrary.music.j.d$b */
    /* compiled from: CoocentMusicUtils */
    class C7384b implements C4269f.C4283m {
        C7384b() {
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            fVar.dismiss();
        }
    }

    /* renamed from: coocent.musiclibrary.music.j.d$c */
    /* compiled from: CoocentMusicUtils */
    class C7385c implements C4269f.C4283m {

        /* renamed from: a */
        final /* synthetic */ Context f32471a;

        /* renamed from: b */
        final /* synthetic */ long[] f32472b;

        /* renamed from: c */
        final /* synthetic */ C7324c f32473c;

        C7385c(Context context, long[] jArr, C7324c cVar) {
            this.f32471a = context;
            this.f32472b = jArr;
            this.f32473c = cVar;
        }

        /* renamed from: a */
        public void mo6880a(C4269f fVar, C4264b bVar) {
            C7382d.m41671b(this.f32471a, this.f32472b, this.f32473c);
        }
    }

    /* renamed from: coocent.musiclibrary.music.j.d$d */
    /* compiled from: CoocentMusicUtils */
    public enum C7386d {
        NA(0),
        Artist(1),
        Album(2),
        Playlist(3);
        
        public final int mId;

        private C7386d(int i) {
            this.mId = i;
        }

        public static C7386d getTypeById(int i) {
            for (C7386d dVar : values()) {
                if (dVar.mId == i) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unrecognized id: " + i);
        }
    }

    /* renamed from: a */
    public static final long m41670a(Context context, String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    ContentResolver contentResolver = context.getContentResolver();
                    ContentResolver contentResolver2 = contentResolver;
                    Cursor query = contentResolver2.query(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, new String[]{"name"}, "name = '" + str + "'", (String[]) null, (String) null);
                    if (query.getCount() <= 0) {
                        ContentValues contentValues = new ContentValues(1);
                        contentValues.put("name", str);
                        return Long.parseLong(contentResolver.insert(MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI, contentValues).getLastPathSegment());
                    } else if (query != null) {
                        query.close();
                    }
                }
            } catch (Exception | SecurityException unused) {
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e5, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e6, code lost:
        r11.printStackTrace();
        android.util.Log.e("MusicUtils", "Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00ba */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e5 A[ExcHandler: Exception (r11v2 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:1:0x0008] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m41671b(android.content.Context r11, long[] r12, coocent.musiclibrary.music.p281b.C7324c r13) {
        /*
            java.lang.String r0 = "MusicUtils"
            java.lang.String r1 = "_id"
            java.lang.String r2 = "_data"
            java.lang.String r3 = "album_id"
            java.lang.String[] r6 = new java.lang.String[]{r1, r2, r3}     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r1.<init>()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.lang.String r2 = "_id IN ("
            r1.append(r2)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r2 = 0
            r3 = 0
        L_0x0018:
            int r4 = r12.length     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r10 = 1
            if (r3 >= r4) goto L_0x002d
            r4 = r12[r3]     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r1.append(r4)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            int r4 = r12.length     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            int r4 = r4 - r10
            if (r3 >= r4) goto L_0x002a
            java.lang.String r4 = ","
            r1.append(r4)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
        L_0x002a:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002d:
            java.lang.String r3 = ")"
            r1.append(r3)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.content.ContentResolver r4 = r11.getContentResolver()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.net.Uri r5 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.lang.String r7 = r1.toString()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            if (r1 == 0) goto L_0x00f3
            r1.moveToFirst()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
        L_0x0047:
            boolean r3 = r1.isAfterLast()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r4 = 0
            if (r3 != 0) goto L_0x0063
            long r5 = r1.getLong(r2)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.net.Uri r3 = android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.net.Uri r3 = android.content.ContentUris.withAppendedId(r3, r5)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.content.ContentResolver r5 = r11.getContentResolver()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r5.delete(r3, r4, r4)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r1.moveToNext()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            goto L_0x0047
        L_0x0063:
            int r3 = r12.length     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r5 = 0
        L_0x0065:
            if (r5 >= r3) goto L_0x007f
            r6 = r12[r5]     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            if (r13 == 0) goto L_0x006e
            r13.mo28066x(r6)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
        L_0x006e:
            coocent.musiclibrary.music.i.e r8 = coocent.musiclibrary.music.p291i.C7378e.m41663c(r11)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r8.mo28173g(r6)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            coocent.musiclibrary.music.i.c r8 = coocent.musiclibrary.music.p291i.C7376c.m41652a(r11)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r8.mo28166e(r6)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            int r5 = r5 + 1
            goto L_0x0065
        L_0x007f:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r5 = 30
            if (r3 >= r5) goto L_0x00c1
            java.lang.String r3 = "Remove selected tracks from the database"
            android.util.Log.e(r0, r3)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r1.moveToFirst()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
        L_0x008d:
            boolean r3 = r1.isAfterLast()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            if (r3 != 0) goto L_0x00be
            java.lang.String r3 = r1.getString(r10)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.io.File r5 = new java.io.File     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r5.<init>(r3)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            boolean r5 = r5.delete()     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            if (r5 != 0) goto L_0x00b6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            r5.<init>()     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            java.lang.String r6 = "Failed to delete file "
            r5.append(r6)     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            r5.append(r3)     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            java.lang.String r3 = r5.toString()     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            android.util.Log.e(r0, r3)     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
        L_0x00b6:
            r1.moveToNext()     // Catch:{ SecurityException -> 0x00ba, Exception -> 0x00e5 }
            goto L_0x008d
        L_0x00ba:
            r1.moveToNext()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            goto L_0x008d
        L_0x00be:
            r1.close()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
        L_0x00c1:
            int r1 = p342g.p359b.C8352f.NNNtracksdeleted     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            int r3 = r12.length     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.lang.String r1 = m41674e(r11, r1, r3)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.widget.Toast r1 = android.widget.Toast.makeText(r11, r1, r2)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r1.show()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.lang.String r1 = "content://media"
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r11.notifyChange(r1, r4)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            r13.mo28062f(r4)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            java.lang.String r11 = "onModifySuccess"
            android.util.Log.e(r0, r11)     // Catch:{ SecurityException -> 0x00ef, Exception -> 0x00e5 }
            goto L_0x00f3
        L_0x00e5:
            r11 = move-exception
            r11.printStackTrace()
            java.lang.String r11 = "Exception"
            android.util.Log.e(r0, r11)
            goto L_0x00f3
        L_0x00ef:
            r11 = move-exception
            r13.mo28064s(r11, r12)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.musiclibrary.music.p292j.C7382d.m41671b(android.content.Context, long[], coocent.musiclibrary.music.b.c):void");
    }

    /* renamed from: e */
    public static final String m41674e(Context context, int i, int i2) {
        return context.getResources().getQuantityString(i, i2, new Object[]{Integer.valueOf(i2)});
    }

    /* renamed from: f */
    public static void m41675f(Activity activity, String str, String str2) {
        m41676g(activity, str, str2, (String) null);
    }

    /* renamed from: g */
    public static void m41676g(Activity activity, String str, String str2, String str3) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            if (str3 != null) {
                if (!str3.equals(BuildConfig.FLAVOR)) {
                    File file = new File(str3);
                    if (file.exists() && file.isFile()) {
                        intent.setType("image/jpg");
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                    }
                    intent.putExtra("android.intent.extra.SUBJECT", str);
                    intent.putExtra("android.intent.extra.TEXT", str2);
                    intent.setFlags(268435456);
                    activity.startActivity(Intent.createChooser(intent, "Share app via"));
                }
            }
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            intent.setFlags(268435456);
            activity.startActivity(Intent.createChooser(intent, "Share app via"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m41677h(Context context, long j) {
        Cursor query = context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "_data", "album_id"}, "_id IN (" + j + ")", (String[]) null, (String) null);
        if (query != null) {
            query.moveToFirst();
            try {
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setType("audio/*");
                intent.addFlags(276824064);
                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(query.getString(1))));
                context.startActivity(Intent.createChooser(intent, "Share"));
                query.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: i */
    public static void m41678i(Context context, String str, long[] jArr, int i, int i2, int i3, C7324c cVar) {
        C4269f.C4274d dVar = new C4269f.C4274d(context);
        dVar.mo14622I(C8353g.delete_song_tips);
        dVar.mo14624K(i3);
        dVar.mo14631f(context.getString(C8353g.delete_song_tip) + " " + str + " ?");
        dVar.mo14628b(i2);
        dVar.mo14632g(i3);
        dVar.mo14620G(context.getString(C8353g.delete));
        dVar.mo14649x(context.getString(C8353g.cancel));
        dVar.mo14617D(i);
        dVar.mo14646u(i);
        dVar.mo14616C(new C7385c(context, jArr, cVar));
        dVar.mo14615B(new C7384b());
        dVar.mo14621H();
    }

    /* renamed from: j */
    public static void m41679j(Context context, String str, long[] jArr, int i, int i2, int i3, C7322a aVar) {
        C4269f.C4274d dVar = new C4269f.C4274d(context);
        dVar.mo14622I(C8353g.delete_song_tips);
        dVar.mo14624K(i3);
        dVar.mo14631f(context.getString(C8353g.delete_song_tip) + " " + str + " ?");
        dVar.mo14628b(i2);
        dVar.mo14632g(i3);
        dVar.mo14620G(context.getString(C8353g.delete));
        dVar.mo14649x(context.getString(C8353g.cancel));
        dVar.mo14617D(i);
        dVar.mo14646u(i);
        dVar.mo14616C(new C7380b(aVar));
        dVar.mo14615B(C7379a.f32461a);
        dVar.mo14621H();
    }

    /* renamed from: k */
    public static void m41680k(Context context, Music music, int i, int i2, int i3, boolean z, C7340g.C7342b bVar) {
        C7336f fVar = new C7336f(context, music.mo9218n(), music.mo9210g(), music.mo9207e(), music.mo9214j(), music.mo9211h(), i, i2, i3, z);
        fVar.requestWindowFeature(1);
        fVar.show();
        fVar.mo28075d(new C7383a(music, fVar, context, i, i2, i3, z, bVar));
    }
}
