package com.neotys.gremlin.customactions.generated.blackhole;

import com.google.common.base.Optional;
import com.neotys.action.argument.Arguments;
import com.neotys.action.argument.Option;
import com.neotys.extensions.action.ActionParameter;
import com.neotys.extensions.action.engine.ActionEngine;
import com.neotys.gremlin.common.GreminUtils;
import com.neotys.gremlin.common.GremlinAction;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.Icon;

public class BlackholeAction extends GremlinAction {
  @Override
  public String getType() {
    return "Blackhole";
  }

  @Override
  public String getDisplayName() {
    return "Blackhole";
  }

  @Override
  public String getDisplayPath() {
    return "Chaos Engineering/Gremlin/Attack";
  }

  @Override
  public Icon getIcon() {
    return GreminUtils.getGremlinIcon();
  }

  @Override
  public Optional<String> getMinimumNeoLoadVersion() {
    return Optional.of("7.5");
  }

  @Override
  public Optional<String> getMaximumNeoLoadVersion() {
    return Optional.absent();
  }

  @Override
  public String getCustomArgsDescription() {
    return "Drops all matching network traffic\n"
            + "https://www.gremlin.com/docs/infrastructure-layer/attacks/blackhole\n"
            + "\n" + Arguments.getArgumentDescriptions(BlackholeOption.values());
  }

  @Override
  public List<ActionParameter> getCustomActionParameters() {
    return Arrays.stream(BlackholeOption.values()).filter(o -> Option.AppearsByDefault.True.equals(o.getAppearsByDefault())).map(o -> new ActionParameter(o.getName(), o.getDefaultValue(),o.getType())).collect(Collectors.toList());
  }

  @Override
  public Class<? extends ActionEngine> getEngineClass() {
    return BlackholeEngine.class;
  }
}
