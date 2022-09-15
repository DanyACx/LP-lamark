Feature: Verificar flujo de LP Batelco
  como cliente dispuesto
  Para jugar y aprender inglés con la app Adventure
  Quiero suscribirme al servicio
  Scenario Outline: Obtener la suscripción del servicio
    Given Ingreso con mi <celular> de dimensiones <ancho> y <alto>
    When Ingreso mi <msisdn>
    And hago click en el botón 'Suscribir'
    And Ingreso el <pincode>
    And hago click en el botón 'Confirmar'
    Then debería figurar el page <suscripcion>
    Examples:
      |    celular	     | ancho | alto |   msisdn    |  pincode  |  suscripcion |
      |   SG-Note-10    | 360   | 740  | 20220912001 |   1111    | successfully |
      |   SG-S7-edge   | 360   | 640  | 20220912002 |   1112    | successfully |
      | SG-S10-Lite | 360   | 800  | 20220912003 |   1113    | successfully |
      | Google-Pixel-XL  | 411   | 731  | 20220912004 |   1114    | successfully |
      | Motorola-Nexus-6  | 412   | 690  | 20220912005 |   1115    | successfully |
      | iPhone-8  | 414   | 736  | 20220912006 |   1116    | successfully |
      | iPhone-11  | 276   | 598  | 20220912007 |   1117    | successfully |
      | iPhone-11-Pro  | 375   | 812  | 20220912008 |   1118    | successfully |
      | iPhone-11-Pro-Max  | 414   | 896  | 20220912009 |   1119    | successfully |
      | iPhone-12  | 390   | 844  | 20220912010 |   1120    | successfully |
      | iPhone-12-Mini  | 360   | 780  | 20220912011 |   1121    | successfully |
      | iPhone-12-Pro | 390   | 844  | 20220912012 |   1122    | successfully |
      | iPhone-12-Pro-Max | 428   | 926  | 20220912013 |   1123    | successfully |
      | iPhone-SE | 412   | 915  | 20220912014 |   1124    | successfully |
      | iPhone-X | 375   | 812  | 20220912015 |   1125    | successfully |
      | iPhone-XR  | 276   | 598  | 20220912016 |   1126    | successfully |
      | iPhone-XS | 375   | 812  | 20220912017 |   1127    | successfully |
      | iPhone-XS-Max | 414   | 896  | 20220912018 |   1128    | successfully |
      | Sony-Xperia-Z  | 360   | 640  | 20220912019 |   1129    | successfully |
      | Sony-Xperia-Z3  | 360   | 598  | 20220912020 |   1130    | successfully |
      | Sony-Xperia-Z4 | 534   | 854  | 20220912021 |   1131   | successfully |
      | Redmi-Note-9-Pro  | 360   | 800  | 20220912022 |   1132    | successfully |
      | Redmi-Note-3  | 360   | 640  | 20220912023 |   1133   | successfully |
      | Redmi-Note-5  | 393   | 786  | 20220912024 |   1134   | successfully |
      | Redmi-Note-9  | 360   | 780  | 20220912025 |   1135    | successfully |
      | Google-Pixel | 411   | 731  | 20220912026 |   1136    | successfully |
      | Microsoft-Lumia-1520 | 432   | 768  | 20220912027 |   1137    | successfully |
      | iPhone-8 | 375   | 667  | 20220912028 |   1138    | successfully |
      | Blackberry-Leap  | 390   | 695  | 20220912029 |   1139    | successfully |
      | LG-Optimus-G  | 384   | 640  | 20220912030 |   1140    | successfully |
      | Galaxy-Nexus  | 360   | 600  | 20220912031 |   1141    | successfully |
      | Galaxy-Note  | 400   | 640  | 20220912032 |   1142    | successfully |
      | Galaxy-Note-2  | 360   |640  | 20220912033 |   1143    | successfully |
      | Kindle-Fire-HD-6| 480   | 800  | 20220912034 |   1144    | successfully |
      | Xperia-P | 360   | 640  | 20220912035 |   1145    | successfully |
      | Galaxy-S20-Ultra  | 480   | 1067  | 20220912036 |   1146    | successfully |



