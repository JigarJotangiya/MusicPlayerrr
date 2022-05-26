package coocent.music.player.widget.ringtone;

import android.media.MediaPlayer;
import android.util.Log;

/* renamed from: coocent.music.player.widget.ringtone.g */
/* compiled from: SeekTest */
public class C7290g {

    /* renamed from: a */
    static long f32218a;

    /* renamed from: b */
    static long f32219b;

    /* renamed from: c */
    private static byte[] f32220c = {-1, -5, 16, -60, 0, 3, -127, -12, 1, 38, 96, 0, 64, 32, 89, Byte.MIN_VALUE, 35, 72, 0, 9, 116, 0, 1, 18, 3, -1, -1, -1, -1, -2, -97, 99, -65, -47, 122, 63, 93, 1, -1, -1, -1, -1, -2, -115, -83, 108, 49, 66, -61, 2, -57, 12, 9, -122, -125, -88, 122, 58, 104, 76, 65, 77, 69, 51, 46, 57, 56, 46, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: coocent.music.player.widget.ringtone.g$a */
    /* compiled from: SeekTest */
    class C7291a implements MediaPlayer.OnCompletionListener {
        C7291a() {
        }

        public synchronized void onCompletion(MediaPlayer mediaPlayer) {
            Log.i("Ringdroid", "Got callback");
            C7290g.f32219b = System.currentTimeMillis();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:38|39|40|41|42|43|(3:44|45|46)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x013c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m41352a(android.content.SharedPreferences r25) {
        /*
            r1 = r25
            java.lang.String r2 = "Fast MP3 seek disabled by default"
            java.lang.String r3 = "Ringdroid"
            java.lang.String r0 = "Running CanSeekAccurately"
            android.util.Log.i(r3, r0)
            java.lang.String r4 = "seek_test_result"
            r5 = 0
            boolean r6 = r1.getBoolean(r4, r5)
            java.lang.String r7 = "seek_test_date"
            r8 = 0
            long r10 = r1.getLong(r7, r8)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r12 = r0.getTime()
            long r10 = r12 - r10
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fast MP3 seek result cached: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            return r6
        L_0x0041:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "/sdcard/silence"
            r0.append(r10)
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            long r10 = r10.nextLong()
            r0.append(r10)
            java.lang.String r10 = ".mp3"
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            java.io.File r10 = new java.io.File
            r10.<init>(r0)
            java.io.RandomAccessFile r14 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x006e }
            java.lang.String r15 = "r"
            r14.<init>(r10, r15)     // Catch:{ Exception -> 0x006e }
            r14 = 0
            goto L_0x006f
        L_0x006e:
            r14 = 1
        L_0x006f:
            if (r14 != 0) goto L_0x0077
            java.lang.String r0 = "Couldn't find temporary filename"
            android.util.Log.i(r3, r0)
            return r5
        L_0x0077:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Writing "
            r14.append(r15)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            android.util.Log.i(r3, r14)
            r10.createNewFile()     // Catch:{ Exception -> 0x0226 }
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x021c }
            r14.<init>(r10)     // Catch:{ Exception -> 0x021c }
            r15 = 0
        L_0x0094:
            r11 = 80
            if (r15 >= r11) goto L_0x00a3
            byte[] r11 = f32220c     // Catch:{ Exception -> 0x021c }
            int r8 = r11.length     // Catch:{ Exception -> 0x021c }
            r14.write(r11, r5, r8)     // Catch:{ Exception -> 0x021c }
            int r15 = r15 + 1
            r8 = 0
            goto L_0x0094
        L_0x00a3:
            java.lang.String r8 = "File written, starting to play"
            android.util.Log.i(r3, r8)     // Catch:{ Exception -> 0x01ea }
            android.media.MediaPlayer r8 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x01ea }
            r8.<init>()     // Catch:{ Exception -> 0x01ea }
            r9 = 3
            r8.setAudioStreamType(r9)     // Catch:{ Exception -> 0x01ea }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Exception -> 0x01ea }
            r9.<init>(r0)     // Catch:{ Exception -> 0x01ea }
            byte[] r0 = f32220c     // Catch:{ Exception -> 0x01ea }
            int r11 = r0.length     // Catch:{ Exception -> 0x01ea }
            int r11 = r11 * 70
            long r14 = (long) r11     // Catch:{ Exception -> 0x01ea }
            int r0 = r0.length     // Catch:{ Exception -> 0x01ea }
            int r0 = r0 * 10
            r24 = r6
            long r5 = (long) r0
            java.io.FileDescriptor r19 = r9.getFD()     // Catch:{ Exception -> 0x01e6 }
            r18 = r8
            r20 = r14
            r22 = r5
            r18.setDataSource(r19, r20, r22)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "Preparing"
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e6 }
            r8.prepare()     // Catch:{ Exception -> 0x01e6 }
            r5 = 0
            f32218a = r5     // Catch:{ Exception -> 0x01e6 }
            f32219b = r5     // Catch:{ Exception -> 0x01e6 }
            coocent.music.player.widget.ringtone.g$a r0 = new coocent.music.player.widget.ringtone.g$a     // Catch:{ Exception -> 0x01e6 }
            r0.<init>()     // Catch:{ Exception -> 0x01e6 }
            r8.setOnCompletionListener(r0)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r0 = "Starting"
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e6 }
            r8.start()     // Catch:{ Exception -> 0x01e6 }
            r0 = 0
        L_0x00ee:
            r5 = 200(0xc8, float:2.8E-43)
            r14 = 10
            if (r0 >= r5) goto L_0x0129
            long r5 = f32218a     // Catch:{ Exception -> 0x01e6 }
            r16 = 0
            int r9 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r9 != 0) goto L_0x0129
            int r5 = r8.getCurrentPosition()     // Catch:{ Exception -> 0x01e6 }
            if (r5 <= 0) goto L_0x0123
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e6 }
            r5.<init>()     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r6 = "Started playing after "
            r5.append(r6)     // Catch:{ Exception -> 0x01e6 }
            int r6 = r0 * 10
            r5.append(r6)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r6 = " ms"
            r5.append(r6)     // Catch:{ Exception -> 0x01e6 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x01e6 }
            android.util.Log.i(r3, r5)     // Catch:{ Exception -> 0x01e6 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01e6 }
            f32218a = r5     // Catch:{ Exception -> 0x01e6 }
        L_0x0123:
            java.lang.Thread.sleep(r14)     // Catch:{ Exception -> 0x01e6 }
            int r0 = r0 + 1
            goto L_0x00ee
        L_0x0129:
            long r5 = f32218a     // Catch:{ Exception -> 0x01e6 }
            r16 = 0
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x014d
            java.lang.String r0 = "Never started playing."
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e6 }
            android.util.Log.i(r3, r2)     // Catch:{ Exception -> 0x01e6 }
            r10.delete()     // Catch:{ Exception -> 0x013c }
        L_0x013c:
            android.content.SharedPreferences$Editor r0 = r25.edit()     // Catch:{ Exception -> 0x01e6 }
            r0.putLong(r7, r12)     // Catch:{ Exception -> 0x01e6 }
            r5 = r24
            r0.putBoolean(r4, r5)     // Catch:{ Exception -> 0x01e4 }
            r0.commit()     // Catch:{ Exception -> 0x01e4 }
            r1 = 0
            return r1
        L_0x014d:
            r5 = r24
            java.lang.String r0 = "Sleeping"
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e4 }
            r0 = 0
        L_0x0155:
            r6 = 300(0x12c, float:4.2E-43)
            if (r0 >= r6) goto L_0x017f
            long r18 = f32219b     // Catch:{ Exception -> 0x01e4 }
            r16 = 0
            int r6 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r6 != 0) goto L_0x017f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e4 }
            r6.<init>()     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r9 = "Pos: "
            r6.append(r9)     // Catch:{ Exception -> 0x01e4 }
            int r9 = r8.getCurrentPosition()     // Catch:{ Exception -> 0x01e4 }
            r6.append(r9)     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01e4 }
            android.util.Log.i(r3, r6)     // Catch:{ Exception -> 0x01e4 }
            java.lang.Thread.sleep(r14)     // Catch:{ Exception -> 0x01e4 }
            int r0 = r0 + 1
            goto L_0x0155
        L_0x017f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e4 }
            r0.<init>()     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r6 = "Result: "
            r0.append(r6)     // Catch:{ Exception -> 0x01e4 }
            long r8 = f32218a     // Catch:{ Exception -> 0x01e4 }
            r0.append(r8)     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ Exception -> 0x01e4 }
            long r8 = f32219b     // Catch:{ Exception -> 0x01e4 }
            r0.append(r8)     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01e4 }
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e4 }
            long r8 = f32219b     // Catch:{ Exception -> 0x01e4 }
            long r14 = f32218a     // Catch:{ Exception -> 0x01e4 }
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01cd
            r16 = 2000(0x7d0, double:9.88E-321)
            long r16 = r14 + r16
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cd
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b5
            long r8 = r8 - r14
            goto L_0x01b7
        L_0x01b5:
            r8 = -1
        L_0x01b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01e4 }
            r0.<init>()     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r6 = "Fast MP3 seek enabled: "
            r0.append(r6)     // Catch:{ Exception -> 0x01e4 }
            r0.append(r8)     // Catch:{ Exception -> 0x01e4 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01e4 }
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e4 }
            r6 = 1
            goto L_0x01d3
        L_0x01cd:
            java.lang.String r0 = "Fast MP3 seek disabled"
            android.util.Log.i(r3, r0)     // Catch:{ Exception -> 0x01e4 }
            r6 = r5
        L_0x01d3:
            android.content.SharedPreferences$Editor r0 = r25.edit()
            r0.putLong(r7, r12)
            r0.putBoolean(r4, r6)
            r0.commit()
            r10.delete()     // Catch:{ Exception -> 0x01e3 }
        L_0x01e3:
            return r6
        L_0x01e4:
            r0 = move-exception
            goto L_0x01ec
        L_0x01e6:
            r0 = move-exception
            r5 = r24
            goto L_0x01ec
        L_0x01ea:
            r0 = move-exception
            r5 = r6
        L_0x01ec:
            r0.printStackTrace()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Couldn't play: "
            r6.append(r8)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.i(r3, r0)
            android.util.Log.i(r3, r2)
            r10.delete()     // Catch:{ Exception -> 0x020d }
        L_0x020d:
            android.content.SharedPreferences$Editor r0 = r25.edit()
            r0.putLong(r7, r12)
            r0.putBoolean(r4, r5)
            r0.commit()
            r1 = 0
            return r1
        L_0x021c:
            r1 = 0
            java.lang.String r0 = "Couldn't write temp silence file"
            android.util.Log.i(r3, r0)
            r10.delete()     // Catch:{ Exception -> 0x0225 }
        L_0x0225:
            return r1
        L_0x0226:
            r1 = 0
            java.lang.String r0 = "Couldn't output for writing"
            android.util.Log.i(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.ringtone.C7290g.m41352a(android.content.SharedPreferences):boolean");
    }
}
