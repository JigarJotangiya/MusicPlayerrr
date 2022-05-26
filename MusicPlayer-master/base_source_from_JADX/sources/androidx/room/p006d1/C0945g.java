package androidx.room.p006d1;

import android.database.Cursor;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p082e.p149u.p150a.C4214b;

/* renamed from: androidx.room.d1.g */
/* compiled from: TableInfo */
public final class C0945g {

    /* renamed from: a */
    public final String f4113a;

    /* renamed from: b */
    public final Map<String, C0946a> f4114b;

    /* renamed from: c */
    public final Set<C0947b> f4115c;

    /* renamed from: d */
    public final Set<C0949d> f4116d;

    /* renamed from: androidx.room.d1.g$a */
    /* compiled from: TableInfo */
    public static final class C0946a {

        /* renamed from: a */
        public final String f4117a;

        /* renamed from: b */
        public final String f4118b;

        /* renamed from: c */
        public final int f4119c;

        /* renamed from: d */
        public final boolean f4120d;

        /* renamed from: e */
        public final int f4121e;

        /* renamed from: f */
        public final String f4122f;

        /* renamed from: g */
        private final int f4123g;

        public C0946a(String str, String str2, boolean z, int i, String str3, int i2) {
            this.f4117a = str;
            this.f4118b = str2;
            this.f4120d = z;
            this.f4121e = i;
            this.f4119c = m5717a(str2);
            this.f4122f = str3;
            this.f4123g = i2;
        }

        /* renamed from: a */
        private static int m5717a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        /* renamed from: b */
        public boolean mo5462b() {
            return this.f4121e > 0;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0946a)) {
                return false;
            }
            C0946a aVar = (C0946a) obj;
            if (Build.VERSION.SDK_INT >= 20) {
                if (this.f4121e != aVar.f4121e) {
                    return false;
                }
            } else if (mo5462b() != aVar.mo5462b()) {
                return false;
            }
            if (!this.f4117a.equals(aVar.f4117a) || this.f4120d != aVar.f4120d) {
                return false;
            }
            if (this.f4123g == 1 && aVar.f4123g == 2 && (str3 = this.f4122f) != null && !str3.equals(aVar.f4122f)) {
                return false;
            }
            if (this.f4123g == 2 && aVar.f4123g == 1 && (str2 = aVar.f4122f) != null && !str2.equals(this.f4122f)) {
                return false;
            }
            int i = this.f4123g;
            if ((i == 0 || i != aVar.f4123g || ((str = this.f4122f) == null ? aVar.f4122f == null : str.equals(aVar.f4122f))) && this.f4119c == aVar.f4119c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f4117a.hashCode() * 31) + this.f4119c) * 31) + (this.f4120d ? 1231 : 1237)) * 31) + this.f4121e;
        }

        public String toString() {
            return "Column{name='" + this.f4117a + '\'' + ", type='" + this.f4118b + '\'' + ", affinity='" + this.f4119c + '\'' + ", notNull=" + this.f4120d + ", primaryKeyPosition=" + this.f4121e + ", defaultValue='" + this.f4122f + '\'' + '}';
        }
    }

    /* renamed from: androidx.room.d1.g$b */
    /* compiled from: TableInfo */
    public static final class C0947b {

        /* renamed from: a */
        public final String f4124a;

        /* renamed from: b */
        public final String f4125b;

        /* renamed from: c */
        public final String f4126c;

        /* renamed from: d */
        public final List<String> f4127d;

        /* renamed from: e */
        public final List<String> f4128e;

        public C0947b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f4124a = str;
            this.f4125b = str2;
            this.f4126c = str3;
            this.f4127d = Collections.unmodifiableList(list);
            this.f4128e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0947b)) {
                return false;
            }
            C0947b bVar = (C0947b) obj;
            if (this.f4124a.equals(bVar.f4124a) && this.f4125b.equals(bVar.f4125b) && this.f4126c.equals(bVar.f4126c) && this.f4127d.equals(bVar.f4127d)) {
                return this.f4128e.equals(bVar.f4128e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f4124a.hashCode() * 31) + this.f4125b.hashCode()) * 31) + this.f4126c.hashCode()) * 31) + this.f4127d.hashCode()) * 31) + this.f4128e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f4124a + '\'' + ", onDelete='" + this.f4125b + '\'' + ", onUpdate='" + this.f4126c + '\'' + ", columnNames=" + this.f4127d + ", referenceColumnNames=" + this.f4128e + '}';
        }
    }

    /* renamed from: androidx.room.d1.g$c */
    /* compiled from: TableInfo */
    static class C0948c implements Comparable<C0948c> {

        /* renamed from: g */
        final int f4129g;

        /* renamed from: h */
        final int f4130h;

        /* renamed from: i */
        final String f4131i;

        /* renamed from: j */
        final String f4132j;

        C0948c(int i, int i2, String str, String str2) {
            this.f4129g = i;
            this.f4130h = i2;
            this.f4131i = str;
            this.f4132j = str2;
        }

        /* renamed from: c */
        public int compareTo(C0948c cVar) {
            int i = this.f4129g - cVar.f4129g;
            return i == 0 ? this.f4130h - cVar.f4130h : i;
        }
    }

    /* renamed from: androidx.room.d1.g$d */
    /* compiled from: TableInfo */
    public static final class C0949d {

        /* renamed from: a */
        public final String f4133a;

        /* renamed from: b */
        public final boolean f4134b;

        /* renamed from: c */
        public final List<String> f4135c;

        public C0949d(String str, boolean z, List<String> list) {
            this.f4133a = str;
            this.f4134b = z;
            this.f4135c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0949d)) {
                return false;
            }
            C0949d dVar = (C0949d) obj;
            if (this.f4134b != dVar.f4134b || !this.f4135c.equals(dVar.f4135c)) {
                return false;
            }
            if (this.f4133a.startsWith("index_")) {
                return dVar.f4133a.startsWith("index_");
            }
            return this.f4133a.equals(dVar.f4133a);
        }

        public int hashCode() {
            int i;
            if (this.f4133a.startsWith("index_")) {
                i = -1184239155;
            } else {
                i = this.f4133a.hashCode();
            }
            return (((i * 31) + (this.f4134b ? 1 : 0)) * 31) + this.f4135c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f4133a + '\'' + ", unique=" + this.f4134b + ", columns=" + this.f4135c + '}';
        }
    }

    public C0945g(String str, Map<String, C0946a> map, Set<C0947b> set, Set<C0949d> set2) {
        Set<C0949d> set3;
        this.f4113a = str;
        this.f4114b = Collections.unmodifiableMap(map);
        this.f4115c = Collections.unmodifiableSet(set);
        if (set2 == null) {
            set3 = null;
        } else {
            set3 = Collections.unmodifiableSet(set2);
        }
        this.f4116d = set3;
    }

    /* renamed from: a */
    public static C0945g m5711a(C4214b bVar, String str) {
        return new C0945g(str, m5712b(bVar, str), m5714d(bVar, str), m5716f(bVar, str));
    }

    /* renamed from: b */
    private static Map<String, C0946a> m5712b(C4214b bVar, String str) {
        Cursor X = bVar.mo5531X("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (X.getColumnCount() > 0) {
                int columnIndex = X.getColumnIndex("name");
                int columnIndex2 = X.getColumnIndex("type");
                int columnIndex3 = X.getColumnIndex("notnull");
                int columnIndex4 = X.getColumnIndex("pk");
                int columnIndex5 = X.getColumnIndex("dflt_value");
                while (X.moveToNext()) {
                    String string = X.getString(columnIndex);
                    hashMap.put(string, new C0946a(string, X.getString(columnIndex2), X.getInt(columnIndex3) != 0, X.getInt(columnIndex4), X.getString(columnIndex5), 2));
                }
            }
            return hashMap;
        } finally {
            X.close();
        }
    }

    /* renamed from: c */
    private static List<C0948c> m5713c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C0948c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<C0947b> m5714d(C4214b bVar, String str) {
        HashSet hashSet = new HashSet();
        Cursor X = bVar.mo5531X("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = X.getColumnIndex("id");
            int columnIndex2 = X.getColumnIndex("seq");
            int columnIndex3 = X.getColumnIndex("table");
            int columnIndex4 = X.getColumnIndex("on_delete");
            int columnIndex5 = X.getColumnIndex("on_update");
            List<C0948c> c = m5713c(X);
            int count = X.getCount();
            for (int i = 0; i < count; i++) {
                X.moveToPosition(i);
                if (X.getInt(columnIndex2) == 0) {
                    int i2 = X.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C0948c next : c) {
                        if (next.f4129g == i2) {
                            arrayList.add(next.f4131i);
                            arrayList2.add(next.f4132j);
                        }
                    }
                    hashSet.add(new C0947b(X.getString(columnIndex3), X.getString(columnIndex4), X.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            X.close();
        }
    }

    /* renamed from: e */
    private static C0949d m5715e(C4214b bVar, String str, boolean z) {
        Cursor X = bVar.mo5531X("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = X.getColumnIndex("seqno");
            int columnIndex2 = X.getColumnIndex("cid");
            int columnIndex3 = X.getColumnIndex("name");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    TreeMap treeMap = new TreeMap();
                    while (X.moveToNext()) {
                        if (X.getInt(columnIndex2) >= 0) {
                            int i = X.getInt(columnIndex);
                            treeMap.put(Integer.valueOf(i), X.getString(columnIndex3));
                        }
                    }
                    ArrayList arrayList = new ArrayList(treeMap.size());
                    arrayList.addAll(treeMap.values());
                    C0949d dVar = new C0949d(str, z, arrayList);
                    X.close();
                    return dVar;
                }
            }
            return null;
        } finally {
            X.close();
        }
    }

    /* renamed from: f */
    private static Set<C0949d> m5716f(C4214b bVar, String str) {
        Cursor X = bVar.mo5531X("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = X.getColumnIndex("name");
            int columnIndex2 = X.getColumnIndex("origin");
            int columnIndex3 = X.getColumnIndex("unique");
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    HashSet hashSet = new HashSet();
                    while (X.moveToNext()) {
                        if ("c".equals(X.getString(columnIndex2))) {
                            String string = X.getString(columnIndex);
                            boolean z = true;
                            if (X.getInt(columnIndex3) != 1) {
                                z = false;
                            }
                            C0949d e = m5715e(bVar, string, z);
                            if (e == null) {
                                X.close();
                                return null;
                            }
                            hashSet.add(e);
                        }
                    }
                    X.close();
                    return hashSet;
                }
            }
            return null;
        } finally {
            X.close();
        }
    }

    public boolean equals(Object obj) {
        Set<C0949d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0945g)) {
            return false;
        }
        C0945g gVar = (C0945g) obj;
        String str = this.f4113a;
        if (str == null ? gVar.f4113a != null : !str.equals(gVar.f4113a)) {
            return false;
        }
        Map<String, C0946a> map = this.f4114b;
        if (map == null ? gVar.f4114b != null : !map.equals(gVar.f4114b)) {
            return false;
        }
        Set<C0947b> set2 = this.f4115c;
        if (set2 == null ? gVar.f4115c != null : !set2.equals(gVar.f4115c)) {
            return false;
        }
        Set<C0949d> set3 = this.f4116d;
        if (set3 == null || (set = gVar.f4116d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f4113a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C0946a> map = this.f4114b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C0947b> set = this.f4115c;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TableInfo{name='" + this.f4113a + '\'' + ", columns=" + this.f4114b + ", foreignKeys=" + this.f4115c + ", indices=" + this.f4116d + '}';
    }
}
