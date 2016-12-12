
class LshBinStruct {
	static final private int	TLSH_CHECKSUM_LEN 	= 1;
	static final private int	CODE_SIZE 		= 32;
	
	public int [] 	checksum = new int [TLSH_CHECKSUM_LEN];
	public int	lValue = 0;
	public int	Q = 0;
	public int []	tmpCode = new int [CODE_SIZE];

	public int getQLo() {
		return (int)(Q & 0x0F);
	}

	public int getQHi() {
		return (int)((Q & 0xF0) >> 4);
	}

	public void setQLo(int x) {
		Q = (int)((Q & 0xF0) | (x & 0x0F));
	}

	public void setQHi(int x) {
		Q = (int)((Q & 0x0F) | ((x & 0x0F) << 4));
	}
}