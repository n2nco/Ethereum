radarrelayWS.js

const WebSocketClient = require('websocket').client;
const client = new WebSocketClient();

client.on('connect', function(connection) {
    console.log('Connected to Server...');

    connection.on('message', function(message) {
      if (message.type === 'utf8') {
        console.log(message.utf8Data);
      }
    });

    function send(message) {
      if (connection.connected) {
          connection.sendUTF(message);
      }
    }

    // subscribe with snapshot
    send(`{
        "type": "subscribe",
        "channel": "orderbook",
        "requestId": 1,
        "payload": {
            "baseTokenAddress": "0xc02aaa39b223fe8d0a0e5c4f27ead9083c756cc2",
            "quoteTokenAddress": "0xe41d2489571d322189246dafa5ebde1f4699f498",
            "snapshot": true,
            "limit": 100
        }
    }`);
});

client.connect('wss://api.radarrelay.com/0x/v0/ws');