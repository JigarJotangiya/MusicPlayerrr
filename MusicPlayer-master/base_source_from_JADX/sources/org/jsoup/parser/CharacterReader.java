package org.jsoup.parser;

import java.util.Arrays;
import java.util.Locale;
import org.jsoup.helper.Validate;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public final class CharacterReader {
    static final char EOF = '￿';
    private static final int maxCacheLen = 12;
    private final char[] input;
    private final int length;
    private int mark = 0;
    private int pos = 0;
    private final String[] stringCache = new String[512];

    public CharacterReader(String str) {
        Validate.notNull(str);
        char[] charArray = str.toCharArray();
        this.input = charArray;
        this.length = charArray.length;
    }

    private String cacheString(int i, int i2) {
        char[] cArr = this.input;
        String[] strArr = this.stringCache;
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i3 < i2) {
            i5 = (i5 * 31) + cArr[i4];
            i3++;
            i4++;
        }
        int length2 = (strArr.length - 1) & i5;
        String str = strArr[length2];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length2] = str2;
            return str2;
        } else if (rangeEquals(i, i2, str)) {
            return str;
        } else {
            String str3 = new String(cArr, i, i2);
            strArr[length2] = str3;
            return str3;
        }
    }

    public void advance() {
        this.pos++;
    }

    /* access modifiers changed from: package-private */
    public char consume() {
        int i = this.pos;
        char c = i >= this.length ? EOF : this.input[i];
        this.pos = i + 1;
        return c;
    }

    /* access modifiers changed from: package-private */
    public String consumeAsString() {
        char[] cArr = this.input;
        int i = this.pos;
        this.pos = i + 1;
        return new String(cArr, i, 1);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String consumeData() {
        /*
            r6 = this;
            int r0 = r6.pos
            int r1 = r6.length
            char[] r2 = r6.input
        L_0x0006:
            int r3 = r6.pos
            if (r3 >= r1) goto L_0x001c
            char r4 = r2[r3]
            r5 = 38
            if (r4 == r5) goto L_0x001c
            r5 = 60
            if (r4 == r5) goto L_0x001c
            if (r4 != 0) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            int r3 = r3 + 1
            r6.pos = r3
            goto L_0x0006
        L_0x001c:
            if (r3 <= r0) goto L_0x0024
            int r3 = r3 - r0
            java.lang.String r0 = r6.cacheString(r0, r3)
            goto L_0x0026
        L_0x0024:
            java.lang.String r0 = ""
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.consumeData():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public String consumeDigitSequence() {
        int i;
        char c;
        int i2 = this.pos;
        while (true) {
            i = this.pos;
            if (i < this.length && (c = this.input[i]) >= '0' && c <= '9') {
                this.pos = i + 1;
            }
        }
        return cacheString(i2, i - i2);
    }

    /* access modifiers changed from: package-private */
    public String consumeHexSequence() {
        int i;
        char c;
        int i2 = this.pos;
        while (true) {
            i = this.pos;
            if (i < this.length && (((c = this.input[i]) >= '0' && c <= '9') || ((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')))) {
                this.pos = i + 1;
            }
        }
        return cacheString(i2, i - i2);
    }

    /* access modifiers changed from: package-private */
    public String consumeLetterSequence() {
        char c;
        int i = this.pos;
        while (true) {
            int i2 = this.pos;
            if (i2 < this.length && (((c = this.input[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.pos++;
            }
        }
        return cacheString(i, this.pos - i);
    }

    /* access modifiers changed from: package-private */
    public String consumeLetterThenDigitSequence() {
        char c;
        int i = this.pos;
        while (true) {
            int i2 = this.pos;
            if (i2 < this.length && (((c = this.input[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.pos++;
            }
        }
        while (!isEmpty() && (r1 = this.input[r2]) >= '0' && r1 <= '9') {
            this.pos = (r2 = this.pos) + 1;
        }
        return cacheString(i, this.pos - i);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String consumeTagName() {
        /*
            r6 = this;
            int r0 = r6.pos
            int r1 = r6.length
            char[] r2 = r6.input
        L_0x0006:
            int r3 = r6.pos
            if (r3 >= r1) goto L_0x0030
            char r4 = r2[r3]
            r5 = 9
            if (r4 == r5) goto L_0x0030
            r5 = 10
            if (r4 == r5) goto L_0x0030
            r5 = 13
            if (r4 == r5) goto L_0x0030
            r5 = 12
            if (r4 == r5) goto L_0x0030
            r5 = 32
            if (r4 == r5) goto L_0x0030
            r5 = 47
            if (r4 == r5) goto L_0x0030
            r5 = 62
            if (r4 == r5) goto L_0x0030
            if (r4 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            int r3 = r3 + 1
            r6.pos = r3
            goto L_0x0006
        L_0x0030:
            if (r3 <= r0) goto L_0x0038
            int r3 = r3 - r0
            java.lang.String r0 = r6.cacheString(r0, r3)
            goto L_0x003a
        L_0x0038:
            java.lang.String r0 = ""
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.CharacterReader.consumeTagName():java.lang.String");
    }

    public String consumeTo(char c) {
        int nextIndexOf = nextIndexOf(c);
        if (nextIndexOf == -1) {
            return consumeToEnd();
        }
        String cacheString = cacheString(this.pos, nextIndexOf);
        this.pos += nextIndexOf;
        return cacheString;
    }

    public String consumeToAny(char... cArr) {
        int i = this.pos;
        int i2 = this.length;
        char[] cArr2 = this.input;
        loop0:
        while (this.pos < i2) {
            for (char c : cArr) {
                if (cArr2[this.pos] == c) {
                    break loop0;
                }
            }
            this.pos++;
        }
        int i3 = this.pos;
        return i3 > i ? cacheString(i, i3 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public String consumeToAnySorted(char... cArr) {
        int i = this.pos;
        int i2 = this.length;
        char[] cArr2 = this.input;
        while (true) {
            int i3 = this.pos;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                int i4 = this.pos;
            } else {
                this.pos++;
            }
        }
        int i42 = this.pos;
        return i42 > i ? cacheString(i, i42 - i) : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: package-private */
    public String consumeToEnd() {
        int i = this.pos;
        String cacheString = cacheString(i, this.length - i);
        this.pos = this.length;
        return cacheString;
    }

    /* access modifiers changed from: package-private */
    public boolean containsIgnoreCase(String str) {
        Locale locale = Locale.ENGLISH;
        return nextIndexOf((CharSequence) str.toLowerCase(locale)) > -1 || nextIndexOf((CharSequence) str.toUpperCase(locale)) > -1;
    }

    public char current() {
        int i = this.pos;
        return i >= this.length ? EOF : this.input[i];
    }

    public boolean isEmpty() {
        return this.pos >= this.length;
    }

    /* access modifiers changed from: package-private */
    public void mark() {
        this.mark = this.pos;
    }

    /* access modifiers changed from: package-private */
    public boolean matchConsume(String str) {
        if (!matches(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean matchConsumeIgnoreCase(String str) {
        if (!matchesIgnoreCase(str)) {
            return false;
        }
        this.pos += str.length();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean matches(char c) {
        return !isEmpty() && this.input[this.pos] == c;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesAny(char... cArr) {
        if (isEmpty()) {
            return false;
        }
        char c = this.input[this.pos];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesAnySorted(char[] cArr) {
        return !isEmpty() && Arrays.binarySearch(cArr, this.input[this.pos]) >= 0;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesDigit() {
        char c;
        if (!isEmpty() && (c = this.input[this.pos]) >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesIgnoreCase(String str) {
        int length2 = str.length();
        if (length2 > this.length - this.pos) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.input[this.pos + i])) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean matchesLetter() {
        if (isEmpty()) {
            return false;
        }
        char c = this.input[this.pos];
        if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int nextIndexOf(char c) {
        for (int i = this.pos; i < this.length; i++) {
            if (c == this.input[i]) {
                return i - this.pos;
            }
        }
        return -1;
    }

    public int pos() {
        return this.pos;
    }

    /* access modifiers changed from: package-private */
    public boolean rangeEquals(int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        char[] cArr = this.input;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* access modifiers changed from: package-private */
    public void rewindToMark() {
        this.pos = this.mark;
    }

    public String toString() {
        char[] cArr = this.input;
        int i = this.pos;
        return new String(cArr, i, this.length - i);
    }

    /* access modifiers changed from: package-private */
    public void unconsume() {
        this.pos--;
    }

    /* access modifiers changed from: package-private */
    public boolean matches(String str) {
        int length2 = str.length();
        if (length2 > this.length - this.pos) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (str.charAt(i) != this.input[this.pos + i]) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public int nextIndexOf(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        int i = this.pos;
        while (i < this.length) {
            int i2 = 1;
            if (charAt != this.input[i]) {
                do {
                    i++;
                    if (i >= this.length) {
                        break;
                    }
                } while (charAt == this.input[i]);
            }
            int i3 = i + 1;
            int length2 = (charSequence.length() + i3) - 1;
            int i4 = this.length;
            if (i < i4 && length2 <= i4) {
                int i5 = i3;
                while (i5 < length2 && charSequence.charAt(i2) == this.input[i5]) {
                    i5++;
                    i2++;
                }
                if (i5 == length2) {
                    return i - this.pos;
                }
            }
            i = i3;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public String consumeTo(String str) {
        int nextIndexOf = nextIndexOf((CharSequence) str);
        if (nextIndexOf == -1) {
            return consumeToEnd();
        }
        String cacheString = cacheString(this.pos, nextIndexOf);
        this.pos += nextIndexOf;
        return cacheString;
    }
}
