package parser;

class UnknownCharacterException extends Exception {
  UnknownCharacterException(String unknownInput) {
    super("Unknown character « " + unknownInput + " »");
  }
}
