package json.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * @author Administrator
 *
 */
public class Treno {

	@SerializedName(value="number")
	private Integer _number;

	@SerializedName(value="departure")
	private String _fromCity;

	@SerializedName(value="arrival")
	private String _toCity;

	private transient String _fullDescription;

	public Treno(Integer number, String from, String to){
		_number = number;
		_fromCity = from;
		_toCity = to;
	}

	public String toString(){
		if (_fullDescription == null)
			_fullDescription = _number+" ["+_fromCity+", "+ _toCity+"]";
		return _fullDescription;
	}
}
