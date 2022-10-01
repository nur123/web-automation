package slack.cucumber;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result{

	@JsonProperty("duration")
	private Long duration;

	@JsonProperty("status")
	private String status;
}