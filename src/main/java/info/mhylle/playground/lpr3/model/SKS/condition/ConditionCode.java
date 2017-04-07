package info.mhylle.playground.lpr3.model.SKS.condition;

public enum ConditionCode
{
  DI200B("Klinisk vurderet ustabil angina pectoris"),
  DI200C("Ustabil angina pectoris med dokumenteret isk�mi"),
  DM54("Rygsmerter"),
  DM540("Pannikulitis i nakken eller ryggen"),
  DM540A("Pannikulitis i nakken"),
  DM540B("Pannikulitis i ryggen"),
  DM541("Radikulopati UNS"),
  DM541A("Radiculitis lumbosacralis"),
  DM541B("Radiculitis lumbalis"),
  DM541C("Radiculitis brachialis"),
  DM541D("Radiculitis thoracalis"),
  DM542("Cervikale rygsmerter"),
  DM543("Ischias"),
  DM544("L�ndesmerter med ischias"),
  DM545("L�ndesmerter UNS"),
  DM546("Torakale rygsmerter"),
  DM548("Andre rygsmerter"),
  DM549("Rygsmerter UNS"),
  DR07("Smerter i hals og bryst"),
  DR070("Smerter i sv�lg"),
  DR071("Smerter i thorax ved vejrtr�kning"),
  DR072("Pr�kordialsmerter"),
  DR073("Andre brystsmerter"),
  DR074("Brystsmerter UNS");

  private String code;

  ConditionCode(String code)
  {
    this.code = code;
  }

  public String getCode()
  {
    return code;
  }
}
