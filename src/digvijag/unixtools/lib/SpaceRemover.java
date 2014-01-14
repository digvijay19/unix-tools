package digvijag.unixtools.lib;

public class SpaceRemover {
    public String removeExtraSpaces(String fileData) {
        return fileData.replaceAll(" +", " ");
    }
}
