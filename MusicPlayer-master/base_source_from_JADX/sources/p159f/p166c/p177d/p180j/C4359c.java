package p159f.p166c.p177d.p180j;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p159f.p166c.p177d.p178h.C4348a;

/* renamed from: f.c.d.j.c */
/* compiled from: LyricParser */
public class C4359c {

    /* renamed from: a */
    private static final Pattern f12949a = Pattern.compile("((\\[\\d\\d:\\d\\d\\.\\d{2,3}\\])+)(.+)");

    /* renamed from: b */
    private static final Pattern f12950b = Pattern.compile("\\[(\\d\\d):(\\d\\d)\\.(\\d{2,3})\\]");

    /* renamed from: a */
    public static void m19010a(File file, File file2) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            PrintWriter printWriter = new PrintWriter(file2);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    printWriter.println(readLine);
                } else {
                    bufferedReader.close();
                    printWriter.close();
                    return;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r9 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r9 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19011b(android.content.Context r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "_data"
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r2.<init>()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r3 = "_display_name LIKE '%"
            r2.append(r3)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r2.append(r10)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r10 = ".lrc"
            r2.append(r10)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r10 = "'"
            r2.append(r10)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r10 = r2.toString()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r2.<init>()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r2.append(r10)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r10 = " AND _data NOT LIKE '/storage/emulated/0/Android/%'"
            r2.append(r10)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String r9 = "external"
            android.net.Uri r4 = android.provider.MediaStore.Files.getContentUri(r9)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0060, all -> 0x005e }
            if (r9 == 0) goto L_0x005b
            boolean r10 = r9.moveToFirst()     // Catch:{ Exception -> 0x0059 }
            if (r10 == 0) goto L_0x005b
            int r10 = r9.getColumnIndex(r0)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ Exception -> 0x0059 }
            if (r9 == 0) goto L_0x0058
            r9.close()
        L_0x0058:
            return r10
        L_0x0059:
            r10 = move-exception
            goto L_0x0062
        L_0x005b:
            if (r9 == 0) goto L_0x006a
            goto L_0x0067
        L_0x005e:
            r10 = move-exception
            goto L_0x006d
        L_0x0060:
            r10 = move-exception
            r9 = r1
        L_0x0062:
            r10.printStackTrace()     // Catch:{ all -> 0x006b }
            if (r9 == 0) goto L_0x006a
        L_0x0067:
            r9.close()
        L_0x006a:
            return r1
        L_0x006b:
            r10 = move-exception
            r1 = r9
        L_0x006d:
            if (r1 == 0) goto L_0x0072
            r1.close()
        L_0x0072:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p166c.p177d.p180j.C4359c.m19011b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static int m19012c(List<C4348a> list, long j) {
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            int i = 0;
            while (i <= size) {
                int i2 = (i + size) / 2;
                if (j < list.get(i2).mo14757j()) {
                    size = i2 - 1;
                } else {
                    i = i2 + 1;
                    if (i >= list.size() || j < list.get(i).mo14757j()) {
                        return i2;
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m19013d(Context context, long j) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LyricParser", 0);
        return sharedPreferences.getBoolean("bind_lyric_" + j, false);
    }

    /* renamed from: e */
    private static List<C4348a> m19014e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String trim = str.trim();
        Pattern pattern = f12949a;
        if (!pattern.matcher(trim).matches()) {
            trim = trim + " ";
        }
        Matcher matcher = pattern.matcher(trim);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        String replace = matcher.group(3).replace("&apos;", "'");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f12950b.matcher(group);
        while (matcher2.find()) {
            long parseLong = Long.parseLong(matcher2.group(1));
            long parseLong2 = Long.parseLong(matcher2.group(2));
            String group2 = matcher2.group(3);
            long parseLong3 = Long.parseLong(group2);
            if (group2.length() == 2) {
                parseLong3 *= 10;
            }
            arrayList.add(new C4348a((parseLong * 60000) + (parseLong2 * 1000) + parseLong3, replace));
        }
        return arrayList;
    }

    /* renamed from: f */
    public static List<C4348a> m19015f(Context context, long j, String str, String str2) {
        String b;
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        String str3 = str2 + File.separator + str + ".lrc";
        File file2 = new File(str3);
        if (!file2.exists() && !m19013d(context, j) && (b = m19011b(context, str)) != null) {
            m19010a(new File(b), file2);
            m19018i(context, j);
        }
        return m19016g(str3);
    }

    /* renamed from: g */
    public static List<C4348a> m19016g(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(str)), "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                List<C4348a> e = m19014e(readLine);
                if (e != null && !e.isEmpty()) {
                    arrayList.addAll(e);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List<C4348a> m19017h(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String e : str.split("\\n")) {
            List<C4348a> e2 = m19014e(e);
            if (e2 != null && !e2.isEmpty()) {
                arrayList.addAll(e2);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m19018i(Context context, long j) {
        SharedPreferences.Editor edit = context.getSharedPreferences("LyricParser", 0).edit();
        edit.putBoolean("bind_lyric_" + j, true).apply();
    }
}
