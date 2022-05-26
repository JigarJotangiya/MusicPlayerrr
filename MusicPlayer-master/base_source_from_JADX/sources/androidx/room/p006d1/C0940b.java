package androidx.room.p006d1;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: androidx.room.d1.b */
/* compiled from: CursorUtil */
public class C0940b {
    /* renamed from: a */
    public static Cursor m5697a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); i++) {
                    int type = cursor.getType(i);
                    if (type == 0) {
                        objArr[i] = null;
                    } else if (type == 1) {
                        objArr[i] = Long.valueOf(cursor.getLong(i));
                    } else if (type == 2) {
                        objArr[i] = Double.valueOf(cursor.getDouble(i));
                    } else if (type == 3) {
                        objArr[i] = cursor.getString(i);
                    } else if (type == 4) {
                        objArr[i] = cursor.getBlob(i);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                matrixCursor.addRow(objArr);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    /* renamed from: b */
    private static int m5698b(Cursor cursor, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            return m5699c(cursor.getColumnNames(), str);
        }
        return -1;
    }

    /* renamed from: c */
    static int m5699c(String[] strArr, String str) {
        String str2 = "." + str;
        String str3 = "." + str + "`";
        for (int i = 0; i < strArr.length; i++) {
            String str4 = strArr[i];
            if (str4.length() >= str.length() + 2) {
                if (str4.endsWith(str2)) {
                    return i;
                }
                if (str4.charAt(0) == '`' && str4.endsWith(str3)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static int m5700d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = cursor.getColumnIndex("`" + str + "`");
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return m5698b(cursor, str);
    }

    /* renamed from: e */
    public static int m5701e(Cursor cursor, String str) {
        String str2;
        int d = m5700d(cursor, str);
        if (d >= 0) {
            return d;
        }
        try {
            str2 = Arrays.toString(cursor.getColumnNames());
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = BuildConfig.FLAVOR;
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + str2);
    }
}
