package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.View;

@SuppressLint({"LogConditional"})
/* renamed from: androidx.constraintlayout.motion.widget.b */
/* compiled from: Debug */
public class C0379b {
    /* renamed from: a */
    public static String m2239a() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 18 + String.valueOf(methodName).length());
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(") ");
        sb.append(methodName);
        sb.append("()");
        return sb.toString();
    }

    /* renamed from: b */
    public static String m2240b() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 15);
        sb.append(".(");
        sb.append(fileName);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: c */
    public static String m2241c(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            StringBuilder sb = new StringBuilder(12);
            sb.append("?");
            sb.append(i);
            return sb.toString();
        }
    }

    /* renamed from: d */
    public static String m2242d(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    /* renamed from: e */
    public static String m2243e(MotionLayout motionLayout, int i) {
        return m2244f(motionLayout, i, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        r2 = r1.replaceAll("[^_]", p453me.zhanghai.android.materialprogressbar.BuildConfig.FLAVOR).length();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m2244f(androidx.constraintlayout.motion.widget.MotionLayout r1, int r2, int r3) {
        /*
            r0 = -1
            if (r2 != r0) goto L_0x0006
            java.lang.String r1 = "UNDEFINED"
            return r1
        L_0x0006:
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceEntryName(r2)
            if (r3 == r0) goto L_0x0059
            int r2 = r1.length()
            if (r2 <= r3) goto L_0x0022
            java.lang.String r2 = "([^_])[aeiou]+"
            java.lang.String r0 = "$1"
            java.lang.String r1 = r1.replaceAll(r2, r0)
        L_0x0022:
            int r2 = r1.length()
            if (r2 <= r3) goto L_0x0059
            java.lang.String r2 = "[^_]"
            java.lang.String r0 = ""
            java.lang.String r2 = r1.replaceAll(r2, r0)
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0059
            int r0 = r1.length()
            int r0 = r0 - r3
            int r0 = r0 / r2
            java.nio.CharBuffer r2 = java.nio.CharBuffer.allocate(r0)
            java.lang.String r2 = r2.toString()
            r3 = 0
            r0 = 46
            java.lang.String r2 = r2.replace(r3, r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "_"
            java.lang.String r2 = r2.concat(r3)
            java.lang.String r1 = r1.replaceAll(r2, r3)
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0379b.m2244f(androidx.constraintlayout.motion.widget.MotionLayout, int, int):java.lang.String");
    }

    /* renamed from: g */
    public static void m2245g(String str, String str2, int i) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int min = Math.min(i, stackTrace.length - 1);
        String str3 = " ";
        for (int i2 = 1; i2 <= min; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            String fileName = stackTrace[i2].getFileName();
            int lineNumber = stackTrace[i2].getLineNumber();
            String methodName = stackTrace[i2].getMethodName();
            StringBuilder sb = new StringBuilder(String.valueOf(fileName).length() + 16 + String.valueOf(methodName).length());
            sb.append(".(");
            sb.append(fileName);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(") ");
            sb.append(methodName);
            String sb2 = sb.toString();
            str3 = String.valueOf(str3).concat(" ");
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(sb2).length() + String.valueOf(str3).length());
            sb3.append(str2);
            sb3.append(str3);
            sb3.append(sb2);
            sb3.append(str3);
            Log.v(str, sb3.toString());
        }
    }
}
