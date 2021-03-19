

/***
 * Atom = Protonen, Elektronen, Neutronen, (Pro = +, Elek = -)
 * Neutrales Element = genauso viele Protonen wie Elektronen
 * Massenzahl = Protonenanzahl + Neutronenanzahl (Elektronen sind egal)
 * Isotop = unterschiedliche Neutronenanzahl zu Protonenanzahl
 *
 * TODO: Finish this
 *
 */
public class Element {

    /**
     * Wichtige Einheiten
     */
    public final double e = 1.602*(double)(10^(-19));// Elementarladung für protonen positiv und elektronen negativ

    /**
     * Informationen aus dem Periodensystem die unveränderbar sind
     */
    private final String name;
    private final String symbol;
    private final byte orderNumber; // Ordnungszahl = Protonenanzahl
    private final float atomMass;
    private final float electroNegativity;
    private final float density; // Dichte
    private final char status; // 's' = solid, 'l' = liquid, 'g' = gas, 'u' = unknown
    private final boolean radioactive; // 0 = not radioactive, 1 = radioactive
    private final boolean natural; // 0 = fake element, 1 = natural element
    private final String kind; // Alkalimetalls and such
    /**
     * Basic constructor for a normal element
     * @param name Name of Element
     * @param symbol period table symbol of element (very important to be correct)
     * @param orderNumber orderNumber = protonnumber
     * @param atomMass
     * @param electroNegativity
     * @param density
     * @param status
     * @param radioactive
     * @param natural
     */
    public Element(String name, String symbol, byte orderNumber, float atomMass, float electroNegativity,
                   float density, char status, boolean radioactive, boolean natural, String kind){
        this.name = name;
        this.symbol = symbol;
        this.orderNumber = orderNumber;
        this.atomMass = atomMass;
        this.electroNegativity = electroNegativity;
        this.density = density;
        this.kind = kind;
        this.natural = natural;
        this.radioactive = radioactive;
        this.status = status;
    }

    public String getName() {
        return name;
    }
    public String getSymbol() {
        return symbol;
    }
    public byte getOrderNumber() {
        return orderNumber;
    }
    public float getAtomMass() {
        return atomMass;
    }
    public float getElectroNegativity() {
        return electroNegativity;
    }
    public float getDensity() {
        return density;
    }
    public char getStatus() {
        return status;
    }
    public boolean isRadioactive() {
        return radioactive;
    }
    public boolean isNatural() {
        return natural;
    }
    public String getKind() {
        return kind;
    }

    public short getProtons(){
        return (short) this.orderNumber;
    }
    public short getNeutrons(){
        return (short)(this.atomMass - this.orderNumber);
    }


    public static void main(String[] args){
        Element e = new Element("Wasserstoff", "H", 1, 1,0, 1.5,'f', true, false, "Nat");
        System.out.println(e.getName());
    }
}