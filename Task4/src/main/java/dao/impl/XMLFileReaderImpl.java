package dao.impl;

import dao.XMLFileReader;
import static dao.constants.NodeConstants.*;

import java.io.*;

public class XMLFileReaderImpl implements XMLFileReader {
    private long readCharactersCounter = 0;
    private final String BREAKFAST_MENU_FILE_PATH = "src\\main\\resources\\breakfastMenu.xml";
    private BufferedReader in;

    public XMLFileReaderImpl() {}

    @Override
    public String read() {
        try {
            initInputStream();
            int readInt;
            StringBuilder lexeme = new StringBuilder();
            in.skip(readCharactersCounter);
            while((readInt = in.read()) != -1) {
                String readSymbol = String.valueOf((char) readInt);
                readCharactersCounter++;
                if(readSymbol.equals(CARRIAGE_RETURN_CHARACTER) || readSymbol.equals(LINE_FEED_CHARACTER)) {
                    continue;
                }
                lexeme.append(readSymbol);
                if (readSymbol.equals(LAST_BRACKET)) {
                    break;
                } else if (readSymbol.equals(OPEN_BRACKET)) {
                    String trimStringNode = lexeme.toString().trim();
                    lexeme = new StringBuilder(trimStringNode);
                    String firstSymbol = Character.toString(lexeme.charAt(BEGIN_OF_LINE));
                    if (!firstSymbol.equals(OPEN_BRACKET)) {
                        lexeme.deleteCharAt(lexeme.length() - INCLUDING_LAST);
                        readCharactersCounter--;
                        break;
                    }
                }
            }
            if (isXMLDeclaration(lexeme.toString())) {
                lexeme = new StringBuilder(read());
            }
            return lexeme.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        in.close();
    }

    @Override
    public boolean isXMLFileEmpty() {
        try {
            initInputStream();
            in.skip(readCharactersCounter);
            if (in.read() == -1) {
                return true;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

    private void initInputStream() throws FileNotFoundException {
        in = new BufferedReader(new FileReader(new File(BREAKFAST_MENU_FILE_PATH)));
    }

    private boolean isXMLDeclaration (String lexeme) {
        return XML_DECLARATION.matcher(lexeme).find();
    }
}
