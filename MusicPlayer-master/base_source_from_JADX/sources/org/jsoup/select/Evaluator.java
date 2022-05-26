package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;

public abstract class Evaluator {

    public static final class AllElements extends Evaluator {
        public boolean matches(Element element, Element element2) {
            return true;
        }

        public String toString() {
            return "*";
        }
    }

    public static final class Attribute extends Evaluator {
        private String key;

        public Attribute(String str) {
            this.key = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key);
        }

        public String toString() {
            return String.format("[%s]", new Object[]{this.key});
        }
    }

    public static abstract class AttributeKeyPair extends Evaluator {
        String key;
        String value;

        public AttributeKeyPair(String str, String str2) {
            Validate.notEmpty(str);
            Validate.notEmpty(str2);
            this.key = str.trim().toLowerCase();
            if ((str2.startsWith("\"") && str2.endsWith("\"")) || (str2.startsWith("'") && str2.endsWith("'"))) {
                str2 = str2.substring(1, str2.length() - 1);
            }
            this.value = str2.trim().toLowerCase();
        }
    }

    public static final class AttributeStarting extends Evaluator {
        private String keyPrefix;

        public AttributeStarting(String str) {
            Validate.notEmpty(str);
            this.keyPrefix = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            for (org.jsoup.nodes.Attribute key : element2.attributes().asList()) {
                if (key.getKey().toLowerCase().startsWith(this.keyPrefix)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", new Object[]{this.keyPrefix});
        }
    }

    public static final class AttributeWithValue extends AttributeKeyPair {
        public AttributeWithValue(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && this.value.equalsIgnoreCase(element2.attr(this.key).trim());
        }

        public String toString() {
            return String.format("[%s=%s]", new Object[]{this.key, this.value});
        }
    }

    public static final class AttributeWithValueContaining extends AttributeKeyPair {
        public AttributeWithValueContaining(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && element2.attr(this.key).toLowerCase().contains(this.value);
        }

        public String toString() {
            return String.format("[%s*=%s]", new Object[]{this.key, this.value});
        }
    }

    public static final class AttributeWithValueEnding extends AttributeKeyPair {
        public AttributeWithValueEnding(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && element2.attr(this.key).toLowerCase().endsWith(this.value);
        }

        public String toString() {
            return String.format("[%s$=%s]", new Object[]{this.key, this.value});
        }
    }

    public static final class AttributeWithValueMatching extends Evaluator {
        String key;
        Pattern pattern;

        public AttributeWithValueMatching(String str, Pattern pattern2) {
            this.key = str.trim().toLowerCase();
            this.pattern = pattern2;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && this.pattern.matcher(element2.attr(this.key)).find();
        }

        public String toString() {
            return String.format("[%s~=%s]", new Object[]{this.key, this.pattern.toString()});
        }
    }

    public static final class AttributeWithValueNot extends AttributeKeyPair {
        public AttributeWithValueNot(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return !this.value.equalsIgnoreCase(element2.attr(this.key));
        }

        public String toString() {
            return String.format("[%s!=%s]", new Object[]{this.key, this.value});
        }
    }

    public static final class AttributeWithValueStarting extends AttributeKeyPair {
        public AttributeWithValueStarting(String str, String str2) {
            super(str, str2);
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasAttr(this.key) && element2.attr(this.key).toLowerCase().startsWith(this.value);
        }

        public String toString() {
            return String.format("[%s^=%s]", new Object[]{this.key, this.value});
        }
    }

    public static final class Class extends Evaluator {
        private String className;

        public Class(String str) {
            this.className = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.hasClass(this.className);
        }

        public String toString() {
            return String.format(".%s", new Object[]{this.className});
        }
    }

    public static final class ContainsData extends Evaluator {
        private String searchText;

        public ContainsData(String str) {
            this.searchText = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            return element2.data().toLowerCase().contains(this.searchText);
        }

        public String toString() {
            return String.format(":containsData(%s)", new Object[]{this.searchText});
        }
    }

    public static final class ContainsOwnText extends Evaluator {
        private String searchText;

        public ContainsOwnText(String str) {
            this.searchText = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            return element2.ownText().toLowerCase().contains(this.searchText);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", new Object[]{this.searchText});
        }
    }

    public static final class ContainsText extends Evaluator {
        private String searchText;

        public ContainsText(String str) {
            this.searchText = str.toLowerCase();
        }

        public boolean matches(Element element, Element element2) {
            return element2.text().toLowerCase().contains(this.searchText);
        }

        public String toString() {
            return String.format(":contains(%s)", new Object[]{this.searchText});
        }
    }

    /* renamed from: org.jsoup.select.Evaluator$Id */
    public static final class C9672Id extends Evaluator {

        /* renamed from: id */
        private String f36731id;

        public C9672Id(String str) {
            this.f36731id = str;
        }

        public boolean matches(Element element, Element element2) {
            return this.f36731id.equals(element2.mo33201id());
        }

        public String toString() {
            return String.format("#%s", new Object[]{this.f36731id});
        }
    }

    public static final class IndexEquals extends IndexEvaluator {
        public IndexEquals(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() == this.index;
        }

        public String toString() {
            return String.format(":eq(%d)", new Object[]{Integer.valueOf(this.index)});
        }
    }

    public static abstract class IndexEvaluator extends Evaluator {
        int index;

        public IndexEvaluator(int i) {
            this.index = i;
        }
    }

    public static final class IndexGreaterThan extends IndexEvaluator {
        public IndexGreaterThan(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() > this.index;
        }

        public String toString() {
            return String.format(":gt(%d)", new Object[]{Integer.valueOf(this.index)});
        }
    }

    public static final class IndexLessThan extends IndexEvaluator {
        public IndexLessThan(int i) {
            super(i);
        }

        public boolean matches(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() < this.index;
        }

        public String toString() {
            return String.format(":lt(%d)", new Object[]{Integer.valueOf(this.index)});
        }
    }

    public static final class IsEmpty extends Evaluator {
        public boolean matches(Element element, Element element2) {
            for (Node next : element2.childNodes()) {
                if (!(next instanceof Comment) && !(next instanceof XmlDeclaration) && !(next instanceof DocumentType)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    public static final class IsFirstChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.elementSiblingIndex().intValue() == 0;
        }

        public String toString() {
            return ":first-child";
        }
    }

    public static final class IsFirstOfType extends IsNthOfType {
        public IsFirstOfType() {
            super(0, 1);
        }

        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class IsLastChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document) || element2.elementSiblingIndex().intValue() != parent.children().size() - 1) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public static final class IsLastOfType extends IsNthLastOfType {
        public IsLastOfType() {
            super(0, 1);
        }

        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class IsNthChild extends CssNthEvaluator {
        public IsNthChild(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int calculatePosition(Element element, Element element2) {
            return element2.elementSiblingIndex().intValue() + 1;
        }

        /* access modifiers changed from: protected */
        public String getPseudoClass() {
            return "nth-child";
        }
    }

    public static final class IsNthLastChild extends CssNthEvaluator {
        public IsNthLastChild(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int calculatePosition(Element element, Element element2) {
            return element2.parent().children().size() - element2.elementSiblingIndex().intValue();
        }

        /* access modifiers changed from: protected */
        public String getPseudoClass() {
            return "nth-last-child";
        }
    }

    public static class IsNthLastOfType extends CssNthEvaluator {
        public IsNthLastOfType(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int calculatePosition(Element element, Element element2) {
            Elements children = element2.parent().children();
            int i = 0;
            for (int intValue = element2.elementSiblingIndex().intValue(); intValue < children.size(); intValue++) {
                if (((Element) children.get(intValue)).tag().equals(element2.tag())) {
                    i++;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        public String getPseudoClass() {
            return "nth-last-of-type";
        }
    }

    public static class IsNthOfType extends CssNthEvaluator {
        public IsNthOfType(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: protected */
        public int calculatePosition(Element element, Element element2) {
            Iterator it = element2.parent().children().iterator();
            int i = 0;
            while (it.hasNext()) {
                Element element3 = (Element) it.next();
                if (element3.tag().equals(element2.tag())) {
                    i++;
                    continue;
                }
                if (element3 == element2) {
                    break;
                }
            }
            return i;
        }

        /* access modifiers changed from: protected */
        public String getPseudoClass() {
            return "nth-of-type";
        }
    }

    public static final class IsOnlyChild extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            return parent != null && !(parent instanceof Document) && element2.siblingElements().size() == 0;
        }

        public String toString() {
            return ":only-child";
        }
    }

    public static final class IsOnlyOfType extends Evaluator {
        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            Iterator it = parent.children().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((Element) it.next()).tag().equals(element2.tag())) {
                    i++;
                }
            }
            if (i == 1) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class IsRoot extends Evaluator {
        public boolean matches(Element element, Element element2) {
            if (element instanceof Document) {
                element = element.child(0);
            }
            return element2 == element;
        }

        public String toString() {
            return ":root";
        }
    }

    public static final class Matches extends Evaluator {
        private Pattern pattern;

        public Matches(Pattern pattern2) {
            this.pattern = pattern2;
        }

        public boolean matches(Element element, Element element2) {
            return this.pattern.matcher(element2.text()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", new Object[]{this.pattern});
        }
    }

    public static final class MatchesOwn extends Evaluator {
        private Pattern pattern;

        public MatchesOwn(Pattern pattern2) {
            this.pattern = pattern2;
        }

        public boolean matches(Element element, Element element2) {
            return this.pattern.matcher(element2.ownText()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", new Object[]{this.pattern});
        }
    }

    public static final class Tag extends Evaluator {
        private String tagName;

        public Tag(String str) {
            this.tagName = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.tagName().equalsIgnoreCase(this.tagName);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.tagName});
        }
    }

    public static final class TagEndsWith extends Evaluator {
        private String tagName;

        public TagEndsWith(String str) {
            this.tagName = str;
        }

        public boolean matches(Element element, Element element2) {
            return element2.tagName().endsWith(this.tagName);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.tagName});
        }
    }

    protected Evaluator() {
    }

    public abstract boolean matches(Element element, Element element2);

    public static abstract class CssNthEvaluator extends Evaluator {

        /* renamed from: a */
        protected final int f36729a;

        /* renamed from: b */
        protected final int f36730b;

        public CssNthEvaluator(int i, int i2) {
            this.f36729a = i;
            this.f36730b = i2;
        }

        /* access modifiers changed from: protected */
        public abstract int calculatePosition(Element element, Element element2);

        /* access modifiers changed from: protected */
        public abstract String getPseudoClass();

        public boolean matches(Element element, Element element2) {
            Element parent = element2.parent();
            if (parent == null || (parent instanceof Document)) {
                return false;
            }
            int calculatePosition = calculatePosition(element, element2);
            int i = this.f36729a;
            if (i != 0) {
                int i2 = this.f36730b;
                if ((calculatePosition - i2) * i < 0 || (calculatePosition - i2) % i != 0) {
                    return false;
                }
                return true;
            } else if (calculatePosition == this.f36730b) {
                return true;
            } else {
                return false;
            }
        }

        public String toString() {
            if (this.f36729a == 0) {
                return String.format(":%s(%d)", new Object[]{getPseudoClass(), Integer.valueOf(this.f36730b)});
            } else if (this.f36730b == 0) {
                return String.format(":%s(%dn)", new Object[]{getPseudoClass(), Integer.valueOf(this.f36729a)});
            } else {
                return String.format(":%s(%dn%+d)", new Object[]{getPseudoClass(), Integer.valueOf(this.f36729a), Integer.valueOf(this.f36730b)});
            }
        }

        public CssNthEvaluator(int i) {
            this(0, i);
        }
    }
}
